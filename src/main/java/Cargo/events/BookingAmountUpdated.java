package Cargo.events;

import Generic.DomainEvent;

public class BookingAmountUpdated extends DomainEvent {
    private final Double amount;

    public BookingAmountUpdated(Double amount) {
        super("Cargo.events.BookingAmountUpdated");
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }



}
