package August.ex_11082024.realLifeEx;

public class Lab189 {
    public static void main(String[] args) {
        Chrome chrome =new Chrome();
        String s = chrome.openBrowser("chrome");
        System.out.println(s);
        chrome.closeBrowser("chrome");
        chrome.takeScreenShor();

        System.out.println("----   --------   ---------    ----------");

        FireFox fireFox = new FireFox();
        fireFox.openBrowser("FF");
        String s2 = fireFox.closeBrowser("FF");
        System.out.println(s2);
        fireFox.takeScreenShor();
    }
}
