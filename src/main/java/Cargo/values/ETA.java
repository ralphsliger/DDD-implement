package Cargo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ETA implements ValueObject<String> {
    private final String description;

    public ETA(String description) {
        this.description = Objects.requireNonNull(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ETA)) return false;
        ETA eta = (ETA) o;
        return Objects.equals(description, eta.description);
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
