package Views;

import Controllers.SignInController;

public class SignInView {
    private static String username;
    private static String password;
    public static String[] signInOptions = new String[] {
            "Sign out",
            "Cart",
            "Account setting"
    };

    public static boolean signIn() {
        prompt();
        if (SignInController.signIn(username, password)) {
            System.out.println("Welcome back " + username + '!');
            return true;
        } else {
            System.out.println("Error: Wrong username or password.");
            return false;
        }

    }
    private static void prompt() {
        System.out.println("Please type your username and password");
        username = Console.readOption("Username: ");
        password = Console.readOption("Password: ");
    }
}
