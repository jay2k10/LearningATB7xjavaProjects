package forInterview._01022025;

import java.util.HashMap;
import java.util.Map;

public class SecondLar {
    public static void main(String[] args) {
        int arr []= {10,2,18,5,50,3,7,50};
        int max=0;
        int secondMax=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max = arr[i];

            }

        }
        System.out.println("Largest is :"+max);
        System.out.println("Second Largest is :"+secondMax);

//        Map<String,Integer> map = new HashMap<>();
//        map.put("jay",121);
//        map.put("Shankar",131);
//        System.out.println(map);

    }
}
