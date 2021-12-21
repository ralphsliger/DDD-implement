package Cargo.values;

import Cargo.Location;
import Generic.Id;

public class LocationID extends Id {
    private LocationID(String value){
        super(value);
    }

    public LocationID(){

    }
    public static  LocationID of(String value){ return new LocationID(value);}
}
