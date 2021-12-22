package Cargo.commands;

import Cargo.Location;
import Cargo.events.DeliveryContentUpdated;
import Cargo.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateCargoCommandTest {
    @Test
    public void CreateCargo(){
        CargoId id = CargoId.of("XX");
        BookingAmount bookingAmount = new BookingAmount(200.0);
        Location location = new Location(LocationID.of("CTG"), new OriginDescription("PUERTO MAMONAL"));
        DeliveryContent deliveryContent = new DeliveryContent("CHARGED", "ON ROAD", "PUERTO MAMONAL");
        var command = new CreateCargoCommand(id, bookingAmount, location, deliveryContent);

        Assertions.assertEquals("PUERTO MAMONAL", command.getLocation().originDescription().value());

    }
}