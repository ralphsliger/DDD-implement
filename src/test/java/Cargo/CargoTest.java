package Cargo;

import Cargo.values.*;

import org.junit.jupiter.api.Test;
import Cargo.Location;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CargoTest {

    @Test
    public void updateBookingAmount(){
        var cargo = new Cargo(new CargoId(),new BookingAmount(200.0),
                new Location(new LocationID(), new OriginDescription("Covenas")),
                new DeliveryContent("OnRoad",
                                    "Charged",
                                    "Cartagena Port")
                );

       cargo.updateBookingAmount(new BookingAmount(300.0));

       assertEquals(300.0 , cargo.BookingAmount().getAmount());

    }
    @Test
    public void addLocation(){
        var cargo = new Cargo(new CargoId(),new BookingAmount(200.0),
                new Location(new LocationID(), new OriginDescription("Covenas")),
                new DeliveryContent("OnRoad",
                        "Charged",
                        "Cartagena Port")
        );
        cargo.addLocation(new Location(new LocationID(), new OriginDescription("Cartagena")));
        assertEquals("Cartagena" , cargo.Location().originDescription().getLocationDescription());
    }

    @Test
    public void addItinerary(){


        var cargo = new Cargo(new CargoId(),new BookingAmount(200.0),
                new Location(new LocationID(), new OriginDescription("Covenas")),
                new DeliveryContent("OnRoad",
                        "Charged",
                        "Cartagena Port")
        );

        cargo.addItinerary(new Itinerary("xxx", "Cartagena", "Covenas", "1600", "1700"));
        assertEquals(cargo.Itinerary().size(), 1);
    }


}