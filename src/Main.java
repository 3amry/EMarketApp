import Views.LandingPage;
import Views.LogInView;
import Views.Printer;
import Views.Reader;

public class Main {
    public static void main(String[] args) {
        LandingPage.render();
        int routeNumber = Reader.readRouteNumber(LandingPage.routes.length);
        Printer.print(LandingPage.routes[routeNumber]);

        LogInView.render();
    }
}