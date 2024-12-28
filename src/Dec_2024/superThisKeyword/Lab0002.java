package Dec_2024.superThisKeyword;

public class Lab0002 {
}
class Person1 {
    Person1(){
        System.out.println("Person1 - DC");
    }
    Person1(String a){
        System.out.println("Person1 - PC A1");
    }
    Person1(String a , int a1){
        System.out.println("Person1 - PC A2");
    }
}
class Student1 extends Person1{
    Student1(String s ){
        System.out.println("PC - Student");
    }
    Student1(){
        //super();
        //super("Shankar");
        //super("jay" , 10);
        this("Prasad");
    }
}