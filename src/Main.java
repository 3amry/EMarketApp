import Views.*;

public class Main {
    public static void main(String[] args) {
        LandingPage.render();

        int routeNumber = Reader.readRouteNumber(LandingPage.routes.length);

        LandingPage.routes[routeNumber].run();
    }
}