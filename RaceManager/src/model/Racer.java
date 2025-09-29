package model;


public class Racer extends User {
    private String creditCardInfo;
    private int catLevel;
    private License license;


    public void browseRaces() {
        // Implementation for browsing available races
        System.out.println("Browsing available races...");
    }

    public void raceSignUp(Race race) {
        // Implementation for signing up to a race
        if (race != null) {
            System.out.println("Signing up for race: " + race.getRaceID());
        }
    }

    public License purchaseLicense() {
        // Implementation for purchasing a license
        if (this.license == null) {
            this.license = new License();
            System.out.println("License purchased successfully");
        }
        return this.license;
    }

    public void reviewRace(Race race, String comment, int rating) {
        // Implementation for reviewing a race
        if (race != null && comment != null) {
            System.out.println("Reviewing race " + race.getRaceID() +
                    " with rating: " + rating + " and comment: " + comment);
        }
    }

    public boolean hasLicense() {
        // Check if racer has a valid license
        return this.license != null;
    }

    public void receiveNotification(String msg) {
        // Implementation for receiving notifications
        if (msg != null) {
            System.out.println("[Racer Notification] " + msg);
        }
    }


    // Getters and Setters
    public String getCreditCardInfo() {
        return creditCardInfo;
    }


    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }


    public int getCatLevel() {
        return catLevel;
    }


    public void setCatLevel(int catLevel) {
        this.catLevel = catLevel;
    }


    public License getLicense() {
        return license;
    }


    public void setLicense(License license) {
        this.license = license;
    }
}







