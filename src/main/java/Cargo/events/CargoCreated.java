package Cargo.events;

import Cargo.Cargo;
import Cargo.Location;
import Cargo.values.BookingAmount;
import Cargo.values.CargoId;
import Cargo.values.DeliveryContent;
import Cargo.values.Itinerary;
import Generic.DomainEvent;

import java.util.Set;

public class CargoCreated extends DomainEvent {
    private final CargoId id;
    private final BookingAmount bookingAmount;
    private final Location location;
    private final Set<Itinerary> itinerary;
    private final DeliveryContent deliveryContent;

    public CargoCreated(CargoId id, BookingAmount bookingAmount, Location location, Set<Itinerary> itinerary, DeliveryContent deliveryContent) {
        super("Cargo.events.CargoCreated");
        this.id = id;
        this.bookingAmount = bookingAmount;
        this.location = location;
        this.itinerary = itinerary;
        this.deliveryContent = deliveryContent;
    }

    public CargoId getId() {
        return id;
    }

    public BookingAmount getBookingAmount() {
        return bookingAmount;
    }

    public Location getLocation() {
        return location;
    }

    public Set<Itinerary> getItinerary() {
        return itinerary;
    }

    public DeliveryContent getDeliveryContent() {
        return deliveryContent;
    }
}
