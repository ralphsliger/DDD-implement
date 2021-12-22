package Cargo.commands;

import Cargo.Location;
import Cargo.values.BookingAmount;
import Cargo.values.CargoId;
import Cargo.values.DeliveryContent;
import Cargo.values.Itinerary;
import co.com.sofka.domain.generic.Command;

import java.util.HashSet;
import java.util.Set;

public class CreateCargoCommand extends Command {
    private final CargoId cargoId;
    private final BookingAmount bookingAmount;
    private final Location location;
    private final DeliveryContent deliveryContent;
    private final Set<Itinerary> itinerary;

    public CreateCargoCommand(CargoId cargoId,BookingAmount bookingAmount, Location location, DeliveryContent deliveryContent) {
        this.cargoId = cargoId;
        this.bookingAmount = bookingAmount;
        this.location = location;
        this.itinerary = new HashSet<>();
        this.deliveryContent = deliveryContent;
    }


    public BookingAmount getBookingAmount() {
        return bookingAmount;
    }

    public Location getLocation() {
        return location;
    }

    public DeliveryContent getDeliveryContent() {
        return deliveryContent;
    }
}
