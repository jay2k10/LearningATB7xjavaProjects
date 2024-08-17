package August.ex_10082024.superThisKeyword;

import August.ex_04082024.Person;

public class Lab184 {
}

class Student extends person{
    @Override
    void message(){
        System.out.println("I am a student");
    }
 void display(){
        super.message();
    }
}

class person{
    void message(){
        System.out.println("I am a person");
    }
}
