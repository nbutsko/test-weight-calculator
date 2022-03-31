import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWeightCountInputWeightTest {

    private WebDriver driver;

    @BeforeEach
    public void browserSetupAndInputValidValues() {
        driver = new ChromeDriver();
        driver.get(WebDriverWeightCountSetup.URL);
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("Name");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("150");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.CHECK_MALE_GENDER_XPATH)).click();
    }

    @Test
    public void testInputWeightWithValue3() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("3");
    }

    @Test
    public void testInputWeightWithValue500() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("500");
    }

    @Test
    public void testInputWeightWithValue60() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("60");
    }

    @Test
    public void testInputWeightWithValue501() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("501");
    }

    @Test
    public void testInputWeightWithValue1000000() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("1000000");
    }

    @Test
    public void testInputWeightWithValue2() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("2");
    }

    @Test
    public void testInputWeightWithValue0() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("0");
    }

    @Test
    public void testInputWeightWithValueMinus10() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("-10");
    }

    @Test
    public void testInputWeightWithCharacterInHighRegister() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("A");
    }

    @Test
    public void testInputWeightWithCharacterInLowRegister() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("a");
    }

    @Test
    public void testInputWeightWithSymbol() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("-");
    }

    @Test
    public void testInputWeightWithString() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("a*1A");
    }

    @AfterEach
    public void submitFormAndBrowserTearDown() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.BUTTON_SUBMIT_XPATH)).click();
        driver.quit();
        driver = null;
    }

}
