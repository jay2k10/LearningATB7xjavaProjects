package interviewPrep;

public class _SortAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 15, 11, 9, 25, 7};
        int temp = 0;
        System.out.println("Print original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        System.out.println("Print sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
