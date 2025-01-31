package Interview1;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 2, 1};
        //System.out.println("Original array are:");
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);

                }

            }

        }

    }
}
