package CargoHandlingActivity.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class CHADescription implements ValueObject<String> {
    private final String description;

    public CHADescription(String description) {
        this.description = Objects.requireNonNull(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CHADescription)) return false;
        CHADescription that = (CHADescription) o;
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
