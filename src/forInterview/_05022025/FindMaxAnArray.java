package forInterview._05022025;

import java.util.Arrays;

public class FindMaxAnArray {
    public static void main(String[] args) {
        int [] arr = {100,500,200,50};
        System.out.println(Arrays.toString(arr));
        int max =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
            }

        }
        System.out.println("Max value in an array is :"+max);
    }
}
