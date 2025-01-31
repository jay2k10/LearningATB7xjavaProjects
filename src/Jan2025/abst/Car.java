package Jan2025.abst;

abstract class Car extends Engine{
    @Override
    void keyofcar() {
        System.out.println("Key of car");
    }

    @Override
    void partofGearBox() {
        System.out.println("Part of gearbox");

    }

    @Override
    void stop() {
        System.out.println("Stop car");

    }

    @Override
    void start() {
        System.out.println("Start car");

    }
}
