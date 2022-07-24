package earth.tiangong.footprint.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import earth.tiangong.footprint.backend.model.SelectItemData;
import earth.tiangong.footprint.backend.service.IFactorElectricityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import static org.springframework.http.ResponseEntity.ok;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-18
 */
@Controller
@RequestMapping("/factorElectricity")
public class FactorElectricityController {
    @Autowired
    private IFactorElectricityService iFactorElectricityService;
    
    @GetMapping("/getElectricitySourceSelectItems")
    public ResponseEntity<List<SelectItemData>> getElectricitySourceSelectItems() throws Exception {
        return ok(iFactorElectricityService.getElectricitySourceSelectItems());
    }
}
