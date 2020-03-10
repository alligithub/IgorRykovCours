package ca.wd3Qa0;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSettings {

    public ChromeDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

//    @After
//    public void close() {
//        driver.quit();
//    }
}
