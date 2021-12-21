package Cargo.values;

import java.io.Serializable;
import java.util.Objects;

public final class BookingAmount implements Serializable {
    private final Double amount;

    public BookingAmount(Double amount){
        this.amount = Objects.requireNonNull(amount, "Amount couldn't be null");
        if(0>=this.amount){
            throw new IllegalArgumentException("amount couldn't be negative or zero");
        }
    }

    public Double getAmount(){
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingAmount bookingAmount = (BookingAmount) o;
        return Objects.equals(amount, bookingAmount.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
