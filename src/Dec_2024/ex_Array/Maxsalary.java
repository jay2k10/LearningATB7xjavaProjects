package Dec_2024.ex_Array;

public class Maxsalary {
    public static void main(String[] args) {
        int[] salaries = {7, 12, 35, 65, 75, 99};
        int max = 1;
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
            if (min > salaries[i]) {
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
