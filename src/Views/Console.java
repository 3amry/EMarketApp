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
            case "Sign out", "Go home" -> options = new String[]{
                    "Sign in",
                    "Sign up",
            };
            case "Sign in" -> {
                if (SignInView.signIn()) {
                    options = SignInView.signInOptions;
                } else {
                    options = new String[]{"Go home"};
                }
            }
           case "Sign up" -> {
               System.out.println("Please fill the following info to sign up!");
                SignUpView.signUp();
               System.out.println("Success!!");
               System.out.println("Please sign in to continue.");
           }
        }
    }

    public static void listOptions() {
        System.out.println("====== MENU ======");
        for (int i = 0; i < options.length; i++)
            System.out.println(i+1 + "- " + options[i]);
        System.out.println("Type 'exit' to quit the program.");
        System.out.println("---------------------------------------");
    }

    public static void readChoice() {
        while (!exit) {
            System.out.print("Choose an option (1-" + options.length + ") or type 'exit': ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
                exit = true;
                break;
            }

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

    public static String readOption(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void setOptions(String[] options) {
        Console.options = options;
    }
}
