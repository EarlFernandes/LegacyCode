import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;


public class HomePageSmokeTestOoredoo extends BaseClass {
    public PreLoginButtons pgeobj;
    public Utils util;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            driver.get("https://qa-hive-ooredoo-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.ClickWatch();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Watch | Ooredoo EZ | Ember"));
            String Watchpage = driver.getTitle();
            System.out.println(Watchpage + " page is displayed correctly");
            Assert.assertEquals(Watchpage, "Watch | Ooredoo EZ | Ember", "Ooredoo's Watch page didn't load correctly or in time");
            pgeobj.ClientName();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Ooredoo EZ | Ember"));
            String Clientpage = driver.getTitle();
            System.out.println(Clientpage + " page is displayed correctly");
            Assert.assertEquals(Clientpage, "Ooredoo EZ | Ember", "Ooredoo's Home page didn't load correctly or in time");
            pgeobj.ClickEvents();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Events | Ooredoo EZ | Ember"));
            String Eventpage = driver.getTitle();
            System.out.println(Eventpage + " page is displayed correctly");
            Assert.assertEquals(Eventpage, "Events | Ooredoo EZ | Ember", "Ooredoo's Events page didn't load correctly or in time");
            pgeobj.ClickStore();
            new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs("Store | Ooredoo EZ | Ember"));
            String Storepage = driver.getTitle();
            System.out.println(Storepage + " page is displayed correctly");
            Assert.assertEquals(Storepage, "Store | Ooredoo EZ | Ember", "Ooredoo's Store page didn't load correctly or in time");
            String Loginpage = pgeobj.Clicklogin();
            Assert.assertEquals(Loginpage, "Ooredoo EZ | Ember", "Ooredoo's Login page didn't load correctly or in time");
            String Registerpage = pgeobj.ClickRegister();
            Assert.assertEquals(Registerpage, "Ooredoo EZ | Ember", "Ooredoo's Register page didn't load correctly or in time");
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
            util.writeCurrentPageSource("HomepageSmokeTestOoredooFail.html");
        }
    }
}