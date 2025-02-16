package feb2025.ex11022025;

import java.util.Arrays;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {100, 50, 10, 4, 105};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
        System.out.println(Arrays.toString(arr));

    }
}
