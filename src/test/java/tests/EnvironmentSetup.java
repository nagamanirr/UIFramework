package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.*;
import utils.ConfigPropertiesUtil;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

     WebDriver driver;

     //String browser="";
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
    @BeforeMethod(alwaysRun = true)
    public void setUp()
    {


        System.out.println("before class");
        String currentUsersWorkingDir = System.getProperty("user.dir");
        System.out.println("Dir is " + currentUsersWorkingDir);
        String browser = ConfigPropertiesUtil.getProperties().getProperty("BrowserType");
        System.out.println("Browser is " + browser);
        if(browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", currentUsersWorkingDir + "/src/test/resources/chromedriver");
            driver = new ChromeDriver();
        }

        else
        {
            System.setProperty("webdriver.gecko.driver", currentUsersWorkingDir + "/src/test/resources/geckodriver");
            driver = new FirefoxDriver();

        }



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
