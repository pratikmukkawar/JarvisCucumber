package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpreeLogin {
    WebDriver driver =null;
    @Given("open Browser")
    public void open_browser() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\prati\\IdeaProjects\\JarvisCucumber\\src\\WebDrivers\\chromedriver.exe");

        driver = new ChromeDriver();

    }

    @Then("go to Spree Site")
    public void go_to_spree_site() {

        driver.get("https://demo.spreecommerce.org/login");
        driver.manage().window().maximize();

    }

    @When("enter user (.*) and (.*)$")
    public void enter_user_name_and_pass(String name,String pass) {

        driver.findElement(By.id("spree_user_email")).sendKeys(name);
        driver.findElement(By.id("spree_user_password")).sendKeys(pass);

    }

    @Then("Click on login Button")
    public void click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@value='Login']")).click();
        Thread.sleep(5000);

    }

    @Then("Varify the title")
    public void varify_the_title() {
        System.out.println("Webpage Title is =>"+driver.getTitle());

        driver.quit();

    }

}
