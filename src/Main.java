import Views.LandingPage;
import Views.Printer;
import Views.Reader;

public class Main {
    public static void main(String[] args) {
        LandingPage.render();

        int selectedOption = Reader.readOptionNumber();

        Printer.print(LandingPage.routes[selectedOption]);
    }
}