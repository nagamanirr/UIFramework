package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestSample extends EnvironmentSetup {

    @Test
    public void LoginSample() {

        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("spree@example.com","spree123");

    }





}
