package Views;

import java.util.Scanner;

public class Reader {
    private static final Scanner scanner = new Scanner(System.in);
    public static int readRouteNumber(int numberOfRoutes) {
        System.out.print("Choose option (1-" + numberOfRoutes + "): ");
        int route = scanner.nextInt() - 1;
        scanner.nextLine();
        return route;
    }
    public static String readInput(String prompt) {
        Printer.print(prompt);
        return scanner.nextLine();
    }
}
