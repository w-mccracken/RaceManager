package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaceSystem {
    private List<User> users = new ArrayList<>();
    private List<Race> availableRaces = new ArrayList<>();
    private List<RaceResult> raceHistory = new ArrayList<>();

    public void registerUser(User user) { users.add(user); }

    public List<Race> findRaceByDate(Date d) {
        // TODO: filter by date
        return availableRaces;
    }

    public void upgradeCategory(Racer racer) {
        // TODO
    }

    // getters/setters ...
}
