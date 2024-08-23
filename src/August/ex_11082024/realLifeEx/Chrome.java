package August.ex_11082024.realLifeEx;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String openBrowser) {
        System.out.println("Open the chrome browser");
        return "Opening the browser";
    }

    @Override
    String closeBrowser(String closeBrowser) {
        System.out.println("Close the chrome browser" );
        return "";
    }

    @Override
    void takeScreenShor() {
        System.out.println("Take ScreenShot Chrome");

    }
}
