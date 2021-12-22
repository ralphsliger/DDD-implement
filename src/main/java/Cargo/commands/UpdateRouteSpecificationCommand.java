package Cargo.commands;

import Cargo.values.ETA;
import Cargo.values.OriginDescription;
import Cargo.values.RouteDestination;
import co.com.sofka.domain.generic.Command;

public class UpdateRouteSpecificationCommand extends Command {
    private final OriginDescription originDescription;
    private final Cargo.values.RouteDestination RouteDestination;
    private final ETA eta;

    public UpdateRouteSpecificationCommand(OriginDescription originDescription, Cargo.values.RouteDestination routeDestination, ETA eta) {
        this.originDescription = originDescription;
        RouteDestination = routeDestination;
        this.eta = eta;
    }

    public OriginDescription getOriginDescription() {
        return originDescription;
    }

    public Cargo.values.RouteDestination getRouteDestination() {
        return RouteDestination;
    }

    public ETA getEta() {
        return eta;
    }
}
