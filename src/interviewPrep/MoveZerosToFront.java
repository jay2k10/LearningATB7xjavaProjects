package interviewPrep;

import java.util.Arrays;

public class MoveZerosToFront {
    public static void moveZerosToFront(int[] arr) {
        int n = arr.length;
        int index = n - 1; // Pointer for placing non-zero elements

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        // Fill remaining positions with zero
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4, 5, 0};
        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZerosToFront(arr);

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
