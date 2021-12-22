package Cargo.values;


import co.com.sofka.domain.generic.Identity;

public final class CargoId extends Identity {

    private CargoId(String value){
        super(value);
    }

    public CargoId(){
    }

    public static CargoId of(String value){
        return new CargoId(value);
    }
}
