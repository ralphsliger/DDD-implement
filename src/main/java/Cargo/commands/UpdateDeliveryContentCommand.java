package Cargo.commands;

import co.com.sofka.domain.generic.Command;

public class UpdateDeliveryContentCommand extends Command {
    private  final String transportStatus;
    private  final String routingStatus;
    private  final String lastLocation;

    public UpdateDeliveryContentCommand(String transportStatus, String routingStatus, String lastLocation) {
        this.transportStatus = transportStatus;
        this.routingStatus = routingStatus;
        this.lastLocation = lastLocation;
    }

    public String getTransportStatus() {
        return transportStatus;
    }

    public String getRoutingStatus() {
        return routingStatus;
    }

    public String getLastLocation() {
        return lastLocation;
    }
}
