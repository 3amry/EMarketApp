import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] landingPageOptions = {"Sign in", "Sign up", "Continue to market"};
        String[] landingPageRoutes = {"Signing in...",
                "Signing up...", "Continuing to market..."};

        System.out.println("Welcome to the Doso\uD83D\uDC7E Market!");
        System.out.println("Please type the option's NUMBER to navigate!");

        for (int i = 0; i < landingPageOptions.length; i++) {
            System.out.println(i+1 + "- " + landingPageOptions[i]);
        }

        int selectedOption = scanner.nextInt() - 1;
        System.out.println(landingPageRoutes[selectedOption]);
    }
}