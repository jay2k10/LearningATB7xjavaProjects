package Jan2025.ex_27012025;

public class A020 {
    public static void main(String[] args) {
        int[] salaries = {3, 17, 2, 34, 2,1};
        int max = 1;
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];

            }
            if(min>salaries[i]){
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
