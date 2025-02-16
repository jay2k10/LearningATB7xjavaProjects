package feb2025.ex11022025;

import java.util.Arrays;

public class ZeroFirst {
    public static void main(String[] args) {
        int[] arr = {5, 0, 2, 8, 1, 6, 0, 4};
        System.out.println(Arrays.toString(arr));
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


        System.out.println(Arrays.toString(arr));

    }
}
