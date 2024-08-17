package August.ex_10082024.encap;

public class Lab179 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin1 = new VWOLogin1("amit", "password123");
       // System.out.println(vwoLogin1.password);
      //  vwoLogin1.password="123";
        //System.out.println(vwoLogin1.password);
        System.out.println(vwoLogin1.getPassword());
        vwoLogin1.setPassword("Amit" , true);
        System.out.println(vwoLogin1.getPassword());
    }

}
class VWOLogin1{
    //Data Member
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean IsAuth) {
        if(IsAuth){
            this.password = password;
            System.out.println("Authenticated!");
        }
        else {
            System.out.println("Not Authenticated!");
        }

    }

    public VWOLogin1(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}