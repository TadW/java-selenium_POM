package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends FactoryPage {

    public HomePage() {
        super();
    }


    @FindBy(className = "login")
    private WebElement loginBtn;


    public LoginPage clickLoginBtn() {

        loginBtn.click();
        return new LoginPage();


    }


}
