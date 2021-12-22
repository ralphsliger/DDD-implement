package Cargo.commands;

import co.com.sofka.domain.generic.Command;

public class AddItineraryCommand extends Command {
    private final String voyageCode;
    private final String fromLocation;
    private final String ToLocation;
    private final String loadTime;
    private final String unloadTime;

    public AddItineraryCommand(String voyageCode, String fromLocation, String toLocation, String loadTime, String unloadTime) {
        this.voyageCode = voyageCode;
        this.fromLocation = fromLocation;
        ToLocation = toLocation;
        this.loadTime = loadTime;
        this.unloadTime = unloadTime;
    }

    public String getVoyageCode() {
        return voyageCode;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return ToLocation;
    }

    public String getLoadTime() {
        return loadTime;
    }

    public String getUnloadTime() {
        return unloadTime;
    }
}
