package feb2025.ex01022025;

public class REcap003 {
    public static void main(String[] args) {
        Ecap003 ecap003 = new Ecap003("jay",35);
        System.out.println(ecap003.getName());
        ecap003.setName("prasad");
        System.out.println(ecap003.getName());
        System.out.println(ecap003.getAge());
        ecap003.setAge(45,false);
        System.out.println(ecap003.getAge());

    }
}
