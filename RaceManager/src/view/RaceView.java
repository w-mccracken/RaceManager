package view;

import controller.RaceController;
import model.Race;

import java.util.List;

public class RaceView {
    private final RaceController controller;

    public RaceView(RaceController controller) { this.controller = controller; }

    public void displayRaceList(List<Race> races) { }
    public void displayRaceDetails(Race race) { }
    public void promptSignUp(Race race) { /* ask for method/details, call controller */ }
}

