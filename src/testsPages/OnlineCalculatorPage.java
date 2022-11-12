package testsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class OnlineCalculatorPage {
        By languageChangeButtonSpain = By.className("es");
        By languageChangeButtonEnglish = By.className("gb");
        By welcomingTextBy = By.className("abt");

        private final WebDriver driver;

        public OnlineCalculatorPage(WebDriver driver){
            this.driver = driver;
            driver.get("https://www.online-calculator.com/");
        }
        public OnlineCalculatorPage changeLangToSpain()
        {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(languageChangeButtonSpain)).click();
            return this;
        }
        public OnlineCalculatorPage changeLangToEnglish()
        {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(languageChangeButtonEnglish)).click();
            return this;
        }
        public String findText()
        {
            WebElement welcomingText = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(languageChangeButtonEnglish));
            String text = welcomingText.getText();
            return text;
        }
}
