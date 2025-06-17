package Views;

public class SignInView {
    private static String username;
    private static String password;
    public static void render() {
        System.out.println("Please type your username and password");
        username = Console.readInput("Please enter your username");
        System.out.println(username);
        password = Console.readInput("Please enter your password");
        System.out.println(password);
        System.out.println("Welcome back " + username + '!');
    }
}
