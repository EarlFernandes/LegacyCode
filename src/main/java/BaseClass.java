import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    WebDriver driver;

    @BeforeClass
    public void setupApplication() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(true);
        driver = new ChromeDriver(opt);

    }

    @AfterClass
    public void closeApplication()
    {
        driver.quit();
    }
}