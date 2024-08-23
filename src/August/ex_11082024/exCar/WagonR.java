package August.ex_11082024.exCar;

public class WagonR extends Engine{
    void drive(){
        openCar();
        partofGearBox();
        speed();
        start();
        stop();


    }

    @Override
    void start() {
        System.out.println("Start of WagonR");

    }

    @Override
    void stop() {
        System.out.println("Stop WagonR");

    }

    @Override
    void speed() {
        System.out.println("Speed of WagonR");

    }

    @Override
    void partofGearBox() {
        System.out.println("Partofgearbox of WagonR");

    }

    @Override
    void openCar() {
        System.out.println("Open  WagonR");

    }
}
