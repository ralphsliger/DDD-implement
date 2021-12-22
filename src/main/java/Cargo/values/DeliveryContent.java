package Cargo.values;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class DeliveryContent implements ValueObject<DeliveryContent.Properties> {
    private  final String transportStatus;
    private  final String routingStatus;
    private  final String lastLocation;

    public DeliveryContent(String transportStatus, String routingStatus, String lastLocation) {
        this.transportStatus = Objects.requireNonNull(transportStatus);
        this.routingStatus = Objects.requireNonNull(routingStatus);
        this.lastLocation = Objects.requireNonNull(lastLocation);
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

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String transportStatus() {
                return transportStatus;
            }

            @Override
            public String routingStatus() {
                return routingStatus;
            }

            @Override
            public String lastLocation() {
                return lastLocation;
            }
        };
    }

    public interface Properties{
        String transportStatus();
        String routingStatus();
        String lastLocation();
    }

}
