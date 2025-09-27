package view;

import controller.ReviewController;
import model.RaceReview;

import java.util.List;

public class ReviewView {
    private final ReviewController controller;

    public ReviewView(ReviewController controller) { this.controller = controller; }

    public void displayReviews(List<?> reviews) { }
    // Original plural method kept for compatibility:
    public void submitReviews(List<RaceReview> reviews) {
        for (RaceReview r : reviews) controller.handleSubmitReview(r);
    }
    // Preferred single-item method (aligns with controller):
    public void submitReview(RaceReview review) {
        controller.handleSubmitReview(review);
    }
}

