package CargoHandlingActivity;

import CargoHandlingActivity.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class CargoHandlingActivityLocation  extends Entity<CargoHandlingActivityLocationID> {

    private LocationCode code;

    public CargoHandlingActivityLocation(CargoHandlingActivityLocationID id, LocationCode code) {
        super(id);
        this.code= Objects.requireNonNull(code);
    }

    public LocationCode Code() {
        return code;
    }
}
