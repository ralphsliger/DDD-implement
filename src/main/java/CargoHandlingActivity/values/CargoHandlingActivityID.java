package CargoHandlingActivity.values;


import co.com.sofka.domain.generic.Identity;

public class CargoHandlingActivityID extends Identity {

    public CargoHandlingActivityID(String uuid) {
        super(uuid);
    }

    public CargoHandlingActivityID() {
    }

    public static CargoHandlingActivityID of(String value){
        return new CargoHandlingActivityID(value);
    }
}
