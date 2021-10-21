package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends FactoryPage {

    public SearchPage() {
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

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(css = "#search_block_top .btn.button-search")
    private WebElement searchBtn;

    @FindBy(css = "img[title='Flagman Mascot Feeder 5000']")
    private WebElement productName;


    public void clickLoginSearchPage() {

        email.sendKeys("test@email.com");
        password.sendKeys("haslo");
        submitLogin.click();


    }

    public void typeSearchProduct() {

        searchField.sendKeys("Flagman Mascot Feeder 5000");
        searchBtn.click();


        Assert.assertTrue(productName.isDisplayed());


    }


}
