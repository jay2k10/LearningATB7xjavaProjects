package feb2025;

import java.util.Arrays;

public class CageminiL1BasicJavaQuestion {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int j = 1; j <= 3; j++) {

            int k = arr[6];
            for (int i = (arr.length - 1); i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = k;
            System.out.println(Arrays.toString(arr));
        }
    }
}
