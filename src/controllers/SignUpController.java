package controllers;

import data.UserRepository;
import models.User;
import views.Console;

public class SignUpController {
    public static void SignUp(String email, String username, String password, boolean isAdmin) {
        // TODO: validation
        if (UserRepository.findByUsername(username) != null) {
            System.out.println("Username is already taken.");
            return;
        }

        var user = new User(email, username, password, isAdmin);
        // TODO: save to database
        UserRepository.add(user);
    }
}
