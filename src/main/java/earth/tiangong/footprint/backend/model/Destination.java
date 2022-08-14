package earth.tiangong.footprint.backend.model;

// import org.springframework.beans.factory.annotation.Autowired;

// import earth.tiangong.footprint.backend.entity.FactorTransportation;
// import earth.tiangong.footprint.backend.service.IFactorTransportationService;

public class Destination {
    private String id;

    private Double destinationPercentage;

    private MapLocation destinationLocation;

    private String transportMode;

    private Double distance;

    private Double co2e;

    // @Autowired
    // private IFactorTransportationService iFactorTransportationService;

    // public void calculate() {
    // FactorTransportation data =
    // iFactorTransportationService.getByTransportMode(transportMode);
    // co2e = distance * data.getFactor();
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getDestinationPercentage() {
        return destinationPercentage;
    }

    public void setDestinationPercentage(Double destinationPercentage) {
        this.destinationPercentage = destinationPercentage;
    }

    public MapLocation getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(MapLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
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
