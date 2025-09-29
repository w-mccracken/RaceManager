package view;

import controller.RaceController;
import model.Race;
import model.RaceSystem;

import java.util.List;
import java.util.Scanner;


public class RaceView {
    private final RaceController controller;
    private final RaceSystem raceSystem;

    public RaceView(RaceController controller, RaceSystem raceSystem) { this.controller = controller;
    this.raceSystem=raceSystem;}

    public void displayRaceList(List<Race> races) { }
    public void displayRaceDetails(Race race) { }
    public void promptSignUp(Race race) { /* ask for method/details, call controller */ }

    //**********************
    public void promptCreateRace() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter race date (MM/dd/yyyy): ");
        String date = sc.nextLine();

        System.out.print("Enter race type: ");
        String type = sc.nextLine();

        System.out.print("Enter miles (numeric): ");
        String miles = sc.nextLine();

        System.out.print("Enter route: ");
        String route = sc.nextLine();

        System.out.print("Is this an official race? (true/false): ");
        String official = sc.nextLine();

        System.out.print("Enter participant limit (numeric): ");
        String limit = sc.nextLine();

        System.out.print("Enter last registration date (MM/dd/yyyy): ");
        String lastReg = sc.nextLine();

        System.out.print("Enter required category (1-5): ");
        String cat = sc.nextLine();

        controller.handleCreateRace(date, type, miles, route, official, limit, lastReg, cat);
    }


    /**
     * Display all available races from RaceSystem
     */
    public void displayRaceList() {
        List<Race> races = raceSystem.getAllRaces();

        System.out.println("\n=== Available Races ===");
        if (races.isEmpty()) {
            System.out.println("No races available.");
            return;
        }

        for (Race r : races) {
            System.out.println("- " + r);
        }
    }


    //**************************

}

