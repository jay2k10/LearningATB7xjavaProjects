package forInterview._05022025;

public class EvenOddArray {
    public static void main(String[] args) {
        int arr [] = {10,5,2,1};
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 ==0){
                System.out.println("Even no: "+arr[i]);
            }
            else if(arr[i]!=0){
                System.out.println("Odd no :"+arr[i]);
            }

        }
    }
}
