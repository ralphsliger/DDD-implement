package CargoHandlingActivity.events;

import CargoHandlingActivity.values.FromLocation;
import co.com.sofka.domain.generic.DomainEvent;

public class FromLocationCargoInfoUpdated  extends DomainEvent {
    private final FromLocation fromLocation;

    public FromLocationCargoInfoUpdated(FromLocation fromLocation) {
        super("CargoHandlingActivity.events.CargoHandlingLocationAdded");
        this.fromLocation = fromLocation;
    }

    public FromLocation FromLocation() {
        return fromLocation;
    }
}
