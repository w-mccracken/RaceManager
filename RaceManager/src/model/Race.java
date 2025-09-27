package model;

import java.util.Date;
import java.util.List;

public class Race {
    private String raceID;
    private Date raceDate;
    private String type;
    private double miles;
    private String route;
    private boolean officialRace;
    private int participantLimit;
    private Date lastRegistrationDate;
    private int catRequired;
    private List<RaceReview> reviews;

    public Race() {}
    public Race(String raceID) { this.raceID = raceID; }

    @Override
    public String toString() { return "Race#" + raceID; }

    // getters/setters (only what we need here)
    public String getRaceID() { return raceID; }
    public void setRaceID(String raceID) { this.raceID = raceID; }
}

