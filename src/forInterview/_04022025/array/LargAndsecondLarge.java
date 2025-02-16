package forInterview._04022025.array;

public class LargAndsecondLarge {
    public static void main(String[] args) {
        int arr [] = {200,15,20,2,4,6,800};
        int size = arr.length;
        System.out.println("Size of an array is :"+size);
        int max =0;
        int secondMax=0;

        for (int i=0 ;i< arr.length;i++){
            if(arr[i]> max){
               secondMax=max;
               max=arr[i];
            }
        }
        System.out.println("Second heighest is :"+secondMax);
        System.out.println("Largest array is:"+max);

    }
}
