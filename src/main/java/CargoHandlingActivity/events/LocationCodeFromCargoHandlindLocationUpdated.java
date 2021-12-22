package CargoHandlingActivity.events;

import CargoHandlingActivity.values.LocationCode;
import co.com.sofka.domain.generic.DomainEvent;

public class LocationCodeFromCargoHandlindLocationUpdated extends DomainEvent {
    private final LocationCode code;

    public LocationCodeFromCargoHandlindLocationUpdated(LocationCode code) {
        super("CargoHandlingActivity.events.LocationCodeFromCargoHandlindLocationUpdated");
        this.code = code;
    }

    public LocationCode getCode() {
        return code;
    }
}
