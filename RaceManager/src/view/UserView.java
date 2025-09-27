package view;

import controller.UserController;
import model.User;

public class UserView {
    private final UserController controller;

    public UserView(UserController controller) {
        this.controller = controller;
    }

    public void displayLoginForm() { /* prompt user */ }
    public void displayProfile(User user) { /* render */ }
}
