package August.ex_11082024.realLifeEx;

public class FireFox extends BaseClass{
    @Override
    String openBrowser(String openBrowser) {
        System.out.println("Open the FireFox Browser");
        return "Browser is opening!";
    }

    @Override
    String closeBrowser(String closeBrowser) {
        System.out.println("Closing the FireFox browser");
        return "Browser is closing!!!!!";
    }

    @Override
    void takeScreenShor() {
        System.out.println("Take Screnshot FF");
    }
}
