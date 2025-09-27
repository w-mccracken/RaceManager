package controller;

import model.RaceResult;
import model.notification.RaceNotifications;

public class ResultController {
    private final RaceNotifications raceNotifications = new RaceNotifications();

    public void handleEnterResults(RaceResult result) {
        // TODO: persist / compute podium
        raceNotifications.publishRaceEvent("RESULTS_POSTED", "Results posted for race");
    }

    public void handleViewResults(int raceId) { }

    public RaceNotifications getRaceNotifications() { return raceNotifications; }
}
