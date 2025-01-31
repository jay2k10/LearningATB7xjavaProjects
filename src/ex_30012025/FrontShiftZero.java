package ex_30012025;

import java.util.Arrays;

public class FrontShiftZero {
    public static void frontShiftZero(int arr[]) {
        int n = arr.length;
        int nonZero = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero--;

            }

        }
        while (nonZero >= 0) {
            arr[nonZero] = 0;
            nonZero--;

        }


    }


    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 0, 1, 5, 8, 0};
        System.out.println(arr.length);
        frontShiftZero(arr);
        System.out.println(Arrays.toString(arr));
    }


}

