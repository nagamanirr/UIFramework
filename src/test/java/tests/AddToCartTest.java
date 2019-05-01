package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.ProductListingPage;
import pages.ShopingCartPage;
import utils.ConfigPropertiesUtil;


public class AddToCartTest extends EnvironmentSetup {


    @Test(dataProvider = "GetProductandcategory")
    public void addtoCart(String product,String category) {

        LoginPage loginpage = new LoginPage(driver);
        //String userName="spree@example.com";
        //String passWord="spree123";
        String userName=ConfigPropertiesUtil.getProperties().getProperty("UserId");
        String passWord = ConfigPropertiesUtil.getProperties().getProperty("PassWord");
        ShopingCartPage shopingcartpage=loginpage.login(userName,passWord).selectProduct(product,category).addTocart();
        Assert.assertTrue(shopingcartpage.isProductInCart(product), "Element Not present");



    }

    @DataProvider(name="GetProductandcategory")
public Object[][] getgetProductandcaterory(){

   return new Object[][]


        {

            {"Spree Stein","Mugs"},
                {"Ruby on Rails Ringer T-Shirt","Clothing"},

        };

    }






/*
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

*/

}

