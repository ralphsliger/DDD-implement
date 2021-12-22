package CargoHandlingActivity.commands;

import CargoHandlingActivity.CargoHandlingActivityLocation;
import CargoHandlingActivity.CargoInfo;
import CargoHandlingActivity.VoyageNumber;
import CargoHandlingActivity.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatedCargoHandlingActivityTest {

    @Test
    public void create_cargoHandling(){
        CargoHandlingActivityID id = CargoHandlingActivityID.of("12");
        CargoHandlingActivityLocation location = new CargoHandlingActivityLocation(new CargoHandlingActivityLocationID(),new LocationCode("CTG"));
        CHADescription desc = new CHADescription("VIAJE COLOMBIA");
        VoyageNumber voyage = new VoyageNumber(new VoyageNumberID(), new CHADescription("VIAJE COLOMBIA"));
        CargoInfo cargoInfo = new CargoInfo(new CargoInfoID(), new FromLocation("ctg"), new ToLocation("bog"), desc);
        CreatedCargoHandlingActivity cargo = new CreatedCargoHandlingActivity(id, location, voyage, cargoInfo);

        Assertions.assertEquals("VIAJE COLOMBIA", cargo.getVoyageNumber().Description().value());
    }

}