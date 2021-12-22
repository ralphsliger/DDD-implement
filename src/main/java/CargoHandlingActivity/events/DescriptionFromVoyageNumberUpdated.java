package CargoHandlingActivity.events;

import CargoHandlingActivity.values.CHADescription;
import co.com.sofka.domain.generic.DomainEvent;

public class DescriptionFromVoyageNumberUpdated extends DomainEvent {
    private final CHADescription description;

    public DescriptionFromVoyageNumberUpdated(CHADescription description) {
        super("CargoHandlingActivity.events.DescriptionFromVoyageNumberUpdated");
        this.description = description;
    }

    public CHADescription Description() {
        return description;
    }
}
