package Cargo;

import Cargo.events.CargoCreated;
import Cargo.events.ItineraryAdded;
import Cargo.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;


import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class Cargo extends AggregateEvent<CargoId> {
    protected   BookingAmount bookingAmount;
    protected   Location Location;
    protected Set<Itinerary> itinerary;
    protected   DeliveryContent deliveryContent;

    public Cargo(CargoId cargoId, BookingAmount bookingAmount, Location location, DeliveryContent deliveryContent){
        super(cargoId);
        subscribe(new CargoChange(this));
        appendChange(new CargoCreated(bookingAmount, location, deliveryContent)).apply();
    }

    public Cargo(CargoId cargoId){
        super(cargoId);
        subscribe(new CargoChange(this));
    }

    public static Cargo from(CargoId cargoId, List<DomainEvent> events){
        var cargo = new Cargo(cargoId);
        events.forEach(cargo::applyEvent);
        return cargo;
    }

    public void addItinerary(String voyageCode, String fromLocation, String ToLocation, String loadTime, String unloadTime){
        this.itinerary.add(new Itinerary(voyageCode, fromLocation, ToLocation, loadTime, unloadTime));
        appendChange(new ItineraryAdded(voyageCode, fromLocation, ToLocation, loadTime, unloadTime)).apply();
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
