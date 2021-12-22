package Cargo.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public final class Itinerary implements ValueObject<Itinerary.Properties> {
    private final String voyageCode;
    private final String fromLocation;
    private final String ToLocation;
    private final String loadTime;
    private final String unloadTime;

    public Itinerary(String voyageCode, String fromLocation, String toLocation, String loadTime, String unloadTime) {
        this.voyageCode = Objects.requireNonNull(voyageCode);
        this.fromLocation = Objects.requireNonNull(fromLocation);
        ToLocation = Objects.requireNonNull(toLocation);
        this.loadTime = Objects.requireNonNull(loadTime);
        this.unloadTime = Objects.requireNonNull(unloadTime);
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String voyageCode() {
                return voyageCode;
            }

            @Override
            public String fromLocation() {
                return fromLocation;
            }

            @Override
            public String ToLocation() {
                return ToLocation;
            }

            @Override
            public String loadTime() {
                return loadTime;
            }

            @Override
            public String unloadTime() {
                return unloadTime;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Itinerary)) return false;
        Itinerary itinerary = (Itinerary) o;
        return Objects.equals(voyageCode, itinerary.voyageCode) && Objects.equals(fromLocation, itinerary.fromLocation) && Objects.equals(ToLocation, itinerary.ToLocation) && Objects.equals(loadTime, itinerary.loadTime) && Objects.equals(unloadTime, itinerary.unloadTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voyageCode, fromLocation, ToLocation, loadTime, unloadTime);
    }

    public interface Properties{
            String voyageCode();
          String fromLocation();
          String ToLocation();
          String loadTime();
          String unloadTime();
    }
}
