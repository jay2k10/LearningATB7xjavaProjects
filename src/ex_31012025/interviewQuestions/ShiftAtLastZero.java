package ex_31012025.interviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftAtLastZero {
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 0, 3, 0, 34, 0, 1};
        System.out.println("Original Array is :" + Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Array Length is :" + n);
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero++;
            }

        }
        while (nonZero < arr.length) {
            arr[nonZero] = 0;
            nonZero++;
        }
        System.out.println("Sorted Array is :" + Arrays.toString(arr));
    }
}
