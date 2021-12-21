package Cargo;

import Cargo.events.*;
import Cargo.values.*;
import Generic.AggregateRoot;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Cargo extends AggregateRoot<CargoId> {
    private  BookingAmount bookingAmount;
    private  Location Location;
    private Set<Itinerary> itinerary;
    private  DeliveryContent deliveryContent;

    public Cargo(CargoId cargoId, BookingAmount bookingAmount, Location location, DeliveryContent deliveryContent){
        super(cargoId);
        this.bookingAmount = Objects.requireNonNull(bookingAmount);
        this.Location = Objects.requireNonNull(location);
        this.itinerary = new HashSet<>();
        this.deliveryContent = Objects.requireNonNull(deliveryContent);
        this.applyChange(new CargoCreated(cargoId, bookingAmount, location, this.itinerary, deliveryContent));

    }

    public Cargo(CargoId cargoId, BookingAmount bookingAmount, Location location, Itinerary itinerary, DeliveryContent deliveryContent){
        super(cargoId);
        this.bookingAmount = Objects.requireNonNull(bookingAmount);
        this.Location = Objects.requireNonNull(location);
        this.itinerary = new HashSet<>();
        this.deliveryContent = Objects.requireNonNull(deliveryContent);
        this.applyChange(new CargoCreated(cargoId, bookingAmount, location, this.itinerary, deliveryContent));

    }

    public void updateBookingAmount(BookingAmount bookingAmount){
        this.bookingAmount = bookingAmount;
        this.applyChange(new BookingAmountUpdated(bookingAmount.getAmount()));
    }

    public void addLocation(Location location){
        this.Location = location;
        this.applyChange(new LocationAdded(Objects.requireNonNull(location.originDescription())));
    }


    public void addItinerary(Itinerary itinerary){
            this.itinerary.add(itinerary);
            this.applyChange(new ItineraryAdded(itinerary.getVoyageCode(), itinerary.getFromLocation(), itinerary.getToLocation(), itinerary.getLoadTime(), itinerary.getUnloadTime()));
    }

    public BookingAmount BookingAmount() {
        return bookingAmount;
    }

    public Location Location() {
        return Location;
    }

    public Set<Itinerary> Itinerary() {
        return itinerary;
    }

    public DeliveryContent DeliveryContent() {
        return deliveryContent;
    }
}
