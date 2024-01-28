package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchstep {

    WebDriver driver=null ;
    @Given("open browser")
    public void open_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prati\\IdeaProjects\\JarvisCucumber\\src\\WebDrivers\\chromedriver.exe");

        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }

    @When("open google page")
    public void open_google_page() {
        driver.get("https://www.google.com/");

    }

    @When("Enter the msg in search bar Hello Jarvis")
    public void enter_the_msg_in_search_bar_hello_jarvis() {
       WebElement perform= driver.findElement(By.id("APjFqb"));
       perform.sendKeys("Hello Jarvis");
        perform.sendKeys(Keys.ENTER);

    }

    @Then("hit enter")
    public void hit_enter() {
        System.out.println("Donr before step");
    }

    @Then("Validate the web page")
    public void validate_the_web_page() {
        System.out.println("page title is=>"+driver.getTitle());

    }
}
