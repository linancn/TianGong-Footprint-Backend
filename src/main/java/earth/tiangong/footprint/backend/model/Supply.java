package earth.tiangong.footprint.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Supply {
    private String id;

    private String material;

    private String materialCategory;

    private String materialType;

    private Boolean packaging;

    private Double totalMass;

    private Double co2e;

    private Double sumProcessCo2e;

    private Double sumTransportationCo2e;

    private Double sumAllCo2e;

    private List<Process> process = new ArrayList<Process>();

    private List<Transportation> transportation = new ArrayList<Transportation>();

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

    public List<Process> getProcess() {
        return process;
    }

    public void setProcess(List<Process> process) {
        this.process = process;
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

    public Double getSumProcessCo2e() {
        return sumProcessCo2e;
    }

    public void setSumProcessCo2e(Double sumProcessCo2e) {
        this.sumProcessCo2e = sumProcessCo2e;
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
