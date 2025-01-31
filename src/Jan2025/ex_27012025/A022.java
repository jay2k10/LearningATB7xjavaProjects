package Jan2025.ex_27012025;

public class A022 {
    public static void main(String[] args) {
        int arr [] = {10,14,2,3,6,1};
        int temp=0;
        int size = arr.length;
        for(int i=0; i< arr.length;i++){
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//
//            }
            if (temp<arr[i]){
                temp = arr[i];

            }
        }
        System.out.println(temp);

    }
}
