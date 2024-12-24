package Dec_2024.ex_accessModifiers.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

     protected void canIShoot() {
        System.out.println("Yes you can !!");
    }
}
