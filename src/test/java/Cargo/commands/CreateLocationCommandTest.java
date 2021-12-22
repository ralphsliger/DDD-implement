package Cargo.commands;

import Cargo.values.LocationID;
import Cargo.values.OriginDescription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateLocationCommandTest {
@Test
    public void CreateLocation(){
    LocationID id = LocationID.of("CTG");

    var command = new CreateLocationCommand(id, new OriginDescription("Puerto Mamonal"));

    Assertions.assertEquals("Puerto Mamonal",command.getOriginDescription().value());

}
}