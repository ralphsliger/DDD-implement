package Cargo.commands;

import Cargo.values.LocationID;
import Cargo.values.OriginDescription;
import co.com.sofka.domain.generic.Command;

public class AddLocationCommand extends Command {
    private final LocationID locationID;
    private final OriginDescription originDescription;

    public AddLocationCommand(LocationID locationID, OriginDescription originDescription) {
        this.locationID=locationID;
        this.originDescription = originDescription;
    }

    public OriginDescription getOriginDescription() {
        return originDescription;
    }
}
