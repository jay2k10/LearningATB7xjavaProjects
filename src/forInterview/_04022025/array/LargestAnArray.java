package forInterview._04022025.array;

import java.util.Arrays;

public class LargestAnArray {
    public static void main(String[] args) {
        int [] arr = {100,500,400,2,5};
        int length = arr.length;
        System.out.println("Array Length is :"+length);
        System.out.println("Original array is :"+ Arrays.toString(arr));
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Max value of an Array is :"+max);
    }
}
