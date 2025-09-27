package controller;

import model.RaceReview;
import model.notification.NotificationCenter;

public class ReviewController {
    private final NotificationCenter notificationCenter = new NotificationCenter();

    public void handleSubmitReview(RaceReview review) {
        // TODO: persist
        notificationCenter.publish("NEW_REVIEW", "New review: " + review.getRating() + " stars");
    }

    public void handleViewReviews(int raceId) { }

    public NotificationCenter getNotificationCenter() { return notificationCenter; }
}

