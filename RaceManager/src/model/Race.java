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
    private static int counterRace = 1;

    public Race() {}
    public Race(String raceID) { this.raceID = raceID; }

    public String getRaceID() { return raceID; }
    public void setRaceDate(Date raceDate) { this.raceDate = raceDate; }
    public void setType(String type) { this.type = type; }
    public void setMiles(double miles) { this.miles = miles; }
    public void setRoute(String route) { this.route = route; }
    public void setOfficialRace(boolean officialRace) { this.officialRace = officialRace; }
    public void setParticipantLimit(int participantLimit) { this.participantLimit = participantLimit; }
    public void setLastRegistrationDate(Date lastRegistrationDate) { this.lastRegistrationDate = lastRegistrationDate; }
    public void setCatRequired(int catRequired) { this.catRequired = catRequired; }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + raceID + '\'' +
                ", date=" + raceDate +
                ", type='" + type + '\'' +
                ", miles=" + miles +
                ", route='" + route + '\'' +
                ", official=" + officialRace +
                ", limit=" + participantLimit +
                ", lastRegistrationDate=" + lastRegistrationDate +
                ", catRequired=" + catRequired +
                '}';
    }

}

