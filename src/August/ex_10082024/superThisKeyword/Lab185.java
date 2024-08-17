package August.ex_10082024.superThisKeyword;

public class Lab185 {
    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName
}
class Person1{
    Person1(){
        System.out.println("person1 ----DC");
    }
    Person1(String a){
        System.out.println("person1 ----PC with one Argument");
    }
    Person1(String a , int a1){
        System.out.println("person1 ----PC with two Arguments");
    }
    class Students1 extends Person1{
        Students1 (String a){
            System.out.println("PC-Student");
        }
        Students1(){
            //super();
            //super("jay");
            //super("jay", 12);
            this("jay");
        }

    }

}
