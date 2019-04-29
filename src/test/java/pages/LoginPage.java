package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.EnvironmentSetup;

import java.util.concurrent.TimeUnit;

public class LoginPage extends EnvironmentSetup {

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;

    }

    public void login(String userName,String Password)
    {


        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys(userName);
        driver.findElement(By.id("spree_user_password")).sendKeys(Password);
        driver.findElement(By.name("commit")).click();





    }






}
