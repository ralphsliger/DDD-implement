package Generic;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Id implements Serializable {

    private final String value;

    public Id(){
        this(UUID.randomUUID().toString());
    }

    public Id(String value){
        this.value = Objects.requireNonNull(value, "Value is required");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Value can't be empty");
        }
    }

    public String getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id = (Id) o;
        return Objects.equals(value, id.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
