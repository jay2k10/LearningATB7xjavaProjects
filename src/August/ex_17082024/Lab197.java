package August.ex_17082024;

public class Lab197 {
    public static void main(String[] args) {
        String num = "42";
        //int a = int(num); // not possible in primitive data type
        Integer a = Integer.valueOf(num);
        System.out.println(a);

        //String to primitive ?
        int a2 = Integer.parseInt(num);
        System.out.println(a2);

        //String -> int , Integer
        //Primitive to wrapper or reverse then you will use this concept.


    }
}
