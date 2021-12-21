package Cargo.values;

import java.io.Serializable;
import java.util.Objects;

public final class DeliveryContent implements Serializable {
    private final String transportStatus;
    private final String routingStatus;
    private final String lastLocation;

    public DeliveryContent(String transportStatus, String routingStatus, String lastLocation) {
        this.transportStatus = Objects.requireNonNull(transportStatus);
        this.routingStatus = Objects.requireNonNull(routingStatus);
        this.lastLocation = Objects.requireNonNull(lastLocation);
    }

    public String getTransportStatus() {
        return transportStatus;
    }

    public String getRoutingStatus() {
        return routingStatus;
    }

    public String getLastLocation() {
        return lastLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeliveryContent)) return false;
        DeliveryContent that = (DeliveryContent) o;
        return Objects.equals(transportStatus, that.transportStatus) && Objects.equals(routingStatus, that.routingStatus) && Objects.equals(lastLocation, that.lastLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportStatus, routingStatus, lastLocation);
    }
}
