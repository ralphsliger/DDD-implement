package CargoHandlingActivity.commands;

import CargoHandlingActivity.CargoHandlingActivityLocation;
import CargoHandlingActivity.CargoInfo;
import CargoHandlingActivity.VoyageNumber;
import CargoHandlingActivity.values.CargoHandlingActivityID;
import co.com.sofka.domain.generic.Command;

public class CreatedCargoHandlingActivity  extends Command {
    private final CargoHandlingActivityID CargoHandlingActivityID;
    private final CargoHandlingActivityLocation location;
    private final VoyageNumber voyageNumber;
    private final CargoInfo cargoInfo;

    public CreatedCargoHandlingActivity(CargoHandlingActivityID CargoHandlingActivityID, CargoHandlingActivityLocation location, VoyageNumber voyageNumber, CargoInfo cargoInfo) {
        this.CargoHandlingActivityID=CargoHandlingActivityID;
        this.location = location;
        this.voyageNumber = voyageNumber;
        this.cargoInfo = cargoInfo;
    }

    public CargoHandlingActivity.values.CargoHandlingActivityID getCargoHandlingActivityID() {
        return CargoHandlingActivityID;
    }

    public CargoHandlingActivityLocation getLocation() {
        return location;
    }

    public VoyageNumber getVoyageNumber() {
        return voyageNumber;
    }

    public CargoInfo getCargoInfo() {
        return cargoInfo;
    }
}
