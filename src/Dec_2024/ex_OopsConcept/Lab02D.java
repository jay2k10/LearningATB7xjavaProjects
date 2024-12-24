package Dec_2024.ex_OopsConcept;

public class Lab02D {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.color = "Black";

        //function - perform a task / block of code
        //functions within the class are called methods
        // class is a blueprint
        //object - Real entity created by the class - instance of a class is called an object


        Dog d2 = new Dog();
        d2.color = "white";
        System.out.println(d1.color);
        System.out.println(d2.color);
    }

}
