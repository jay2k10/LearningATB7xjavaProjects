package feb2025.ex11022025;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 3, 4, 0, 8};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Size of an array:"+n);
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
