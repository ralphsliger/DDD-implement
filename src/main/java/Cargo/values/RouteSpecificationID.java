package Cargo.values;

import co.com.sofka.domain.generic.Identity;

public class RouteSpecificationID extends Identity {

    private RouteSpecificationID(String value){
        super(value);
    }

    RouteSpecificationID(){

    }

    public RouteSpecificationID of(String value){
        return new RouteSpecificationID(value);
    }


}
