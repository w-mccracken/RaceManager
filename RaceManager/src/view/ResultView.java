package view;

import controller.ResultController;
import model.RaceResult;

public class ResultView {
    private final ResultController controller;

    public ResultView(ResultController controller) { this.controller = controller; }

    public void displayResults(RaceResult result) {
        System.out.println(result.viewResults());
    }

    public void submitResults(RaceResult result) {
        controller.handleEnterResults(result);
    }
}


