package CargoHandlingActivity;

import CargoHandlingActivity.values.CHADescription;
import CargoHandlingActivity.values.VoyageNumberID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class VoyageNumber  extends Entity<VoyageNumberID> {
    CHADescription description;

    public VoyageNumber(VoyageNumberID id, CHADescription description) {
        super(id);
        this.description= Objects.requireNonNull(description);
    }


    public CHADescription Description() {
        return description;
    }
}
