package CargoHandlingActivity.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class LocationCode implements ValueObject<String> {
    private final String description;

    public LocationCode(String description) {

        this.description =Objects.requireNonNull(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocationCode)) return false;
        LocationCode that = (LocationCode) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String value() {
        return description;
    }
}
