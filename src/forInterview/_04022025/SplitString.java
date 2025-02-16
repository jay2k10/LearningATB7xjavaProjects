package forInterview._04022025;

public class SplitString {

    public static void main(String[] args) {
        String str = "my name is jay";
        String [] str2 = str.split("\s");
        for(String s : str2){
            System.out.println(s);
        }
    }
}
