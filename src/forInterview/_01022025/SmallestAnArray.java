package forInterview._01022025;

public class SmallestAnArray {
    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 1, 50, 350, 40, 20};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                System.out.println(arr[i]);
                min = arr[i];
            }

        }
        System.out.println("Min value is"+min);
    }
}
