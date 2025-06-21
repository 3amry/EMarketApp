package Controllers;

import Models.User;

public class SignUpController {
    public static User SignUp(String email, String username, String password, boolean isAdmin) {
        // TODO: validation
        var user = new User(email, username, password, isAdmin);
        // TODO: save to database
        return user;
    }
}
