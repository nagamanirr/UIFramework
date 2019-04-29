package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginTest extends EnvironmentSetup{

@Test
    public void loginTest()
{

    login("spree@example.com","spree123");
    String logouttext=driver.findElement(By.linkText("Logout")).getText();
    System.out.println(logouttext);
    Assert.assertEquals("Logout",logouttext);
    String currentUsersWorkingDir = System.getProperty("user.dir");
    System.out.println("Dir is " + currentUsersWorkingDir);
    System.setProperty("webdriver.chrome.driver",currentUsersWorkingDir+"/src/test/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.navigate().to("https://spree-vapasi.herokuapp.com");
    driver.findElement(By.id("link-to-login")).click();

}

private void login(String userName,String Password)
{


    driver.findElement(By.id("spree_user_email")).sendKeys(userName);
    driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
    driver.findElement(By.name("commit")).click();





}


}
