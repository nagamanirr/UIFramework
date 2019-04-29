package tests;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;


public class AddToCart extends EnvironmentSetup {


    @Test(groups = "smoke")
    public void addtoCart() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("spree@example.com", "spree123");

        String product = "Ruby on Rails Ringer T-Shirt";
        ProductListingPage prpage = new ProductListingPage(driver);
        prpage.ListTheProduct(product);
        AddToCartPage productdesc=new AddToCartPage(driver);
        productdesc.addProductTocart();
        ShopingCartPage shopingcartpage = new ShopingCartPage(driver);
        Assert.assertTrue(shopingcartpage.isProductInCart(product), "Element Not found");


    }


    @Test(groups = "smoke")
    public void testGroupstag() {
        System.out.println("Tetsing groups tag from Add to cart");


    }
}

