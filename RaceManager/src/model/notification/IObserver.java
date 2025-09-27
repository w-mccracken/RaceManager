package model.notification;

public interface IObserver {
    void update(String eventType, String data);
}
