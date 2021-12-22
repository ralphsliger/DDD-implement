package CargoHandlingActivity;

import CargoHandlingActivity.events.CargoHandlingActivityCreated;
import CargoHandlingActivity.events.DescriptionFromCargoInfoUpdated;
import CargoHandlingActivity.values.CHADescription;
import CargoHandlingActivity.values.CargoInfoID;
import co.com.sofka.domain.generic.EventChange;

public class CargoHandlingActivityChange extends EventChange {

    public CargoHandlingActivityChange(CargoHandlingActivity cargoHandlingActivity){
        apply((CargoHandlingActivityCreated event)->{
            cargoHandlingActivity.location = event.getLocation();
            cargoHandlingActivity.voyageNumber= event.getVoyageNumber();
            cargoHandlingActivity.cargoInfo= event.getCargoInfo();
        });

    }
}
