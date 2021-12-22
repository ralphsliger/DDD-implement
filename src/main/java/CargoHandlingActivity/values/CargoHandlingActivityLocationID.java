package CargoHandlingActivity.values;

import co.com.sofka.domain.generic.Identity;

public class CargoHandlingActivityLocationID extends Identity {

    public CargoHandlingActivityLocationID(String value){
        super(value);
    }

    public  CargoHandlingActivityLocationID(){
    }

    public static CargoHandlingActivityID of(String value){
        return new CargoHandlingActivityID(value);
    }



}
