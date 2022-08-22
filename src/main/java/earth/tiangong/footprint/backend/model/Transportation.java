package earth.tiangong.footprint.backend.model;

// import org.springframework.beans.factory.annotation.Autowired;

// import earth.tiangong.footprint.backend.entity.FactorTransportation;
// import earth.tiangong.footprint.backend.service.IFactorTransportationService;

public class Transportation {
    private String id;

    private Double supplierPercentage;

    private MapLocation supplierLocation = new MapLocation();

    private TransportMode transportMode;

    private Double distance;

    private Double co2e;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSupplierPercentage() {
        return supplierPercentage;
    }

    public void setSupplierPercentage(Double supplierPercentage) {
        this.supplierPercentage = supplierPercentage;
    }

    public MapLocation getSupplierLocation() {
        return supplierLocation;
    }

    public void setSupplierLocation(MapLocation supplierLocation) {
        this.supplierLocation = supplierLocation;
    }

    public TransportMode getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getCo2e() {
        return co2e;
    }

    public void setCo2e(Double co2e) {
        this.co2e = co2e;
    }
}
