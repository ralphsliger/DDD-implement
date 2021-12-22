package CargoHandlingActivity.values;

import co.com.sofka.domain.generic.Identity;

public class VoyageNumberID extends Identity {
    public VoyageNumberID(String value){
        super(value);
    }

    public VoyageNumberID() {
    }

    public static VoyageNumberID of(String value) {
        return new VoyageNumberID(value);
    }

}
