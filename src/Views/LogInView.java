package Views;

public class LogInView {
    private static String username;
    private static String password;
    public static void render() {
        Printer.print("Welcome back!");
        Printer.print(Reader.readInput("Please enter your username"));
        Printer.print(Reader.readInput("Please enter your password"));
    }
}
