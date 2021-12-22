package Cargo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;
import java.util.Objects;

public final class BookingAmount implements ValueObject<Double> {
    private final Double amount;

    public BookingAmount(Double amount){
        this.amount = Objects.requireNonNull(amount, "Amount couldn't be null");
        if(0>=this.amount){
            throw new IllegalArgumentException("amount couldn't be negative or zero");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookingAmount)) return false;
        BookingAmount that = (BookingAmount) o;
        return Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public Double value() {
        return amount;
    }
}
