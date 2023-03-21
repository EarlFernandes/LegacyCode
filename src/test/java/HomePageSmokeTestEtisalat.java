import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageSmokeTestEtisalat extends BaseClass{
public PreLoginButtons pgeobj;

@Test
public void HomePageButtons() {

try {
    pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
    driver.get("https://qa-hive-etisalat-cicd.swarmio.gg/");
    driver.manage().window().maximize();
    String Watchpage = pgeobj.ClickWatch();
    Assert.assertEquals(Watchpage, "Watch | Arena Esports", "Etisalat's Watch page didn't load correctly or in time");
    String Clientpage = pgeobj.ClientName();
    Assert.assertEquals(Clientpage, "Arena Esports", "Etisalat's Home page didn't load correctly or in time");
    String Eventpage = pgeobj.ClickEvents();
    Assert.assertEquals(Eventpage, "Events | Arena Esports", "Etisalat's Events page didn't load correctly or in time");
    String Storepage = pgeobj.ClickStore();
    Assert.assertEquals(Storepage, "Store | Arena Esports", "Etisalat's Store page didn't load correctly or in time");
    String Loginpage = pgeobj.Clicklogin();
    Assert.assertEquals(Loginpage, "Arena Esports", "Etisalat's Login page didn't load correctly or in time");
    String Registerpage = pgeobj.ClickRegister();
    Assert.assertEquals(Registerpage, "Arena Esports", "Etisalat's Register page didn't load correctly or in time");
    pgeobj.ClickTournamentsViewMore();
    driver.close();
}
catch (Exception e) {
    System.out.println(e);
}
}
}