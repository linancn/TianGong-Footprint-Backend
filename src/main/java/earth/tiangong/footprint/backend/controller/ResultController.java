package earth.tiangong.footprint.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import earth.tiangong.footprint.backend.entity.FactorElectricity;
import earth.tiangong.footprint.backend.entity.FactorMaterial;
import earth.tiangong.footprint.backend.entity.FactorMaterialProcess;
import earth.tiangong.footprint.backend.entity.FactorTransportation;
import earth.tiangong.footprint.backend.model.Destination;
import earth.tiangong.footprint.backend.model.Processing;
import earth.tiangong.footprint.backend.model.Project;
import earth.tiangong.footprint.backend.model.Supply;
import earth.tiangong.footprint.backend.model.Transportation;
import earth.tiangong.footprint.backend.service.IFactorElectricityService;
import earth.tiangong.footprint.backend.service.IFactorMaterialProcessService;
import earth.tiangong.footprint.backend.service.IFactorMaterialService;
import earth.tiangong.footprint.backend.service.IFactorTransportationService;

import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private IFactorElectricityService iFactorElectricityService;

    @Autowired
    private IFactorMaterialService iFactorMaterialService;

    @Autowired
    private IFactorMaterialProcessService iFactorMaterialProcessService;

    @Autowired
    private IFactorTransportationService iFactorTransportationService;

    @PostMapping("/getResult")
    public ResponseEntity<Project> getResult(@RequestBody Project data) {

        FactorElectricity edata = iFactorElectricityService.getByRegionAndSource(data.getLocation(), data.getElectricitySource());
        data.setElectricityCo2e(data.getElectricity() * data.getRatio() / 100 * edata.getFactor());

        data.setSumSupplyCo2e((double) 0);
        for (Supply s : data.getSupply()) {
            FactorMaterial sdata = iFactorMaterialService.getByMaterialType(s.getMaterialType());
            s.setCo2e(s.getTotalMass() * sdata.getFactor());
            s.setSumProcessingCo2e((double) 0);
            for (Processing p : s.getProcessing()) {
                FactorMaterialProcess pdata = iFactorMaterialProcessService.getByProcessType(s.getMaterialType(), p.getProcessCategory(), p.getProcessType());
                p.setCo2e(s.getTotalMass() * pdata.getFactor());
                s.setSumProcessingCo2e(s.getSumProcessingCo2e() + p.getCo2e());
            }
            s.setSumTransportationCo2e((double) 0);
            for (Transportation t : s.getTransportation()) {
                FactorTransportation tdata = iFactorTransportationService.getByTransportMode(t.getTransportMode());
                t.setCo2e(t.getDistance() * tdata.getFactor());
                s.setSumTransportationCo2e(s.getSumTransportationCo2e() + t.getCo2e());
            }
            s.setSumAllCo2e(s.getCo2e() + s.getSumProcessingCo2e() + s.getSumTransportationCo2e());
            data.setSumSupplyCo2e(data.getSumSupplyCo2e() + s.getSumAllCo2e());
        }

        data.setSumDestinationCo2e((double) 0);
        for (Destination d : data.getDestination()) {
            FactorTransportation ddata = iFactorTransportationService.getByTransportMode(d.getTransportMode());
            d.setCo2e(d.getDistance() * ddata.getFactor());
            data.setSumDestinationCo2e(data.getSumDestinationCo2e() + d.getCo2e());
        }
        data.setSumAllCo2e(data.getManufactureCo2e() + data.getElectricityCo2e() + data.getSumSupplyCo2e() + data.getSumDestinationCo2e());
        return ok(data);
    }
}