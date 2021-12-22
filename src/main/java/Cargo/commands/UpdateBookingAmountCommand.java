package Cargo.commands;

import co.com.sofka.domain.generic.Command;

public class UpdateBookingAmountCommand extends Command {
    private final Double amount;

    public UpdateBookingAmountCommand(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }
}
