import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


        public class HomePageSmokeTestGlobe extends BaseClass{
        public PreLoginButtons pgeobj;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            driver.get("https://qa-hive-globe-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            String Watchpage = pgeobj.ClickWatch();
            Assert.assertEquals(Watchpage, "Watch | Globe Gamer Grounds", "Globe's Watch page didn't load correctly or in time");
            String Clientpage = pgeobj.ClientName();
            Assert.assertEquals(Clientpage, "Globe Gamer Grounds", "Globe's Home page didn't load correctly or in time");
            String Eventpage = pgeobj.ClickEvents();
            Assert.assertEquals(Eventpage, "Events | Globe Gamer Grounds", "Globe's Events page didn't load correctly or in time");
            String Storepage = pgeobj.ClickStore();
            Assert.assertEquals(Storepage, "Store | Globe Gamer Grounds", "Globe's Store page didn't load correctly or in time");
            String Loginpage = pgeobj.Clicklogin();
            Assert.assertEquals(Loginpage, "Globe Gamer Grounds", "Globe's Login page didn't load correctly or in time");
            String Registerpage = pgeobj.ClickRegister();
            Assert.assertEquals(Registerpage, "Globe Gamer Grounds", "Globe's Register page didn't load correctly or in time");
            pgeobj.ClickTournamentsViewMore();
            driver.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}