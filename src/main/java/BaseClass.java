import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;
    //WebDriverWait wait;

    @BeforeClass
    public void setupApplication() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
//        opt.addArguments("headless");
        opt.addArguments("disable-dev-shm-usage");
        opt.addArguments("no-sandbox"); // https://stackoverflow.com/questions/50642308/webdriverexception-unknown-error-devtoolsactiveport-file-doesnt-exist-while-t
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public void closeApplication() {
        driver.quit();
    }
}
