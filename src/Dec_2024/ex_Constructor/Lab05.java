package Dec_2024.ex_Constructor;

public class Lab05 {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson("jay");
        ATBPerson p2 = new ATBPerson("Shankar");
        ATBPerson p3 = new ATBPerson(7827299332l);
        ATBPerson p4 = new ATBPerson("Prasad", 7480811200l);

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.phone);
        System.out.println(p4.phone);
        System.out.println(p4.name);
    }
}
