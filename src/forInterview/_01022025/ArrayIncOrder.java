package forInterview._01022025;

import java.util.Arrays;

public class ArrayIncOrder {
    public static void main(String[] args) {
        int[] arr = {50, 15, 2, 25, 3, 8, 1};
        System.out.println(Arrays.toString(arr));
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
