package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;

    }


    public ShopingCartPage addTocart() {

        driver.findElement(By.id("add-to-cart-button")).click();

return new ShopingCartPage(driver);
    }
}