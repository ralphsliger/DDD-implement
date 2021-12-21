package Cargo.events;

import Cargo.values.OriginDescription;
import Generic.DomainEvent;

public class LocationAdded extends DomainEvent {

    private final OriginDescription originDescription;

    public LocationAdded(OriginDescription originDescription) {
        super("Cargo.events.LocationAdded");
        this.originDescription = originDescription;
    }

    public OriginDescription getOriginDescription() {
        return originDescription;
    }
}
