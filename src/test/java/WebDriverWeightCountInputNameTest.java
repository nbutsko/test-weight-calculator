import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWeightCountInputNameTest {

    private WebDriver driver;

    @BeforeEach
    public void browserSetupAndInputValidValues() {
        driver = new ChromeDriver();
        driver.get(WebDriverWeightCountSetup.URL);
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("150");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("60");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.CHECK_MALE_GENDER_XPATH)).click();
    }

    @Test
    public void testInputNameWithValueName() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("Name");
    }

    @Test
    public void testInputNameWithSymbol() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("A");
    }

    @Test
    public void testEmptyInputName() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("");
    }

    @Test
    public void testInputNameWithSpace() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys(" ");
    }

    @Test
    public void testInputNameWithValue0() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("0");
    }

    @AfterEach
    public void submitFormAndBrowserTearDown() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.BUTTON_SUBMIT_XPATH)).click();
        driver.quit();
        driver = null;
    }
}
