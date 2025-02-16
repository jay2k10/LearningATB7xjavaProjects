package forInterview._04022025.array;

public class MinAnArray {
    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 1, 50, 350, 40, 20};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
