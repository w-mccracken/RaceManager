package model;

public class Racer extends User {
    private String creditCardInfo;
    private int catLevel;
    private License license;

    public void browseRaces() { }
    public void raceSignUp(Race race) { }
    public License purchaseLicense() { return license; }
    public void reviewRace(Race race, String comment, int rating) { }
    public boolean hasLicense() { return license != null; }
    public void receiveNotification(String msg) {
        System.out.println("[Racer Notification] " + msg);
    }

    // getters/setters ...
}
