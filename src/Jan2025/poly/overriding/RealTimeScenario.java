package Jan2025.poly.overriding;

public class RealTimeScenario {
    public static void main(String[] args) {
        BaseClass1 bs1 = new BaseTest1();
        bs1.getBrowser();
        bs1.openBrowser();

    }

}

class BaseTest1 extends BaseClass1{
    BaseTest1(){
        super();
        this.setBrowser("chrome",true);

    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin);
    }
}

class BaseClass1{
    BaseClass1(){
        System.out.println("DC");
    }
    BaseClass1(String browser){
        System.out.println("PC");

    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser , boolean isAdmin) {
        if(isAdmin) {
            this.browser = browser;
        }
        }
        void openBrowser(){
            System.out.println("Open Browser");
        }
        void openBrowser(String browser){
            System.out.println("Open browser is: "+browser);

        }

    }

