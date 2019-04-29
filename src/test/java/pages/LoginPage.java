package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.EnvironmentSetup;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;

    }

    public ProductListingPage login(String userName, String Password)
    {

        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys(userName);
        driver.findElement(By.id("spree_user_password")).sendKeys(Password);
        driver.findElement(By.name("commit")).click();
        return new ProductListingPage(driver);


    }






}
