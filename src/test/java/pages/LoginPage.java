package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.EnvironmentSetup;

public class LoginPage {

    WebDriver driver;

    @FindBy(linkText="Login")
    private WebElement LoginButton;
    @FindBy(id="spree_user_email")
    private WebElement Email;
    @FindBy(id="spree_user_password")
    private WebElement PassWord;
    @FindBy(name="commit")
    private WebElement Submit;


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public ProductListingPage login(String userName, String Password)
    {

        LoginButton.click();
        Email.sendKeys(userName);
        PassWord.sendKeys(Password);
        Submit.click();
        return new ProductListingPage(driver);


    }






}
