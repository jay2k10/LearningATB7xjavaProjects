package August.ex_17082024;

public class Lab198 {
    public static void main(String[] args) {
        Double d = 3.14; // Stored in HEAP area
        double val = d.doubleValue(); // Stored in continuous memory
        System.out.println(d);
        System.out.println(val);


        String s1 = "Shankar"; // Stored in string constant pool
        String s2 = new String("Shankar"); // Stored in Heap area
    }
}
