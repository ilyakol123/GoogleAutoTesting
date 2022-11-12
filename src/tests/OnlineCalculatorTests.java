package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class OnlineCalculatorTests {

    @Test
    public void changeLanguageFromEngToSpain()
    {



        System.setProperty("webdriver.chrome.driver","C:\\java\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.online-calculator.com/");

        WebElement langDropDown = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("lngdp")));

        Select langDropDownSelect = new Select(langDropDown);
        langDropDownSelect.selectByVisibleText("Spanish");

        /*OnlineCalculatorPage onlineCalculatorPage = new OnlineCalculatorPage(driver);

        onlineCalculatorPage.changeLangToSpain();

        Assert.assertTrue(onlineCalculatorPage.findText().equals("Todo el mundo necesita una calculadora en algún momento - Pantalla completa, carga rápida y gratis!"));

        onlineCalculatorPage.changeLangToEnglish();

        Assert.assertTrue(onlineCalculatorPage.findText().equals("Everybody needs a Calculator at some point -- Full Screen, Fast Loading and FREE!"));
        driver.quit();*/
    }
}
