package CargoHandlingActivity;

import CargoHandlingActivity.values.CHADescription;
import CargoHandlingActivity.values.CargoInfoID;
import CargoHandlingActivity.values.FromLocation;
import CargoHandlingActivity.values.ToLocation;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class CargoInfo extends Entity<CargoInfoID> {
    private FromLocation fromLocation;
    private ToLocation toLocation;
    private CHADescription description;

    public CargoInfo(CargoInfoID id, FromLocation fromLocation, ToLocation toLocation, CHADescription description) {
        super(id);
        this.fromLocation = Objects.requireNonNull(fromLocation);
        this.toLocation=Objects.requireNonNull(toLocation);
        this.description=Objects.requireNonNull(description);
    }

    public FromLocation FromLocation() {
        return fromLocation;
    }

    public ToLocation ToLocation() {
        return toLocation;
    }

    public CHADescription Description() {
        return description;
    }
}
