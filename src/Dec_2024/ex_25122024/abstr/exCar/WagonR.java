package Dec_2024.ex_25122024.abstr.exCar;

class WagonR extends Engine{
    void driveWagonR(){
        openCar();
        partofGearBox();
        start();
        stop();
        speed();
    }

    @Override
    void openCar() {
        System.out.println("Open WagonR");

    }

    @Override
    void partofGearBox() {
        System.out.println("Part of WagonR");

    }

    @Override
    void speed() {
        System.out.println("Sped of WagonR");

    }

    @Override
    void stop() {
        System.out.println("Stop WagonR");

    }

    @Override
    void start() {
        System.out.println("Start WagonR");

    }
}
