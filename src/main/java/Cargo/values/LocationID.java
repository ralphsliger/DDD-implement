package Cargo.values;

import co.com.sofka.domain.generic.Identity;

public class LocationID extends Identity {
    private LocationID(String value){
        super(value);
    }

    public LocationID(){

    }
    public static  LocationID of(String value){ return new LocationID(value);}
}
