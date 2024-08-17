package August.ex_04082024.hasA.ex;

public class Car {
    //Aggregation HasA
    protected void startTheCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
