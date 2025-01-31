import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name:");
        String browser_Name = sc.next();
        browser_Name = browser_Name.toLowerCase();
        // char ch = sc.next().charAt(0);
        System.out.println(browser_Name);

        switch (browser_Name) {
            case "chrome":
                System.out.println("Chrome.......");
                break;
            case "firefox":
                System.out.println("Firefox Starting.....");
                break;
            default:
                System.out.println("No Idea......");
                break;
        }
    }
}
