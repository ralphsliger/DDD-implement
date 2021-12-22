package Cargo.commands;

import Cargo.Cargo;
import Cargo.Location;
import Cargo.values.*;
import co.com.sofka.business.repository.DomainEventRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class AddItineraryCommandTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void addItinerary(){
        Cargo cargo = new Cargo(new CargoId(),new BookingAmount(200.0), new Location(LocationID.of("RUS"), new OriginDescription("San Petersburgo")),new DeliveryContent("ACTIVE", "WAIT", "RUS"));
        String voyageCode = "XX";
        String fromLocation = "CTG";
        String toLocation = "COV";
        String loadTime = "1600";
        String unloadTime = "1700";
        cargo.addItinerary(voyageCode, fromLocation, toLocation, loadTime, unloadTime);
        Assertions.assertEquals(cargo.Itinerary().size(), 2);

    }

}