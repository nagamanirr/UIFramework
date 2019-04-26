package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

    ChromeDriver driver;

    @BeforeTest
    public void setUp()
    {

        System.out.println("***********Beforetest***********");
        String currentUsersWorkingDir = System.getProperty("user.dir");
        System.out.println("Dir is " + currentUsersWorkingDir);
        System.setProperty("webdriver.chrome.driver",currentUsersWorkingDir+"/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");


    }
    @AfterTest
    public void tearDown()
    {
        System.out.println("***********After Test***********");
        driver.close();
        driver.quit();

    }












}
