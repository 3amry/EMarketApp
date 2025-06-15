package Views;

public class SignInView {
    private static String username;
    private static String password;
    public static void render() {
        Printer.print("Please type your username and password");
        username = Reader.readInput("Please enter your username");
        Printer.print(username);
        password = Reader.readInput("Please enter your password");
        Printer.print(password);
        Printer.print("Welcome back " + username + '!');
    }
}
