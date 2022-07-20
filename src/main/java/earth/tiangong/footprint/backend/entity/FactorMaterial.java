package earth.tiangong.footprint.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author TianGongFootprint
 * @since 2022-07-18
 */
@TableName("public.factor_material")
public class FactorMaterial implements Serializable {

    private static final long serialVersionUID = 1L;

    private String processMethod;

    private String materialCategory;

    private String materialType;

    private String factorType;

    private Double factor;

    private String unit;

    private Long id;

    private String processId;

    public String getProcessMethod() {
        return processMethod;
    }

    public void setProcessMethod(String processMethod) {
        this.processMethod = processMethod;
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

    @Override
    public String toString() {
        return "FactorMaterial{" +
            "processMethod=" + processMethod +
            ", materialCategory=" + materialCategory +
            ", materialType=" + materialType +
            ", factorType=" + factorType +
            ", factor=" + factor +
            ", unit=" + unit +
            ", id=" + id +
            ", processId=" + processId +
        "}";
    }
}
