package forInterview._01022025;

import java.util.Arrays;

public class LargestAnArray {
    public static void main(String[] args) {
        int arr [] = {5,2,6,1,50,350,40,20};
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
}
