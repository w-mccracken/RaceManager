package model;

import java.util.*;

public class RaceSystem {
    private List<User> users = new ArrayList<>();
    private List<Race> availableRaces = new ArrayList<>();
    private List<RaceResult> raceHistory = new ArrayList<>();

    private static int nextRaceId = 0;
    private static final Map<String, Race> races = new HashMap<>();



    public void registerUser(User user) { users.add(user); }

    public List<Race> findRaceByDate(Date d) {
        // TODO: filter by date
        return availableRaces;
    }

    public void upgradeCategory(Racer racer) {
        // TODO
    }

    // getters/setters ...


    public Race createRace(Date date, String type, double miles, String route, boolean official, int limit, Date lastRegDate, int catRequired) {
        String id = "R" + (++nextRaceId);
        Race race = new Race(id);
        race.setRaceDate(date);
        race.setType(type);
        race.setMiles(miles);
        race.setRoute(route);
        race.setOfficialRace(official);
        race.setParticipantLimit(limit);
        race.setLastRegistrationDate(lastRegDate);
        race.setCatRequired(catRequired);

        races.put(id, race);

        // Observer hook (simplified for now)
        System.out.println("Notification: Race created -> " + id);

        return race;
    }

    public List<Race> getAllRaces() {
        return new ArrayList<>(races.values());
    }






}
