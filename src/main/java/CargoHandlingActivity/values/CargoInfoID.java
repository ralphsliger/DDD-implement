package CargoHandlingActivity.values;

import co.com.sofka.domain.generic.Identity;

public class CargoInfoID extends Identity {
    public CargoInfoID(String uuid) {
        super(uuid);
    }

    public CargoInfoID() {
    }

    public static CargoInfoID of(String value){
        return new CargoInfoID(value);
    }
}
