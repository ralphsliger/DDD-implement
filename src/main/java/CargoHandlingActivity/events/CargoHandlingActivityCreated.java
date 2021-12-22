package CargoHandlingActivity.events;

import CargoHandlingActivity.CargoHandlingActivityLocation;
import CargoHandlingActivity.CargoInfo;
import CargoHandlingActivity.VoyageNumber;
import co.com.sofka.domain.generic.DomainEvent;

public class CargoHandlingActivityCreated extends DomainEvent {

    private final CargoHandlingActivityLocation location;
    private final VoyageNumber voyageNumber;
    private final CargoInfo cargoInfo;

    public CargoHandlingActivityCreated(CargoHandlingActivityLocation location, VoyageNumber voyageNumber, CargoInfo cargoInfo) {
        super("CargoHandlingActivity.events.DescriptionFromCargoInfoUpdated");
        this.location= location;
        this.voyageNumber=voyageNumber;
        this.cargoInfo=cargoInfo;
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
