package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SimpleLoginTest extends EnvironmentSetup{


    @Test
    public void testLogin(){

        driver.findElement(By.name("commit")).click();
        String logouttext=driver.findElement(By.linkText("Logout")).getText();
        System.out.println(logouttext);
        Assert.assertEquals("Logout",logouttext);

    }


    @Test
    public void addtoCart(){

        driver.findElement(By.linkText("Clothing")).click();
        driver.findElement(By.linkText("Ruby on Rails Ringer T-Shirt")).click();


        String logouttext=driver.findElement(By.linkText("Logout")).getText();
        System.out.println(logouttext);
        Assert.assertEquals("Logout",logouttext);

    }



//
//    @AfterTest
//public void tearDown()
//{
//    driver.close();
//    driver.quit();
//
//}



}
