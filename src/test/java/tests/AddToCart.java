package tests;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class AddToCart extends EnvironmentSetup {




    @Test
    public void addtoCart() {
        String searchProduct = "Ruby on Rails Ringer T-Shirt";
        driver.findElement(By.linkText("Clothing")).click();
        driver.findElement(By.linkText("Ruby on Rails Ringer T-Shirt")).click();

        driver.findElement(By.id("add-to-cart-button")).click();

        String Producttext = driver.findElement(By.linkText("Ruby on Rails Ringer T-Shirt")).getText();
        //String checkoutText=driver.findElement(By.linkText("checkout-link")).getText();
        //System.out.println("product added in to the cart  "+Producttext);
        //Assert.assertEquals("Ruby on Rails Ringer T-Shirt",Producttext);
        //String Text= driver.findElement(By.id("content")).getText();

        List<WebElement> listofItems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));
        System.out.println(listofItems);
        System.out.println(listofItems.size());



        for (int i = 0; i < listofItems.size(); i++) {

            System.out.println(listofItems.get(i).getText());
            String ExtractedProductDetails = listofItems.get(i).getText();

            if (ExtractedProductDetails.contains(searchProduct)) {
                System.out.println("element present");
            } else {
                System.out.println("Element not present");
            }


        }





    }







}

