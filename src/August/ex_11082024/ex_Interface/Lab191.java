package August.ex_11082024.ex_Interface;

public class Lab191 {
    public static void main(String[] args) {
        // I i = new I(); //not create an object

    }
}

interface I{}
class A{} // concrete class
class B{} // concrete class
abstract class C{} // Incomplete class
class Test1 extends  A{} // Ok? single inheritance
class Test2 extends B{} //single inheritance
// class Test3 extends A,B{} // Multiple Inheritance
class Test0 implements I{}
interface I1{ }
interface I2{}
class Test4 implements I1,I2{} // multiple Inheritance with interface
class Test5 extends A implements I1,I2{}
//class Test6 implements I1 extends A{}// Ok not possible
//interface I3 extends A{} // Interface cannot extends anything
//interface I4 implements A{} // Interface cannot extends anything
//interface I5 extends A,B{} // Interface cannot extends anything
interface I6 extends I1,I2{}
//interface I7  extends C{} //not possible

