package Views;

public class Printer {
    public static void print(String message){
        System.out.println(message);
    }
    public static void listOptions(String[] options) {
        for (int i = 0; i < options.length; i++)
            print(i+1 + "- " + options[i]);
    }
}
