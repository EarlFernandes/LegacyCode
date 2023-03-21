import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageSmokeTestOoredoo extends BaseClass{
public PreLoginButtons pgeobj;

@Test
public void HomePageButtons() {

try {
    pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
    driver.get("https://qa-hive-ooredoo-cicd.swarmio.gg/");
    driver.manage().window().maximize();
    String Watchpage = pgeobj.ClickWatch();
    Assert.assertEquals(Watchpage, "Watch | Ooredoo EZ | Ember", "Ooredoo's Watch page didn't load correctly or in time");
    String Clientpage = pgeobj.ClientName();
    Assert.assertEquals(Clientpage, "Ooredoo EZ | Ember", "Ooredoo's Home page didn't load correctly or in time");
    String Eventpage = pgeobj.ClickEvents();
    Assert.assertEquals(Eventpage, "Events | Ooredoo EZ | Ember", "Ooredoo's Events page didn't load correctly or in time");
    String Storepage = pgeobj.ClickStore();
    Assert.assertEquals(Storepage, "Store | Ooredoo EZ | Ember", "Ooredoo's Store page didn't load correctly or in time");
    String Loginpage = pgeobj.Clicklogin();
    Assert.assertEquals(Loginpage, "Ooredoo EZ | Ember", "Ooredoo's Login page didn't load correctly or in time");
    String Registerpage = pgeobj.ClickRegister();
    Assert.assertEquals(Registerpage, "Ooredoo EZ | Ember", "Ooredoo's Register page didn't load correctly or in time");
    pgeobj.ClickTournamentsViewMore();
    driver.close();
}
catch (Exception e) {
    System.out.println(e);
}
}
}