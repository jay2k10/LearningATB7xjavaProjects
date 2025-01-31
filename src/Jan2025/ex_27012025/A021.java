package Jan2025.ex_27012025;

public class A021 {
    public static void main(String[] args) {
        int [] marks = {10,21,3,17,205};
        int max_Marks =0;
        int min_Marks=marks[0];
        for (int i=0;i<marks.length;i++){
            if(marks[i]>max_Marks){
                max_Marks=marks[i];
            }
            if(min_Marks>marks[i]){
                min_Marks=marks[i];
            }
        }
        System.out.println(max_Marks);
        System.out.println(min_Marks);
    }
}
