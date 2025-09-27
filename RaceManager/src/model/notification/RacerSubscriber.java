package model.notification;

import model.Racer;

public class RacerSubscriber implements IObserver {
    private final Racer racer;

    public RacerSubscriber(Racer racer) { this.racer = racer; }

    @Override
    public void update(String eventType, String data) {
        // Delegate to Racer domain behavior
        racer.receiveNotification("[" + eventType + "] " + data);
    }
}
