package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopingCartPage {

    WebDriver driver;

    public ShopingCartPage(WebDriver driver) {
        this.driver = driver;

    }

    public boolean isProductInCart(String searchProduct) {
        boolean success = true;
        List<WebElement> listofItems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));
        System.out.println(listofItems);
        System.out.println(listofItems.size());


        for (int i = 0; i < listofItems.size(); i++) {


            System.out.println(listofItems.get(i).getText());
            String ExtractedProductDetails = listofItems.get(i).getText();

            if (ExtractedProductDetails.contains(searchProduct)) {
                //System.out.println("element present");
                success=true;

            } else {
                //System.out.println("Element not present");
                success=false;

            }


        }
return success;

    }
}


