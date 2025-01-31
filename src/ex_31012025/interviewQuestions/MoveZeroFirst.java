package ex_31012025.interviewQuestions;

import java.util.Arrays;

public class MoveZeroFirst {
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 0, 3, 0, 34, 0, 1};
        System.out.println("Original Array is:" + Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Length of an array is :"+n);
        int nonZero = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero--;

            }

        }
        while(nonZero>=0){
            arr[nonZero]=0;
            nonZero--;

        }
        System.out.println("Sorted Array is :"+Arrays.toString(arr));
    }
}
