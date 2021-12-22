package CargoHandlingActivity.commands;

import CargoHandlingActivity.values.FromLocation;
import co.com.sofka.domain.generic.Command;

public class UpdateFromLocationFromCargoInfo extends Command {
    private final FromLocation fromLocation;

    public UpdateFromLocationFromCargoInfo(FromLocation fromLocation) {
        this.fromLocation = fromLocation;
    }

    public FromLocation getFromLocation() {
        return fromLocation;
    }
}
