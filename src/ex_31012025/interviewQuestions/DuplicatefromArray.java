package ex_31012025.interviewQuestions;

public class DuplicatefromArray {
    public static void main(String[] args) {
        int arr []= {5,10,12,1,5,15};
        int temp;
        System.out.println("Original Array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate array is:"+arr[j]);
                }

            }

        }
    }
}
