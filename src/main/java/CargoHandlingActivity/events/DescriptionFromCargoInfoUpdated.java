package CargoHandlingActivity.events;

import CargoHandlingActivity.values.CHADescription;
import co.com.sofka.domain.generic.DomainEvent;

public class DescriptionFromCargoInfoUpdated extends DomainEvent {
    private final CHADescription description;

    public DescriptionFromCargoInfoUpdated(CHADescription description) {
        super("CargoHandlingActivity.events.DescriptionFromCargoInfoUpdated");
        this.description = description;
    }

    public CHADescription Description() {
        return description;
    }
}
