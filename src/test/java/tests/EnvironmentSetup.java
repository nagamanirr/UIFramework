package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

     ChromeDriver driver;
/*
    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("Before class");
    }
    @AfterClass
    public void AfterClass()
    {
        System.out.println("After class");
    }
    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("BeforeTest");
    }

   @AfterTest
   public void AfterTest()
  {
    System.out.println("AfterTest");
  }

*/
    @BeforeTest(alwaysRun = true)
    public void setUp()
    {


        System.out.println("before class");
        String currentUsersWorkingDir = System.getProperty("user.dir");
        System.out.println("Dir is " + currentUsersWorkingDir);
        System.setProperty("webdriver.chrome.driver",currentUsersWorkingDir+"/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        //driver.findElement(By.id("link-to-login")).click();


    }

    /*
    @AfterClass(alwaysRun = true)
    public void tearDown()
    {
        System.out.println("***********AfterMethod***********");
       driver.close();
        driver.quit();

    }
*/











}
