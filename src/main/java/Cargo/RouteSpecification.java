package Cargo;

import Cargo.values.ETA;
import Cargo.values.OriginDescription;
import Cargo.values.RouteSpecificationID;
import co.com.sofka.domain.generic.Entity;
import Cargo.values.RouteDestination;

import java.util.Objects;

public class RouteSpecification extends Entity<RouteSpecificationID> {
    private OriginDescription originDescription;
    private RouteDestination RouteDestination;
    private ETA eta;

    public RouteSpecification(RouteSpecificationID entityId, OriginDescription originDescription, RouteDestination RouteDestination, ETA eta ) {
        super(entityId);
        this.originDescription = Objects.requireNonNull(originDescription);
        this.RouteDestination = Objects.requireNonNull(RouteDestination);
        this.eta = Objects.requireNonNull(eta);
    }

    public OriginDescription getOriginDescription() {
        return originDescription;
    }

    public void setOriginDescription(OriginDescription originDescription) {
        this.originDescription = originDescription;
    }

    public RouteDestination getRouteDestination() {
        return RouteDestination;
    }

    public void setRouteDestination(RouteDestination routeDestination) {
        RouteDestination = routeDestination;
    }

    public ETA getEta() {
        return eta;
    }

    public void setEta(ETA eta) {
        this.eta = eta;
    }
}
