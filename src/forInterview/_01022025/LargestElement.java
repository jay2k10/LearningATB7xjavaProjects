package forInterview._01022025;

public class LargestElement {
    public static void main(String[] args) {
        int arr [] ={10,2,18,5,50,3,7};
        //int max =0;
        int min = Integer.MAX_VALUE;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if(arr[i]<min){
                System.out.println(arr[i]);
                min = arr[i];
            }

        }
        System.out.println("Max value ="+min);

    }
}
