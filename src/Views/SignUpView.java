package Views;

public class SignUpView {
    private static String username;
    private static String password;
    public static void render() {
        System.out.println("Please create a username and a password to join.");
        username = Console.readInput("Please enter your username");
        System.out.println("created username is " + username);
        password = Console.readInput("Please enter your password");
        System.out.println("created password is " + password);
        System.out.println("Glad to have you here " + username + '!');
    }
}
