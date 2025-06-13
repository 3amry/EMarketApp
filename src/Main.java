import Views.LandingPage;
import Views.Printer;
import Views.Reader;

public class Main {
    public static void main(String[] args) {
        Printer.print("Welcome to the Doso\uD83D\uDC7E Market!");
        Printer.print("Please type the option's NUMBER to navigate!");
        Printer.listOptions(LandingPage.options);

        int selectedOption = Reader.readOptionNumber();

        Printer.print(LandingPage.routes[selectedOption]);
    }
}