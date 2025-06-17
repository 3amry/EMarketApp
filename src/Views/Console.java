package Views;
import java.util.Scanner;

public class Console {
    private static boolean exit = false;
    private static String[] options = new String[] {
            "Sign in",
            "Sign up",
    };
    private static int selectedIndex;
    private static final Scanner scanner = new Scanner(System.in);
    public static void run() {
        while (!exit) {
            listOptions();
            readChoice();
            updateMenu(options[selectedIndex]);
        }

        System.out.println("Exiting the program... Goodbye!");
        System.out.println("-------------------------------");
        scanner.close();
    }

    private static void updateMenu(String choice) {
        switch (choice) {
            case "Reset":
                options = new String[] {
                        "Sign in",
                        "Sign up",
                };

            case "Sign in":
                options = new String[] {
                        "wow you are signed in"
                };
        }
    }

    public static void listOptions() {
        System.out.println("====== MENU ======");
        for (int i = 0; i < options.length; i++)
            System.out.println(i+1 + "- " + options[i]);
        System.out.println("Type 'exit' to quit the program.");
        System.out.println("---------------------------------------");
    }

    public static int readChoice() {
        while (!exit) {
            System.out.print("Choose an option (1-" + options.length + ") or type 'exit': ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("exit"))
                exit = true;
            else {
                try {
                    selectedIndex = Integer.parseInt(choice) - 1;
                    if (selectedIndex < 0 || selectedIndex > options.length - 1) {
                        System.out.println("---------------------------------------");
                        System.out.println("Please enter an integer between 1 and "
                                + options.length);
                    }else break;
                }catch (NumberFormatException e) {
                    System.out.println("Invalid number." +
                            " Please enter an integer between 1 and " + options.length);
                }
            }
        }
        return selectedIndex;
    }

    public static String readInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static void setOptions(String[] options) {
        Console.options = options;
    }
}
