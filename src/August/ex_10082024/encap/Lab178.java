package August.ex_10082024.encap;
//Encapsulations
public class Lab178 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("amit", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password="123";
        System.out.println(vwoLogin.password);

    }

}
class VWOLogin{
    public String userName;
    public String password;

    public VWOLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
