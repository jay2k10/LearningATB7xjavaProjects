package feb2025.ex11022025;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] arr = {100, 200, 500, 400, 300};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
