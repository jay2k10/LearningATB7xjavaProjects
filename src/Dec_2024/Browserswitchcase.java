package Dec_2024;

import java.util.Locale;
import java.util.Scanner;

public class Browserswitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browser_name = sc.next();
        browser_name = browser_name.toLowerCase();
        //int browser_name = sc.nextInt();
        switch (browser_name){
            case "firefox":
            //case 1:
                System.out.println("Starting firefox Browser");
                break;

            case "chrome":
            //case 2:
                System.out.println("Starting chrome browser");
                break;
            default:
                System.out.println("Don't know the browser name");
        }

    }
}
