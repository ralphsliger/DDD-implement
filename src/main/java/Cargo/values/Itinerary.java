package Cargo.values;

import java.io.Serializable;
import java.util.Objects;

public final class Itinerary implements Serializable {
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

    public String getVoyageCode() {
        return voyageCode;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return ToLocation;
    }

    public String getLoadTime() {
        return loadTime;
    }

    public String getUnloadTime() {
        return unloadTime;
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
}
