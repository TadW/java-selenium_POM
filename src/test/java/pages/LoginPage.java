package pages;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends FactoryPage {

    public LoginPage() {
        super();

    }

    @FindBy(className = "login")
    private WebElement loginBtn;


    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(xpath = "//a[@title='Zarządzaj moim kontem klienta']")
    private WebElement myaccount;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    private WebElement accountLogout;

    @FindBy(className = "logout")
    private WebElement logoutBtn;


    public LoginPage clickLoginSendEmailPassword() {


        email.sendKeys("test@email.com");
        password.sendKeys("haslo");
        submitLogin.click();


        return new LoginPage();


    }

    public LoginPage clickLogout() {
        logoutBtn.click();
        return new LoginPage();
    }

    public void userIsLogin() {

        String myaccountText = myaccount.getText();
        String expected = "Moje konto";

        Assert.assertEquals(myaccountText, expected);

        System.out.println(myaccountText);
    }

    public void userIsLogout() {


        String accountLogoutText = accountLogout.getText();
        String expected ="UWIERZYTELNIANIE";

        Assert.assertEquals(accountLogoutText, expected);

        System.out.println(accountLogoutText);


    }


}
