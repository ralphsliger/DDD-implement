package Cargo.events;

import Cargo.values.DeliveryContent;
import co.com.sofka.domain.generic.DomainEvent;

public class DeliveryContentUpdated extends DomainEvent {

    private final DeliveryContent DeliveryContent;


    public DeliveryContentUpdated(DeliveryContent DeliveryContent) {
        super("Cargo.events.DeliveryContentUpdated");
        this.DeliveryContent = DeliveryContent;
    }

    public DeliveryContent getDeliveryContent() {
        return DeliveryContent;
    }
}
