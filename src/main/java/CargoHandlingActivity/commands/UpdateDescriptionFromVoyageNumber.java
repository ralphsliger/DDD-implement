package CargoHandlingActivity.commands;

import CargoHandlingActivity.values.CHADescription;
import co.com.sofka.domain.generic.Command;


public class UpdateDescriptionFromVoyageNumber extends Command {
    private final CHADescription description;

    public UpdateDescriptionFromVoyageNumber(CHADescription description){
        this.description=description;
    }
    public CHADescription getDescription() {
        return description;
    }
}
