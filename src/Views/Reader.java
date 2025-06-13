package Views;

import java.util.Scanner;

public class Reader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readOptionNumber() {
        return scanner.nextInt() - 1;
    }
}
