package Dec_2024.wrapperClasses;

public class W1 {
    public static void main(String[] args) {
        //primitive to wrapper class
        int a = 10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b);


        //wrapper class to primitive

        Integer c = 45; //AutoBoxing - int - Integer
        int value = c;  //unboxing Integer - int
        System.out.println(c);
        System.out.println(value);

    }

}
