import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;
    private CBTAPI api;

    @BeforeClass
    public void setupApplication() {
        String username = System.getenv("CBTUSRNAME").replaceAll("@", "%40");
        String authkey = System.getenv("CBTAUTH");
        System.out.println(username);
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(true);
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        api = new CBTAPI(username, authkey);

    }

    @AfterClass
    public void closeApplication()
    {
        driver.quit();
    }
}