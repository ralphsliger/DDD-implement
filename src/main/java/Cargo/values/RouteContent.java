package Cargo.values;

import java.io.Serializable;
import java.util.Objects;

public final class RouteContent implements Serializable {
    private final String originLocation;
    private final String destinationLocation;
    private final String estimatedTimeOfArrival;

    public RouteContent(String originLocation, String destinationLocation, String estimatedTimeOfArrival) {
        this.originLocation = Objects.requireNonNull(originLocation);
        this.destinationLocation = Objects.requireNonNull(destinationLocation);
        this.estimatedTimeOfArrival = Objects.requireNonNull(estimatedTimeOfArrival);
    }

    public String getOriginLocation() {
        return originLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public String getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RouteContent)) return false;
        RouteContent that = (RouteContent) o;
        return Objects.equals(originLocation, that.originLocation) && Objects.equals(destinationLocation, that.destinationLocation) && Objects.equals(estimatedTimeOfArrival, that.estimatedTimeOfArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originLocation, destinationLocation, estimatedTimeOfArrival);
    }
}
