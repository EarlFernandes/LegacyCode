import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageSmokeTest extends BaseClass {
    public PreLoginButtons pgeobj;
    public Utils util;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            util = PageFactory.initElements(driver, Utils.class);
            driver.get("https://qa-hive-swarmio-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.ClickWatch();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Watch | Swarmio Hive"));
            String Watchpage = driver.getTitle();
            System.out.println(Watchpage + " page is displayed correctly");
            Assert.assertEquals(Watchpage, "Watch | Swarmio Hive", "Watch page didn't load correctly or in time");
            pgeobj.ClientName();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Swarmio Hive"));
            String Clientpage = driver.getTitle();
            System.out.println(Clientpage + " page is displayed correctly");
            Assert.assertEquals(Clientpage, "Swarmio Hive", "Home page didn't load correctly or in time");
            pgeobj.ClickEvents();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Events | Swarmio Hive"));
            String Eventpage = driver.getTitle();
            System.out.println(Eventpage + " page is displayed correctly");
            Assert.assertEquals(Eventpage, "Events | Swarmio Hive", "Events page didn't load correctly or in time");
            pgeobj.ClickStore();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Store | Swarmio Hive"));
            String Storepage = driver.getTitle();
            System.out.println(Storepage + " page is displayed correctly");
            Assert.assertEquals(Storepage, "Store | Swarmio Hive", "Store page didn't load correctly or in time");
            String Loginpage = pgeobj.Clicklogin();
            Assert.assertEquals(Loginpage, "Swarmio Hive", "Login page didn't load correctly or in time");
            String Registerpage = pgeobj.ClickRegister();
            Assert.assertEquals(Registerpage, "Swarmio Hive", "Register page didn't load correctly or in time");
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
            util.writeCurrentPageSource("HomepageSmokeTestFail.html");
        }
    }
}