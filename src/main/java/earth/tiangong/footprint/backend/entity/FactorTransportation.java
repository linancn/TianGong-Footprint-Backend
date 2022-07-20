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
@TableName("public.factor_transportation")
public class FactorTransportation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String transportMode;

    private String factorType;

    private Double factor;

    private String unit;

    private Long id;

    private String processId;

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
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
        return "FactorTransportation{" +
            "transportMode=" + transportMode +
            ", factorType=" + factorType +
            ", factor=" + factor +
            ", unit=" + unit +
            ", id=" + id +
            ", processId=" + processId +
        "}";
    }
}
