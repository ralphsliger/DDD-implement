package Generic;

import java.util.HashSet;
import java.util.Set;

public class AggregateRoot<I extends  Id> extends Entity<Id> {
    private Set<DomainEvent> events;

    public AggregateRoot(Id id) {
        super(id);
        this.events = new HashSet<>();
    }

    public void applyChange(DomainEvent event){
        event.setAggregateId(getId());
        events.add(event);
    }

    public Set<DomainEvent> getChanges(){
        return events;
    }
}
