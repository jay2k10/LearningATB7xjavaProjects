package interviewPrep;

public class $SortAnArray {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {50, 20, 10, 1, 90, 100, 2};
        System.out.println("Print Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Print sorted array----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
