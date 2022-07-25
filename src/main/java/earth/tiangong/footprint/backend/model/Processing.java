package earth.tiangong.footprint.backend.model;

// import org.springframework.beans.factory.annotation.Autowired;

// import earth.tiangong.footprint.backend.entity.FactorMaterialProcess;
// import earth.tiangong.footprint.backend.service.IFactorMaterialProcessService;

public class Processing {
    private String id;

    private String processType;

    private String processCategory;

    private Double co2e;

    // @Autowired
    // private IFactorMaterialProcessService iFactorMaterialProcessService;

    // public void calculate(String materialType, Double totalMass) {
    //     FactorMaterialProcess data = iFactorMaterialProcessService.getByProcessType(materialType, processCategory, processType);
    //     co2e = totalMass * data.getFactor();
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public String getProcessCategory() {
        return processCategory;
    }

    public void setProcessCategory(String processCategory) {
        this.processCategory = processCategory;
    }

    public Double getCo2e() {
        return co2e;
    }

    public void setCo2e(Double co2e) {
        this.co2e = co2e;
    }
}
