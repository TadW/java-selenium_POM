package pages;


import org.openqa.selenium.support.PageFactory;
import static config.ConfigDriverManager.getInstance;


public class FactoryPage {

    public FactoryPage(){
        PageFactory.initElements(getInstance(), this);
    }


}
