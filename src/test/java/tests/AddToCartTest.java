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

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("spree@example.com", "spree123");

        String product = "Ruby on Rails Ringer T-Shirt";
        String category="Clothing";
        ProductListingPage prpage = new ProductListingPage(driver);
        prpage.listTheProduct(product,category);
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

