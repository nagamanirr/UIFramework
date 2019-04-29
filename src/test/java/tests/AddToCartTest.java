package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.ProductListingPage;
import pages.ShopingCartPage;


public class AddToCartTest extends EnvironmentSetup {


    @Test(groups = "smoke")
    public void addtoCart() {

        LoginPage loginpage = new LoginPage(driver);
        //loginpage.login("spree@example.com", "spree123");
        String product = "Ruby on Rails Ringer T-Shirt";
        String category="Clothing";
        String userName="spree@example.com";
        String passWord="spree123";

        ShopingCartPage shopingcartpage=loginpage.login(userName,passWord).selectProduct(product,category).addTocart();
        Assert.assertTrue(shopingcartpage.isProductInCart(product), "Element Not present");



    }

    @Test(groups = "smoke")
    public void addtoCartWithOutLogin() {

        ProductListingPage productlistingpage=new ProductListingPage(driver);
        String product = "Ruby on Rails Ringer T-Shirt";
        String category="Clothing";
        String userName="spree@example.com";
        String passWord="spree123";

        ShopingCartPage shopingcartpage=productlistingpage.selectProduct(product,category).addTocart();
        Assert.assertTrue(shopingcartpage.isProductInCart(product), "Element Not present");



    }



}

