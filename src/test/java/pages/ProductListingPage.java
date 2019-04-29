package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductListingPage {


    WebDriver driver;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;

    }



    public void ListTheProduct(String searchProduct ) {
        driver.findElement(By.linkText("Clothing")).click();
        driver.findElement(By.linkText(searchProduct)).click();
       // driver.findElement(By.id(searchProduct)).click();
        //driver.findElement(By.id("add-to-cart-button")).click();


    }


}
