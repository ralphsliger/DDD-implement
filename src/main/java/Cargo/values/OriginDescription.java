package Cargo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;
import java.util.Objects;

public final class OriginDescription implements ValueObject<String> {
    private final String locationDescription;

    public OriginDescription(String locationDescription){
        this.locationDescription = Objects.requireNonNull(locationDescription);
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


    @Override
    public String value() {
        return locationDescription;
    }
}
