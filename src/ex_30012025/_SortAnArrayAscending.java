package ex_30012025;

public class _SortAnArrayAscending {
    public static void main(String[] args) {
        int arr [] = {15,20,2,4,50,100,6};
        int temp =0;
        System.out.println("Print original array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for (int j =i+1 ;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }


    }
}
