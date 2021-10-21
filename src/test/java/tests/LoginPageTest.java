package tests;

import config.Config;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginPageTest extends Config {


    @Test
    public void LoginTest() {

        HomePage homePage = new HomePage();

        LoginPage loginPage = homePage.clickLoginBtn();
        loginPage.clickLoginSendEmailPassword();

        loginPage.userIsLogin();

        loginPage.clickLogout();

        loginPage.userIsLogout();


    }




}
