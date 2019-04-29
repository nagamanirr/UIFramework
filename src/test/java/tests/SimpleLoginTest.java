package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SimpleLoginTest extends EnvironmentSetup{


    @Test(groups ="smoke")
    public void testLogin(){

        //driver.findElement(By.name("commit")).click();
        String logouttext=driver.findElement(By.linkText("Logout")).getText();
        System.out.println(logouttext);
        Assert.assertEquals("Logout",logouttext);

    }
     @Test(groups ="smoke")
    public void testGroupstag()
     {

         System.out.println("Testing Groups tag Sample Login Test");

     }

       @Test
      public void testNotGroupstag() {

           System.out.println("Testing NOt Groups tag Sample Login Test");
       }

//     }
//    @AfterTest
//public void tearDown()
//{
//    driver.close();
//    driver.quit();
//
//}



}
