package Dec_2024.superThisKeyword;

public class RealTime {
    public static void main(String[] args) {
        BaseClass t1 = new Testcase1(); //dynamic dispatch // runtime decide
        t1.setBrowser("opera",true);
       // System.out.println("");
        t1.openBrowser();
        t1.closeBrowser();
    }
}
class Testcase1 extends BaseClass{
    //TestCase is a type of BaseClass - single inheritance
    @Override
    public void setBrowser(String browser ,boolean isAuth){
        super.setBrowser(browser,isAuth);

    }
}
class BaseClass {
    String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }
    void openBrowser(){
        System.out.println("Chrome Browser");
    }
    void openBrowser(String browserName){
        System.out.println("Open Browser :"+browserName);
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}