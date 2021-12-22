package CargoHandlingActivity;

import CargoHandlingActivity.events.CargoHandlingActivityCreated;
import CargoHandlingActivity.values.CargoHandlingActivityID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class CargoHandlingActivity extends AggregateEvent<CargoHandlingActivityID> {

    protected CargoHandlingActivityLocation location;
    protected VoyageNumber voyageNumber;
    protected CargoInfo cargoInfo;

    public CargoHandlingActivity(CargoHandlingActivityID entityId, CargoHandlingActivityLocation location, VoyageNumber voyageNumber, CargoInfo cargoInfo) {
        super(entityId);
        subscribe(new CargoHandlingActivityChange(this));
        appendChange(new CargoHandlingActivityCreated(location, voyageNumber, cargoInfo)).apply();
    }

    public CargoHandlingActivity(CargoHandlingActivityID id){
        super(id);
        subscribe(new CargoHandlingActivityChange(this));
    }

    public static CargoHandlingActivity from(CargoHandlingActivityID id, List<DomainEvent> events){
        var cha = new CargoHandlingActivity(id);
        events.forEach(cha::applyEvent);
        return cha;
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
