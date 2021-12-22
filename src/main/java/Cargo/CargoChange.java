package Cargo;

import Cargo.events.*;
import Cargo.values.BookingAmount;
import Cargo.values.Itinerary;
import Cargo.values.LocationID;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CargoChange extends EventChange {

    public CargoChange(Cargo cargo){
        apply((CargoCreated event)->{
            cargo.bookingAmount = event.getBookingAmount();
            cargo.Location = event.getLocation();
            cargo.deliveryContent = event.getDeliveryContent();
            cargo.itinerary = new HashSet<>();
        });

        apply((ItineraryAdded event)->{
           cargo.itinerary.add(new Itinerary(
                   event.getVoyageCode(),
                   event.getFromLocation(),
                   event.getToLocation(),
                   event.getUnloadTime(),
                   event.getVoyageCode()
           ));
        });

        apply((LocationAdded event)->{
           cargo.Location = new Location(new LocationID(),event.getOriginDescription());
        });

        apply((DeliveryContentUpdated event)->{
            cargo.deliveryContent = event.getDeliveryContent();
        });

        apply((BookingAmountUpdated event)->{
           cargo.bookingAmount = new BookingAmount(event.getAmount());
        });



    }
}
