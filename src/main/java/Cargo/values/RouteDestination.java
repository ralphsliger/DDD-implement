package Cargo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RouteDestination implements ValueObject<String> {
    private final String description;

    public RouteDestination(String description){
        this.description= Objects.requireNonNull(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RouteDestination)) return false;
        RouteDestination that = (RouteDestination) o;
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
