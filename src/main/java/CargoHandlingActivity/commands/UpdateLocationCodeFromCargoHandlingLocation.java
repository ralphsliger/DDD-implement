package CargoHandlingActivity.commands;

import CargoHandlingActivity.values.LocationCode;
import co.com.sofka.domain.generic.Command;

public class UpdateLocationCodeFromCargoHandlingLocation extends Command {
    private final LocationCode code;

    public UpdateLocationCodeFromCargoHandlingLocation(LocationCode code) {
        this.code = code;
    }

    public LocationCode getCode() {
        return code;
    }
}
