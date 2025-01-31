package Jan2025.poly.overriding;

public class RealTime {
    public static void main(String[] args) {
        BaseClass bs = new TestClass();
        //bs.setBrowser("opera",true);
        bs.openBrowser();
        bs.closeBrowser();
    }
}

     class TestClass extends BaseClass {

    TestClass(){
        //System.out.println("DC-TestClass");
        super(); //default constructor of parent
        this.setBrowser("Chrome",true);

    }
    TestClass(String t){
        System.out.println("PC-TestClass");

    }
    // Single inheritance


         @Override
         public void setBrowser(String browser, boolean isAdmin) {
             super.setBrowser(browser, isAdmin);
         }
         //Dynamic dispatch



    }


     class BaseClass {
           BaseClass(){
               System.out.println("DC - BaseClass");
           }
           BaseClass(String b){
               System.out.println("PC-BaseClass");
           }

        private String browser;

        public String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser, boolean isAdmin) {
            if (isAdmin) {
                this.browser = browser;
                }
            else{
                System.out.println("Not Allowed!!");

            }
        }
        public void openBrowser() {
            System.out.println("Chrome Browser!!");

        }

        public void openBrowser(String browserName) {
            System.out.println("Browser name is :"+browserName);

        }
        public void closeBrowser(){
            System.out.println("Close the Browser!!");
        }
    }

