package ex_30012025;

public class BuildingBPRunner {
    public static void main(String[] args) {

        BuildingBP dlf = new BuildingBP();
        dlf.color="White";
        dlf.height=151;
        dlf.noOfRooms=200;

        dlf.lift();
        dlf.activity();



        BuildingBP prestige = new BuildingBP();
        prestige.height=500;
    }
}
