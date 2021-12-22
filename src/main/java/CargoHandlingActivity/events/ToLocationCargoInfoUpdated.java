package CargoHandlingActivity.events;

import CargoHandlingActivity.values.ToLocation;
import co.com.sofka.domain.generic.DomainEvent;

public class ToLocationCargoInfoUpdated extends DomainEvent {
    private final ToLocation toLocation;

    public ToLocationCargoInfoUpdated(ToLocation toLocation) {
        super("CargoHandlingActivity.events.ToLocationCargoInfoUpdated");
        this.toLocation = toLocation;
    }

    public ToLocation getToLocation() {
        return toLocation;
    }
}
