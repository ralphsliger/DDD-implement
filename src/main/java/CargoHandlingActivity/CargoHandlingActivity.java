package CargoHandlingActivity;

import CargoHandlingActivity.values.CargoHandlingActivityID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class CargoHandlingActivity extends AggregateEvent<CargoHandlingActivityID> {

    protected CargoHandlingActivityLocation location;
    protected VoyageNumber voyageNumber;
    protected CargoInfo cargoInfo;

    public CargoHandlingActivity(CargoHandlingActivityID entityId, CargoHandlingActivityLocation location, VoyageNumber voyageNumber, CargoInfo cargoInfo) {
        super(entityId);
        this.location = Objects.requireNonNull(location);
        this.voyageNumber = Objects.requireNonNull(voyageNumber);
        this.cargoInfo = Objects.requireNonNull(cargoInfo);
    }
}
