package CargoHandlingActivity.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class FromLocation implements ValueObject<String> {
    private final String description;

    public FromLocation(String description) {
        this.description =Objects.requireNonNull(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FromLocation)) return false;
        FromLocation that = (FromLocation) o;
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
