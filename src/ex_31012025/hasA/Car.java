package ex_31012025.hasA;

public class Car {
    void startTheCar(){

        //Aggregation has a relationship

        new Engine().start();
        new Tyre().rolling();
    }
}
