package forInterview._04022025;

public class VowelConst {
    public static void main(String[] args) {
        String str = "my name is jay shankar";
        int length = str.length();
        System.out.println(length);
        int cVowel = 0;
        int cCons = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                cVowel++;
            }
            else if(str.charAt(i)>='a'||str.charAt(i)<='z'){
                cCons++;
            }

        }
        System.out.println(cVowel);
        System.out.println(cCons);


    }
}
