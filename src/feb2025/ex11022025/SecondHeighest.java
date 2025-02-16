package feb2025.ex11022025;

public class SecondHeighest {
    public static void main(String[] args) {
        int[] arr = {10, 40, 12, 5, 3, 100,};
        int max = 0;
        int sMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(sMax);
    }
}
