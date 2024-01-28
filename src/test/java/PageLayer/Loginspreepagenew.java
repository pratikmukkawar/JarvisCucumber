package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginspreepagenew {
    WebDriver driver;
    public Loginspreepagenew(WebDriver driver){
       this.driver=driver;

    }
    By  Spree_Username=By.id("spree_user_email");

    By Spree_pass=By.id("spree_user_password");

    By Spreelogin_button=By.xpath("//*[@value='Login']");


    public void enterusername(String name){
        driver.findElement(Spree_Username).sendKeys(name);
    }

    public void enterpass(String pass){
        driver.findElement(Spree_pass).sendKeys(pass);
    }

    public void login(){
        driver.findElement(Spreelogin_button).click();

    }
}
