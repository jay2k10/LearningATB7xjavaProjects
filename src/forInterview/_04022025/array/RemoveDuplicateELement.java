package forInterview._04022025.array;

public class RemoveDuplicateELement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        int size = arr.length;
        System.out.println("Size of an array is :" + size);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }

            }

        }
    }
}
