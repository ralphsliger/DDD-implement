package CargoHandlingActivity.commands;

import CargoHandlingActivity.values.ToLocation;
import co.com.sofka.domain.generic.Command;

public class UpdateToLocationFromCargoInfo extends Command {
    private final ToLocation toLocation;

    public UpdateToLocationFromCargoInfo(ToLocation toLocation) {
        this.toLocation = toLocation;
    }

    public ToLocation getToLocation() {
        return toLocation;
    }
}
