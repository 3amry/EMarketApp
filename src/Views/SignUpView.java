package Views;

import Controllers.SignUpController;

public class SignUpView {
    public static void signUp() {
        SignUpController.SignUp(
                Console.readOption("Email: "),
                Console.readOption("Username: "),
                Console.readOption("Password: "),
                false);
    }
}
