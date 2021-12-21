package Cargo;

import Cargo.values.LocationID;
import Cargo.values.OriginDescription;
import Generic.Entity;

import java.util.Objects;

public class Location extends Entity<LocationID> {
    private OriginDescription originDescription;

    public Location(LocationID locationID, OriginDescription originDescription){
        super(locationID);
        this.originDescription = Objects.requireNonNull(originDescription);
    }

    public OriginDescription originDescription(){
        return originDescription;
    }

    public void updateOriginDescription(OriginDescription originDescription){
        this.originDescription = originDescription;
    }

}
