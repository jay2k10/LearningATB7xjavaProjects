package Dec_2024.ex_exceptionalHandling26122024;

public class Lab00008 {
    public static void main(String[] args) throws Exception {
        String s1 = null;
        if (s1 == null) {
            throw new Exception("Enter a proper string");
        }
        s1.trim();
    }
}
