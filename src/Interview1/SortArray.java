package Interview1;

public class SortArray {
    public static void main(String[] args) {
        int [] arr = {100,20,5,25,45};
        int temp;
        System.out.println("Original Array Orders Are:");
       for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
//        for (Object o : arr){
//            System.out.println(o);
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println("Sorted Arrays Are:");
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        }
    }

