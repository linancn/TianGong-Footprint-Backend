package earth.tiangong.footprint.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-19
 */
@TableName("public.factor_material_process")
public class FactorMaterialProcess implements Serializable {

    private static final long serialVersionUID = 1L;

    private String materialType;

    private String processCategory;

    private String processType;

    private String factorType;

    private Double factor;

    private String unit;

    private Long id;

    private String processId;

    private String processMethod;

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
    public String getProcessCategory() {
        return processCategory;
    }

    public void setProcessCategory(String processCategory) {
        this.processCategory = processCategory;
    }
    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }
    public String getFactorType() {
        return factorType;
    }

    public void setFactorType(String factorType) {
        this.factorType = factorType;
    }
    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }
    public String getProcessMethod() {
        return processMethod;
    }

    public void setProcessMethod(String processMethod) {
        this.processMethod = processMethod;
    }

    @Override
    public String toString() {
        return "FactorMaterialProcess{" +
            "materialType=" + materialType +
            ", processCategory=" + processCategory +
            ", processType=" + processType +
            ", factorType=" + factorType +
            ", factor=" + factor +
            ", unit=" + unit +
            ", id=" + id +
            ", processId=" + processId +
            ", processMethod=" + processMethod +
        "}";
    }
}
