package controller;

import model.RaceSystem;
import model.User;
import model.Racer;



public class UserController {
    private final RaceSystem raceSystem;

    public UserController(RaceSystem raceSystem){
        this.raceSystem=raceSystem;
    }
    public void handleLogin(String email, String password) { }
    public void handleRegister(User user) { }



}

