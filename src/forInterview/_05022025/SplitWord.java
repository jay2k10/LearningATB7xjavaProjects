package forInterview._05022025;

public class SplitWord {
    public static void main(String[] args) {
        String str = "my name is Tejaswini";
        System.out.println("String Count is :"+str.length());
        String [] str2 = str.split("\s");
        for (String w :str2){
            System.out.println(w);


        }
        System.out.println("Split word: "+str2.length);

    }
}
