package views;

import controllers.SignInController;
import models.User;

public class SignInView {
    private static String username;
    private static String password;
    public static String[] signInOptions = new String[] {
            "Sign out",
            "Cart",
            "Account setting"
    };

    public static User signIn() {
        prompt();
        return SignInController.signIn(username, password);
    }
    private static void prompt() {
        System.out.println("Please type your username and password");
        username = Console.readOption("Username: ");
        password = Console.readOption("Password: ");
    }
}
