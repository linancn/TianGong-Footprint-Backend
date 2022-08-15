package earth.tiangong.footprint.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;

    private Double totalMass;

    private MapLocation location = new MapLocation();

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public MapLocation getLocation() {
        return location;
    }

    public void setLocation(MapLocation location) {
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
