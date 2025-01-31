package interviewPrep;

public class SortAnArray {
    public static void main(String[] args) {
        int arr[] = {52, 45, 32, 64, 12, 87, 78};
        int temp = 0;
        System.out.println("Print original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //sort the array in ascending order by 2 for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        //print a sorted array
        System.out.println("Array sorted in ascending order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
