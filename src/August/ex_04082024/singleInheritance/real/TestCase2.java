package August.ex_04082024.singleInheritance.real;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser();//BaseTest
        getDataFromMYSQL();//GrandBaseTest
        System.out.println(gold);//GrandBaseTest
        //Here we will write thr TC
        closeBrowser();


    }

    public static void main(String[] args) {
      TestCase2 t2 = new TestCase2();
      t2.startBrowser();
      t2.closeBrowser();
      t2.getDataFromMYSQL();
    }
}
