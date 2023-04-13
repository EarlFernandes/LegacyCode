import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageSmokeTestEtisalat extends BaseClass {
    public PreLoginButtons pgeobj;
    public Utils util;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            util = PageFactory.initElements(driver, Utils.class);
            driver.get("https://qa-hive-etisalat-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.ClickWatch();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Watch | Arena Esports"));
            String Watchpage = driver.getTitle();
            System.out.println(Watchpage + " page is displayed correctly");
            Assert.assertEquals(Watchpage, "Watch | Arena Esports", "Etisalat's Watch page didn't load correctly or in time");
            pgeobj.ClientName();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Arena Esports"));
            String Clientpage = driver.getTitle();
            System.out.println(Clientpage + " page is displayed correctly");
            Assert.assertEquals(Clientpage, "Arena Esports", "Etisalat's Home page didn't load correctly or in time");
            pgeobj.ClickEvents();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Events | Arena Esports"));
            String Eventpage = driver.getTitle();
            System.out.println(Eventpage + " page is displayed correctly");
            Assert.assertEquals(Eventpage, "Events | Arena Esports", "Etisalat's Events page didn't load correctly or in time");
            pgeobj.ClickStore();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Store | Arena Esports"));
            String Storepage = driver.getTitle();
            System.out.println(Storepage + " page is displayed correctly");
            Assert.assertEquals(Storepage, "Store | Arena Esports", "Etisalat's Store page didn't load correctly or in time");
            String Loginpage = pgeobj.Clicklogin();
            Assert.assertEquals(Loginpage, "Arena Esports", "Etisalat's Login page didn't load correctly or in time");
            String Registerpage = pgeobj.ClickRegister();
            Assert.assertEquals(Registerpage, "Arena Esports", "Etisalat's Register page didn't load correctly or in time");
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
            util.writeCurrentPageSource("HomepageSmokeTestEtisalatFail.html");
        }
    }
}