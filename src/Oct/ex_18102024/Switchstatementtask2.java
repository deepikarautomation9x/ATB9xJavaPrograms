package Oct.ex_18102024;

import java.util.Scanner;

public class Switchstatementtask2 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        browser = browser.toLowerCase(); //To handle upper case input
        // Enter the browser name
        switch(browser){
            default:
                System.out.println("Opera is not in use for automation");
                break;
            case "chrome":
                System.out.println("Execute chrome");
                break;
            case "firefox":
                System.out.println("Execute of firefox");
                // Further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Edge browser case");
                break;

        }
        sc.close();
    }
}
