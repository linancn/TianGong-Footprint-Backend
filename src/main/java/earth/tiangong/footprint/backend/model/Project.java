package earth.tiangong.footprint.backend.model;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

// import earth.tiangong.footprint.backend.entity.FactorElectricity;
// import earth.tiangong.footprint.backend.service.IFactorElectricityService;

public class Project {
    private String projectName;

    private String location;

    private Double totalMass;

    private String electricitySource;

    private Double electricity;

    private Double ratio;

    private Double electricityCo2e;

    private Double manufactureCo2e;

    private Double sumSupplyCo2e;

    private Double sumDestinationCo2e;

    private Double sumAllCo2e;

    private List<Supply> supply = new ArrayList<Supply>();

    private List<Destination> destination = new ArrayList<Destination>();

    // @Autowired
    // private IFactorElectricityService iFactorElectricityService;

    // public void calculate() {
    //     FactorElectricity edata = iFactorElectricityService.getByRegionAndSource(location, electricitySource);
    //     electricityCo2e = electricity * ratio / 100 * edata.getFactor();
    //     sumSupplyCo2e = (double) 0;
    //     for (Supply s : supply) {
    //         sumSupplyCo2e = sumSupplyCo2e + s.getSumAllCo2e();
    //     }
    //     sumDestinationCo2e = (double) 0;
    //     for (Destination d : destination) {
    //         sumDestinationCo2e = sumDestinationCo2e + d.getCo2e();
    //     }
    //     sumAllCo2e = manufactureCo2e + electricityCo2e + sumSupplyCo2e + sumDestinationCo2e;
    // }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getTotalMass() {
        return totalMass;
    }

    public void setTotalMass(Double totalMass) {
        this.totalMass = totalMass;
    }

    public String getElectricitySource() {
        return electricitySource;
    }

    public void setElectricitySource(String electricitySource) {
        this.electricitySource = electricitySource;
    }

    public Double getElectricity() {
        return electricity;
    }

    public void setElectricity(Double electricity) {
        this.electricity = electricity;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public Double getManufactureCo2e() {
        return manufactureCo2e;
    }

    public void setManufactureCo2e(Double manufactureCo2e) {
        this.manufactureCo2e = manufactureCo2e;
    }

    public Double getElectricityCo2e() {
        return electricityCo2e;
    }

    public void setElectricityCo2e(Double electricityCo2e) {
        this.electricityCo2e = electricityCo2e;
    }

    public Double getSumSupplyCo2e() {
        return sumSupplyCo2e;
    }

    public void setSumSupplyCo2e(Double sumSupplyCo2e) {
        this.sumSupplyCo2e = sumSupplyCo2e;
    }

    public Double getSumDestinationCo2e() {
        return sumDestinationCo2e;
    }

    public void setSumDestinationCo2e(Double sumDestinationCo2e) {
        this.sumDestinationCo2e = sumDestinationCo2e;
    }

    public Double getSumAllCo2e() {
        return sumAllCo2e;
    }

    public void setSumAllCo2e(Double sumAllCo2e) {
        this.sumAllCo2e = sumAllCo2e;
    }

    public List<Supply> getSupply() {
        return supply;
    }

    public void setSupply(List<Supply> supply) {
        this.supply = supply;
    }

    public List<Destination> getDestination() {
        return destination;
    }

    public void setDestination(List<Destination> destination) {
        this.destination = destination;
    }
}
