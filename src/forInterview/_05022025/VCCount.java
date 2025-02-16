package forInterview._05022025;

public class VCCount {
    public static void main(String[] args) {
        String str = "Character";
        String str1 = str.toLowerCase();
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            //Character c = str1.charAt(i);
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {

                vCount++;

            } else if (str1.charAt(i) >= 'a' || str1.charAt(i) <= 'z') {

                cCount++;

            }

        }
        System.out.println("Vowel count is :" + vCount);
        System.out.println("Constant count is :" + cCount);
    }
}

