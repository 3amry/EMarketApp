import Views.*;

public class Main {
    public static void main(String[] args) {
        LandingPage.render();
        int routeNumber = Reader.readRouteNumber(LandingPage.routes.length);
        Printer.print(LandingPage.routes[routeNumber]);

        SignInView.render();
        SignUpView.render();
        MarketView.render();
    }
}