package view;

import java.util.Scanner;

public class MainMenuView {
    private final UserView userView;
    private final RaceView raceView;
    private final ResultView resultView;
    private final ReviewView reviewView;
    private final RacerView racerView;

    public MainMenuView(UserView userView, RaceView raceView, ResultView resultView, ReviewView reviewView, RacerView racerView) {
        this.userView = userView;
        this.raceView = raceView;
        this.resultView = resultView;
        this.reviewView = reviewView;
        this.racerView=racerView;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Menu:");

            System.out.println("0. Create Race");
            System.out.println("1. Browse Races");
            System.out.println("2. Create Racer");
            System.out.println("3. View Results");
            System.out.println("4. Submit Review");
            System.out.println("5. View Reviews");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch (choice) {
                case 0:
                    raceView.promptCreateRace();
                    break;
                case 1:
                    raceView.displayRaceList();
                    // Where to get list of races from?
                    //raceView.displayRaceList();
                    break;
                case 2:
                    racerView.promptCreateRacer();
                    //userView.signUpForRace();
                    //var racer = racerView.selectRaceForSignup();
                    break;
                case 3:
                    //System.out.println("Enter raceID: ");
                    // Controller needs to handle converting raceID String to actual RaceResult
                    //resultView.displayResults(...);
                    break;
                case 4:
                    //reviewView.submitReview();
                    var race1 = racerView.selectRaceForReview();
                    String comment = racerView.getReviewComment();
                    int rating = racerView.getReviewRating();
                    break;
                case 5:
                    // Reviews need to be obtained
                    //reviewView.displayReviews(get Reviews);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println();
        }
    }
}
