package controllers;

public class SignInController {
    public static boolean signIn(String userName, String password) {
        return !(userName.isEmpty()) && !(password.isEmpty());
    }
}
