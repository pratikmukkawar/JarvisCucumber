package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class BaseClass {
    WebDriver driver=null;

    public void init(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\prati\\IdeaProjects\\JarvisCucumber\\src\\WebDrivers\\chromedriver.exe");

        driver = new ChromeDriver();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URl");

        String url =sc.next();
        driver.get(url);

    }
}
