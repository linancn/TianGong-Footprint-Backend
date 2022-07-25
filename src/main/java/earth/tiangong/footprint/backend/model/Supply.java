package earth.tiangong.footprint.backend.model;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

// import earth.tiangong.footprint.backend.entity.FactorMaterial;
// import earth.tiangong.footprint.backend.service.IFactorMaterialService;

public class Supply {
    private String id;

    private String material;

    private String materialCategory;

    private String materialType;

    private Boolean packaging;

    private Double totalMass;

    private Double co2e;

    private Double sumProcessingCo2e;

    private Double sumTransportationCo2e;

    private Double sumAllCo2e;

    private List<Processing> processing = new ArrayList<Processing>();

    private List<Transportation> transportation = new ArrayList<Transportation>();

    // @Autowired
    // private IFactorMaterialService iFactorMaterialService;

    // public void calculate() {
    //     FactorMaterial data = iFactorMaterialService.getByMaterialType(materialType);
    //     co2e = totalMass * data.getFactor();
    //     sumProcessingCo2e = (double) 0;
    //     for (Processing p : processing) {
    //         sumProcessingCo2e = sumProcessingCo2e + p.getCo2e();
    //     }
    //     sumTransportationCo2e = (double) 0;
    //     for (Transportation t : transportation) {
    //         sumTransportationCo2e = sumTransportationCo2e + t.getCo2e();
    //     }
    //     sumAllCo2e = co2e + sumProcessingCo2e + sumTransportationCo2e;
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterialCategory() {
        return materialCategory;
    }

    public void setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public Boolean getPackaging() {
        return packaging;
    }

    public void setPackaging(Boolean packaging) {
        this.packaging = packaging;
    }

    public Double getTotalMass() {
        return totalMass;
    }

    public void setTotalMass(Double totalMass) {
        this.totalMass = totalMass;
    }

    public List<Processing> getProcessing() {
        return processing;
    }

    public void setProcessing(List<Processing> processing) {
        this.processing = processing;
    }

    public List<Transportation> getTransportation() {
        return transportation;
    }

    public void setTransportation(List<Transportation> transportation) {
        this.transportation = transportation;
    }

    public Double getCo2e() {
        return co2e;
    }

    public void setCo2e(Double co2e) {
        this.co2e = co2e;
    }

    public Double getSumProcessingCo2e() {
        return sumProcessingCo2e;
    }

    public void setSumProcessingCo2e(Double sumProcessingCo2e) {
        this.sumProcessingCo2e = sumProcessingCo2e;
    }

    public Double getSumTransportationCo2e() {
        return sumTransportationCo2e;
    }

    public void setSumTransportationCo2e(Double sumTransportationCo2e) {
        this.sumTransportationCo2e = sumTransportationCo2e;
    }

    public Double getSumAllCo2e() {
        return sumAllCo2e;
    }

    public void setSumAllCo2e(Double sumAllCo2e) {
        this.sumAllCo2e = sumAllCo2e;
    }
}
