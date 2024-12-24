package Dec_2024.ex_function;

public class Lab019 {
    public static void main(String[] args) {
        //function - A piece of code which can be reused.

        //Two types of function

        //1. pre-defined Math.max()

        //2. User-Defined / created
        //Function within a function is not allowed, We generally define outside the main function.
        greet();


        System.out.println("------------------------");
        function_type1();

        System.out.println("-------------------");

        String name = function_type2();
        System.out.println(name);
        System.out.println("--------------------");
        function_type3("Shankar");

        System.out.println("With return with parameter");
        int result1 = function_type4(3, 4);
        System.out.println("Sum result is :" + result1);


        System.out.println("------------");

        for (int i = 1; i <= 5; i++) {
            greet();

        }

        int result = Math.max(3, 4);
        int result2 = Math.min(10, 15);

        System.out.println(result);
        System.out.println(result2);
    }

    public static void greet() {
        System.out.println("Hi, how r u?");
    }

    static void function_type1() {
        System.out.println("no parameter no return type");
    }

    static String function_type2() {
        System.out.println("No parameter with return type");
        return "jay";
    }

    static void function_type3(String name) {
        System.out.println("No return with parameter");
        System.out.println("you passed the parameter ->" + name);
    }

    static int function_type4(int a, int b) {
        return a + b;
    }
}
