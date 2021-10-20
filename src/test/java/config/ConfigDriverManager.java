package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigDriverManager {

    private static WebDriver driver;
    private ConfigDriverManager() {};

    public static WebDriver getInstance() {
        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quit() {
        if(null != driver) {
            driver.quit();


        }
        driver = null;
    }


}
