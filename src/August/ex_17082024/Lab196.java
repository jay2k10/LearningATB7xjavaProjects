package August.ex_17082024;

public class Lab196 {
    public static void main(String[] args) {
        //Convert primitive to wrapper class
        int a =10;
        Integer b =a;
        System.out.println(a);
        System.out.println(b.byteValue()); //wrapper classes has an extra utilities added

        //Convert wrapper class to primitive both

        Integer b1 = 50; // Auto Boxing int -> Integer
        int value = b1; //UnBoxing Integer -> int
        //Integer.MAX_VALUE
        System.out.println(b1);
        System.out.println(value);
    }
}
