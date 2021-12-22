package CargoHandlingActivity.commands;

import CargoHandlingActivity.values.CHADescription;
import co.com.sofka.domain.generic.Command;

public class UpdateDescriptionFromCargoInfo extends Command {
    private final CHADescription description;

    public UpdateDescriptionFromCargoInfo(CHADescription description) {
        this.description = description;
    }

    public CHADescription getDescription() {
        return description;
    }

}
