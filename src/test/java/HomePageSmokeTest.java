        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import org.testng.annotations.Test;

        import static org.testng.AssertJUnit.assertEquals;


        public class HomePageSmokeTest extends BaseClass{
        public PreLoginButtons pgeobj;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            driver.get("https://qa-hive-swarmio-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            System.out.println(pgeobj.ClickWatch());
            Assert.assertEquals(pgeobj.ClickWatch(), "Watch | Swarmio Hive", "Watch page didn't load correctly or in time");
            System.out.println(pgeobj.ClientName());
            Assert.assertEquals(pgeobj.ClientName(), "Swarmio Hive", "Home page didn't load correctly or in time");
            System.out.println(pgeobj.ClickTournaments());
            Assert.assertEquals(pgeobj.ClickTournaments(), "Events | Swarmio Hive", "Events page didn't load correctly or in time");
            System.out.println(pgeobj.ClickStore());
            Assert.assertEquals(pgeobj.ClickStore(), "Store | Swarmio Hive", "Store page didn't load correctly or in time");
            System.out.println(pgeobj.Clicklogin());
            Assert.assertEquals(pgeobj.Clicklogin(), "Swarmio Hive", "Login page didn't load correctly or in time");
            System.out.println(pgeobj.ClickRegister());
            Assert.assertEquals(pgeobj.ClickRegister(), "Swarmio Hive", "Register page didn't load correctly or in time");
            System.out.println(pgeobj.ClickTournamentsViewMore());
            driver.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}