import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    WebDriver driver;

    @BeforeClass
    public void setupApplication() {
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(true);
        System.setProperty("webdriver.chrome.driver", "//Users//Boxycharm//Desktop//Swarmio-hive//chromedriver");
        driver = new ChromeDriver(opt);

    }

    @AfterClass
    public void closeApplication()
    {
        driver.quit();
    }
}