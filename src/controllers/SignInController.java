package controllers;

import data.UserRepository;
import models.User;

public class SignInController {
    public static User signIn(String username, String password) {
        User user = UserRepository.findByUsername(username);
        if (user == null || !password.equals(user.getPassword())) {
            return null;
        }

        System.out.println("Welcome " + username);
        return user;
    }
}
