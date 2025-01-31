package ex_30012025;

import java.util.Arrays;

public class ShiftZerosToFront {
    public static void shiftZerosToFront(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = n - 1; // Pointer to place non-zero elements

        // Traverse from right to left and move non-zero elements to their correct positions
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex--;
            }
        }

        // Fill the beginning with zeros
        while (nonZeroIndex >= 0) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 5, 0, 3};
        System.out.println(arr.length);
        shiftZerosToFront(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 0, 1, 2, 4, 5, 3]
    }
}
