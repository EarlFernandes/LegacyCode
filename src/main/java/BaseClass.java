import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;
    @BeforeClass
    public void setupApplication() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--window-size=1920,1080");
        opt.addArguments("--disable-extensions");
        opt.addArguments("--proxy-server='direct://'");
        opt.addArguments("--proxy-bypass-list=*");
        opt.addArguments("--remote-allow-origins=*");
        opt.addArguments("--start-maximized");
        opt.addArguments("--headless");
        opt.addArguments("--disable-dev-shm-usage");
        opt.addArguments("--no-sandbox"); // https://stackoverflow.com/questions/50642308/webdriverexception-unknown-error-devtoolsactiveport-file-doesnt-exist-while-t
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public void closeApplication() {
        driver.quit();
    }
}
