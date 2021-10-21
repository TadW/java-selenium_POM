package tests;

import config.Config;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class SearchPageTest extends Config {

    @Test
    public void SearchTest(){

        HomePage homePage = new HomePage();

        SearchPage searchPage = homePage.clickLoginBtnSearch();
        searchPage.clickLoginSearchPage();

        searchPage.typeSearchProduct();


    }

}
