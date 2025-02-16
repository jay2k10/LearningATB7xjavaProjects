package feb2025.ex01022025;

public class Ecap003 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age,boolean isAuth) {
        if (isAuth) {
            this.age = age;

        }else{
            System.out.println("You are not an admin to update age!! ");
        }

    }

    public Ecap003(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
