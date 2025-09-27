package controller;

import model.Administrator;
import model.notification.NotificationCenter;

public class AdminController {
    private final NotificationCenter notificationCenter = new NotificationCenter();

    public void handleManageAccounts() { }
    public void handleManageLicenses() { }
    public void handleSystemSettings() {
        notificationCenter.publish("SYSTEM_SETTINGS", "Settings updated");
    }

    public NotificationCenter getNotificationCenter() { return notificationCenter; }
}

