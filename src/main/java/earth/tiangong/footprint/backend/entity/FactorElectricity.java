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
@TableName("public.factor_electricity")
public class FactorElectricity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String region;

    private String electricitySource;

    private String factorType;

    private Double factor;

    private String unit;

    private Long id;

    private String processId;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String getElectricitySource() {
        return electricitySource;
    }

    public void setElectricitySource(String electricitySource) {
        this.electricitySource = electricitySource;
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
        return "FactorElectricity{" +
            "region=" + region +
            ", electricitySource=" + electricitySource +
            ", factorType=" + factorType +
            ", factor=" + factor +
            ", unit=" + unit +
            ", id=" + id +
            ", processId=" + processId +
        "}";
    }
}
