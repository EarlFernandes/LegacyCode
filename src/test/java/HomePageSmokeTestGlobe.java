import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageSmokeTestGlobe extends BaseClass {
    public PreLoginButtons pgeobj;
    public Utils util;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            util = PageFactory.initElements(driver, Utils.class);
            driver.get("https://qa-hive-globe-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.ClickWatch();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Watch | Globe Gamer Grounds"));
            String Watchpage = driver.getTitle();
            System.out.println(Watchpage + " page is displayed correctly");
            Assert.assertEquals(Watchpage, "Watch | Globe Gamer Grounds", "Globe's Watch page didn't load correctly or in time");
            pgeobj.ClientName();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Globe Gamer Grounds"));
            String Clientpage = driver.getTitle();
            System.out.println(Clientpage + " page is displayed correctly");
            Assert.assertEquals(Clientpage, "Globe Gamer Grounds", "Globe's Home page didn't load correctly or in time");
            pgeobj.ClickEvents();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Events | Globe Gamer Grounds"));
            String Eventpage = driver.getTitle();
            System.out.println(Eventpage + " page is displayed correctly");
            Assert.assertEquals(Eventpage, "Events | Globe Gamer Grounds", "Globe's Events page didn't load correctly or in time");
            pgeobj.ClickStore();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Store | Globe Gamer Grounds"));
            String Storepage = driver.getTitle();
            System.out.println(Storepage + " page is displayed correctly");
            Assert.assertEquals(Storepage, "Store | Globe Gamer Grounds", "Globe's Store page didn't load correctly or in time");
            String Loginpage = pgeobj.Clicklogin();
            Assert.assertEquals(Loginpage, "Globe Gamer Grounds", "Globe's Login page didn't load correctly or in time");
            String Registerpage = pgeobj.ClickRegister();
            Assert.assertEquals(Registerpage, "Globe Gamer Grounds", "Globe's Register page didn't load correctly or in time");
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
            util.writeCurrentPageSource("HomepageSmokeTestGlobeFail.html");
        }
    }
}