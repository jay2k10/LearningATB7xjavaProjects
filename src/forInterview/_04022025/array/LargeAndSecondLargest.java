package forInterview._04022025.array;

public class LargeAndSecondLargest {
    public static void main(String[] args) {
        int arr []= {10,2,18,5,50,3,7,50};
        int max = 0;
        int secondMax =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
