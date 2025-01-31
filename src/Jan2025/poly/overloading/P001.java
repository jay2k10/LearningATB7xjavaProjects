package Jan2025.poly.overloading;

public class P001 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        int res = mo.add(2, 3);
        System.out.println(res);
        double res1= mo.add(3.0,2.0);
        System.out.println(res1);
    }
}
