package Cargo.values;

import Generic.Id;

public final class CargoId extends Id {

    private CargoId(String value){
        super(value);
    }

    public CargoId(){
    }

    public static CargoId of(String value){
        return new CargoId(value);
    }
}
