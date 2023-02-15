import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public RemoteWebDriver driver;

    @BeforeClass
    public void setupApplication() throws MalformedURLException {
        String username = "earlswarmio";
        String authkey = "4hear2v5UZ2nAJ10bsBzjPrxYJgqyEa8T1oa7dvfCL2ZFJtdLG";
        String hub = "@hub.lambdatest.com/wd/hub";

        System.out.println("Test print line");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "MacOS Catalina");
        caps.setCapability("browserName", "Safari");
        caps.setCapability("version", "latest");
        caps.setCapability("build", "TestNG With Java");
        caps.setCapability("name", "Sampletest");
        caps.setCapability("plugin", "git-testng");

        System.out.println("Test print line");
        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);

        System.out.println(driver.toString());

        /*
         * WebDriverManager.chromedriver().setup(); ChromeOptions opt = new
         * ChromeOptions(); opt.setHeadless(true); driver = new ChromeDriver(opt);
         * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         */

    }

    @AfterClass
    public void closeApplication() {
        driver.quit();
    }
}
