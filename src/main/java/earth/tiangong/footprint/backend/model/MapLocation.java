package earth.tiangong.footprint.backend.model;

public class MapLocation {
    private String name;

    private Double lng;

    private Double lat;

    private Boolean updateDistance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Boolean getUpdateDistance() {
        return updateDistance;
    }

    public void setUpdateDistance(Boolean updateDistance) {
        this.updateDistance = updateDistance;
    }
}
