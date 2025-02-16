package feb2025.ex01022025;

public class AutomationOOPSConcept {
    public static void main(String[] args) {
        BaseClass t1 = new TestClass(); //Dynamic dispatch
        t1.openBrowser("Opera");
        t1.openBrowser();
        t1.closeBrowser();
    }
}
class TestClass extends BaseClass {
    TestClass() {
        super();
        this.setBrowser("Firefox", true);
    }
    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin);
    }
}
class BaseClass {
    private String browser;

    BaseClass() {
        System.out.println("DC");
    }

    BaseClass(String name) {
        System.out.println("PC is :" + name);
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("You are not Authorised to change the browser!!");
        }
    }
    void openBrowser() {
        System.out.println("Chrome");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser :" + browserName);

    }

    void closeBrowser() {
        System.out.println("Browser closed");
    }
}

