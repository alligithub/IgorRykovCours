package ca.wd3Qa0;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WD3LoginPage extends WebDriverSettings{


    @Test
    public void testOpenMainPage() {
        driver.get("https://wd3-qa0.intesting.ca/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));

        driver.findElement(By.id("login")).sendKeys("alli-qa3");
        driver.findElement(By.id("password")).sendKeys("QAZ111");
        driver.findElement(By.cssSelector("button[type\"button\"]")).click();

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("WD3 (v.3.10.4 / 3.10.3.132 beta)"));



    }



}
