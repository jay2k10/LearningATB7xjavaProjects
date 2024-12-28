package Dec_2024.superThisKeyword;

public class Lab0001 {
    public static void main(String[] args) {

    }


class Student extends Person {
    @Override
    void message() {
        System.out.println("I am a student message");
    }
    void display() {
        super.message();
    }
}
class Person {
    void message() {
        System.out.println("I am person message");
    }
}
}