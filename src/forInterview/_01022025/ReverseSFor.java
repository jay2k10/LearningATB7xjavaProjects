package forInterview._01022025;

public class ReverseSFor {
    public static void main(String[] args) {
        String str = "i am Pranavi";
        String str2 ="";
        char ch;
//        for(int i =0;i<str.length();i++){
//            ch = str.charAt(i);
//            str2 = ch+str2;
//
//        }
        for (int i = str.length()-1; i >=0 ; i--) {
            str2 +=str.charAt(i);
        }
        System.out.println(str2);
    }
}
