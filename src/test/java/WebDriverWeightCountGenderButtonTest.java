import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWeightCountGenderButtonTest {

    private WebDriver driver;

    @BeforeEach
    public void browserSetupAndInputValidValues() {
        driver = new ChromeDriver();
        driver.get(WebDriverWeightCountSetup.URL);
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("Name");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("150");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("60");
    }

    @Test
    public void testGenderButtonWithValueMale() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.CHECK_MALE_GENDER_XPATH)).click();
    }

    @Test
    public void testGenderButtonWithValueFemale() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.CHECK_FEMALE_GENDER_XPATH)).click();
    }

    @Test
    public void testGenderButtonWithoutSelecting() {
    }

    @AfterEach
    public void submitFormAndBrowserTearDown() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.BUTTON_SUBMIT_XPATH)).click();
        driver.quit();
        driver = null;
    }
}
