package Cargo.commands;

import Cargo.values.OriginDescription;
import co.com.sofka.domain.generic.Command;

public class UpdateOriginDescriptionFromLocationCommand extends Command {
    private final OriginDescription originDescription;

    public UpdateOriginDescriptionFromLocationCommand(OriginDescription originDescription) {
        this.originDescription = originDescription;
    }
}
