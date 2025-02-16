package forInterview._05022025;

import java.util.Arrays;

public class ShiftZeroLast {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4, 0, 6, 0, 7};
        System.out.println(Arrays.toString(arr));
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
        System.out.println(Arrays.toString(arr));

    }

}
