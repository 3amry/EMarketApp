package Views;

public class SignUpView {
    private static String username;
    private static String password;
    public static void render() {
        Printer.print("Please create a username and a password to join.");
        username = Reader.readInput("Please enter your username");
        Printer.print("created username is " + username);
        password = Reader.readInput("Please enter your password");
        Printer.print("created password is " + password);
        Printer.print("Glad to have you here " + username + '!');
    }
}
