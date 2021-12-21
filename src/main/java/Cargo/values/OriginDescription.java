package Cargo.values;

import java.io.Serializable;
import java.util.Objects;

public final class OriginDescription implements Serializable {
    private final String locationDescription;

    public OriginDescription(String locationDescription){
        this.locationDescription = Objects.requireNonNull(locationDescription);
    }

    public String getLocationDescription(){
        return locationDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OriginDescription originDescription = (OriginDescription) o;
        return Objects.equals(locationDescription, originDescription.locationDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationDescription);
    }


}
