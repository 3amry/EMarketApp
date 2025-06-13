import Views.LandingPage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Doso\uD83D\uDC7E Market!");
        System.out.println("Please type the option's NUMBER to navigate!");

        for (int i = 0; i < LandingPage.options.length; i++) {
            System.out.println(i+1 + "- " + LandingPage.options[i]);
        }

        int selectedOption = scanner.nextInt() - 1;
        System.out.println(LandingPage.routes[selectedOption]);
    }
}