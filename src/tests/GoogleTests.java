package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleTests {

        @Test
        public void testMultiply()
        {
            System.setProperty("webdriver.chrome.driver","C:\\java\\tools\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");

            WebElement searchField = driver.findElement(By.className("gLFyf"));
            searchField.sendKeys("google");
            searchField.sendKeys(Keys.ENTER);

            WebElement wiki = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.className("ruhjFe")));
            wiki.click();


            WebElement wikiLogo = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.className("mw-wiki-logo")));

            Assert.assertTrue(wikiLogo.isDisplayed());
            driver.quit();
        }




}
