package model;

import java.util.Map;

public class RaceResult {
    private Race race;
    private Map<String, String> times; // bib/name -> time
    private Racer[] podium = new Racer[3];

    public RaceResult() {}
    public RaceResult(Race race) { this.race = race; }

    public void notifyRacer(Racer racer) {
        // Placeholder hook (notifications go via controllers in this design)
    }

    public String viewResults() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Results for ").append(race != null ? race.toString() : "Race").append(" ===\n");
        if (times != null) {
            times.forEach((k, v) -> sb.append(k).append(": ").append(v).append("\n"));
        }
        sb.append("Podium: ");
        if (podium != null) {
            for (int i = 0; i < podium.length; i++) {
                if (podium[i] != null) {
                    sb.append((i + 1)).append(". ")
                      .append(podium[i].getName() != null ? podium[i].getName() : "Racer")
                      .append("  ");
                }
            }
        }
        return sb.toString();
    }

    // getters/setters
    public Race getRace() { return race; }
    public void setRace(Race race) { this.race = race; }
    public Map<String, String> getTimes() { return times; }
    public void setTimes(Map<String, String> times) { this.times = times; }
    public Racer[] getPodium() { return podium; }
    public void setPodium(Racer[] podium) { this.podium = podium; }
}

