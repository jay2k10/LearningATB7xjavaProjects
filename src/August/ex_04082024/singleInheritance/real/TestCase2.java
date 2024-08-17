package August.ex_04082024.singleInheritance.real;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser();//BaseTest
        getDataFromMYSQL();//GrandBaseTest
        System.out.println(gold);//GrandBaseTest
        //Here we will write thr TC
        closeBrowser();

        // If not used extends keywords use following

        //new BaseTest().closeBrowser();
        //new BaseTest().startBrowser();
    }

   public static void main(String[] args) {
      new TestCase2().testCase2();
//      t2.startBrowser();
//      t2.closeBrowser();
//      t2.getDataFromMYSQL();
    }
}
