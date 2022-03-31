
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverWeightCountInputHeightTest {

    private WebDriver driver;

    @BeforeEach
    public void browserSetupAndInputValidValues() {
        driver = new ChromeDriver();
        driver.get(WebDriverWeightCountSetup.URL);
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_NAME_XPATH)).sendKeys("Name");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_WEIGHT_XPATH)).sendKeys("100");
        driver.findElement(By.xpath(WebDriverWeightCountSetup.CHECK_MALE_GENDER_XPATH)).click();
    }

    @Test
    public void testInputHeightWithValue50() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("50");
    }

    @Test
    public void testInputHeightWithValue300() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("300");
    }

    @Test
    public void testInputHeightWithValue150() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("150");
    }

    @Test
    public void testInputHeightWithValue49() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("49");
    }

    @Test
    public void testInputHeightWithValue301() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("301");
    }

    @Test
    public void testInputHeightWithValue0() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("0");
    }

    @Test
    public void testInputHeightWithValueMinus10() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("-10");
    }

    @Test
    public void testInputHeightWithValue1000000() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("1000000");
    }

    @Test
    public void testInputHeightWithCharacterInHighRegister() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("A");
    }

    @Test
    public void testInputHeightWithCharacterInLowRegister() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("a");
    }

    @Test
    public void testInputHeightWithSymbol() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("-");
    }

    @Test
    public void testInputHeightWithString() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.INPUT_HEIGHT_XPATH)).sendKeys("a*1A");
    }


    @AfterEach
    public void submitFormAndBrowserTearDown() {
        driver.findElement(By.xpath(WebDriverWeightCountSetup.BUTTON_SUBMIT_XPATH)).click();
        driver.quit();
        driver = null;
    }


}
