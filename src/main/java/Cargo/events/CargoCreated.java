package Cargo.events;

import Cargo.Location;
import Cargo.values.BookingAmount;
import Cargo.values.CargoId;
import Cargo.values.DeliveryContent;
import Cargo.values.Itinerary;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class CargoCreated extends DomainEvent {
    private final BookingAmount bookingAmount;
    private final Location location;
    private final DeliveryContent deliveryContent;

    public CargoCreated(BookingAmount bookingAmount, Location location, DeliveryContent deliveryContent) {
        super("Cargo.events.CargoCreated");
        this.bookingAmount = bookingAmount;
        this.location = location;
        this.deliveryContent = deliveryContent;
    }

    public BookingAmount getBookingAmount() {
        return bookingAmount;
    }

    public Location getLocation() {
        return location;
    }

    public DeliveryContent getDeliveryContent() {
        return deliveryContent;
    }
}
