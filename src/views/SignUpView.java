package views;

import controllers.SignUpController;

public class SignUpView {
    public static void signUp() {
        SignUpController.SignUp(
                Console.readOption("Email: "),
                Console.readOption("Username: "),
                Console.readOption("Password: "),
                false);
    }
}
