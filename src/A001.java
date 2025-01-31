public class A001 {
    public static void main(String[] args) {
    int [] arr = {5,10,2,3,6};
    int temp=0;
    System.out.println("Original array is:");
    for (int i = 0; i <arr.length; i++) {
        System.out.println(arr[i]);

    }
    for(int i =0; i<arr.length;i++ ){
        for(int j = i+1;j<arr.length;j++){
            if(arr[i]< arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
