package Interview1;

public class SplitString {
    public static void main(String[] args) {
        String s1 = "Jay Shankar Prasad";
        System.out.println("Original String is :" +s1);
        String [] s2 = s1.split("\\s");
        for(Object o : s2){
            System.out.println(o);
        }

    }
}
