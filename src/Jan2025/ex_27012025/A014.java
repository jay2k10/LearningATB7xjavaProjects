package Jan2025.ex_27012025;

public class A014 {
    public static void main(String[] args) {

        function1();
        System.out.println("------------------------");
        function2("Shankar");

        System.out.println("---------------------");
        String a = function3();
        System.out.println(a);
        System.out.println("---------------------------");
        int b = function4(3,4);
        System.out.println(b);


    }
    static void function1(){
        System.out.println("Without parameter without return type !!");
        System.out.println("-------------------------------------------");
    }
    static void function2(String name){
        System.out.println("With parameter without return type!!");
        System.out.println("You have shared :"+name);


    }
    static String function3(){
        System.out.println("without parameter with return type!!");
        return "Jay";
    }
    static int function4(int a, int b){
        System.out.println("Wit return type with parameter");
        return a+b;
    }
}
