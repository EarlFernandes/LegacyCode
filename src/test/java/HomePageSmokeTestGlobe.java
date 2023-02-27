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
            System.out.println(pgeobj.ClickWatch());
            Assert.assertEquals(pgeobj.ClickWatch(), "Watch | Globe Gamer Grounds", "Globe's Watch page didn't load correctly or in time");
            System.out.println(pgeobj.ClientName());
            Assert.assertEquals(pgeobj.ClientName(), "Globe Gamer Grounds", "Globe's Home page didn't load correctly or in time");
            System.out.println(pgeobj.ClickTournaments());
            Assert.assertEquals(pgeobj.ClickTournaments(), "Events | Globe Gamer Grounds", "Globe's Events page didn't load correctly or in time");
            System.out.println(pgeobj.ClickStore());
            Assert.assertEquals(pgeobj.ClickStore(), "Store | Globe Gamer Grounds", "Globe's Store page didn't load correctly or in time");
            System.out.println(pgeobj.Clicklogin());
            Assert.assertEquals(pgeobj.Clicklogin(), "Globe Gamer Grounds", "Globe's Login page didn't load correctly or in time");
            System.out.println(pgeobj.ClickRegister());
            Assert.assertEquals(pgeobj.ClickRegister(), "Globe Gamer Grounds", "Globe's Register page didn't load correctly or in time");
            System.out.println(pgeobj.ClickTournamentsViewMore());
            driver.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}