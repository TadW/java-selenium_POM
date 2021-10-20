package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static config.ConfigDriverManager.getInstance;
import static config.ConfigDriverManager.quit;
import static org.openqa.selenium.devtools.v85.browser.Browser.close;


public class Config {

    private WebDriver driver;

    @Before
    public void setUp() {

        String baseUrl = "https://www.carpmix.pl/";


        driver = getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get(baseUrl);


    }

    @After
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        quit();

    }
}
