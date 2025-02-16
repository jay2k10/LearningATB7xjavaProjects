package feb2025.ex01022025;

import org.w3c.dom.ls.LSOutput;

public class ConsPar {
    String name;
    int rollNo;

    public ConsPar(){
        name="Jay";
        rollNo=122;
    }

    public ConsPar(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
        System.out.println("My name is :"+name);
        System.out.println("My roll no is :"+rollNo);

    }

}
