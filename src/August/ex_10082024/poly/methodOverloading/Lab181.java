package August.ex_10082024.poly.methodOverloading;

public class Lab181 {
/*    ## Polymorphism
- Core principle of object-oriented programming that allows methods to perform different tasks based on the object that invokes them.
- Greek words "poly" (many) and "morphs" (forms).
## Types of Polymorphism
1. Compile-Time Polymorphism | Static Polymorphism | Methodoverloading
2. Runtime Polymorphism | Dynamic Polymorphism | Method overriding.*/
public static void main(String[] args) {
    MathOperations mathOperations = new MathOperations();
    int result = mathOperations.add(2,3);
    double result2 = mathOperations.add(2.4,3.6);
    String result3 = mathOperations.add("Pramod","Dutta");
    String result4 = mathOperations.add("Pramod",123);
    //String result4 = mathOperations.add("Pramod",12.34);
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
}

}
