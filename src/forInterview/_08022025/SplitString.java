package forInterview._08022025;

public class SplitString {
    public static void main(String[] args) {
        String str = "i love my india";
        String [] str1 = str.split("\s");
        for(String s :str1){
            System.out.println(s);
        }
    }
}
