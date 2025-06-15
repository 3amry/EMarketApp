package Views;

public class LandingPage {
    private static String headingMessage = "Welcome to the Doso\uD83D\uDC7E Market!";
    private static String promptMessage = "Please type the option's NUMBER to navigate!";

    private static String[] options = {
            "Sign in",
            "Sign up",
            "Continue to market"
    };
    public static Runnable[] routes = new Runnable[] {
            SignInView::render,
            SignUpView::render,
            MarketView::render,
    };
    public static void render() {
        Printer.print(headingMessage);
        Printer.print(promptMessage);
        Printer.listOptions(LandingPage.options);
    }
}
