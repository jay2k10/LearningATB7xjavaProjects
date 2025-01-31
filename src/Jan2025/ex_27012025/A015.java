package Jan2025.ex_27012025;

public class A015 {
    public static void main(String[] args) {
        //with parameter with return type
        //without parameter with return type
        //without parameter without return type
        //with parameter without return type
        String my_name=function1("jayShankar");
        System.out.println(my_name);
        int i =function2();
        System.out.println(i);
        function3();
        function4("jay");

    }
    static String function1(String name){
        System.out.println("with parameter with return type");
        return name;
    }
    static int function2(){
        System.out.println("without parameter with return type");
        return 100;
    }
    static void function3(){
        System.out.println("without parameter without return type");
    }
    static void function4(String name){
        System.out.println("with parameter without return type");
        System.out.println("Entered name is :"+name);
    }

}
