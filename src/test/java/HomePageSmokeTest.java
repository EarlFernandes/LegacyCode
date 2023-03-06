        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import org.testng.annotations.Test;

        public class HomePageSmokeTest extends BaseClass{
        public PreLoginButtons pgeobj;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            driver.get("https://qa-hive-swarmio-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            String Watchpage = pgeobj.ClickWatch();
            Assert.assertEquals(Watchpage, "Watch | Swarmio Hive", "Watch page didn't load correctly or in time");
            String Clientpage = pgeobj.ClientName();
            Assert.assertEquals(Clientpage, "Swarmio Hive", "Home page didn't load correctly or in time");
            String Eventpage = pgeobj.ClickEvents();
            Assert.assertEquals(Eventpage, "Events | Swarmio Hive", "Events page didn't load correctly or in time");
            String Storepage = pgeobj.ClickStore();
            Assert.assertEquals(Storepage, "Store | Swarmio Hive", "Store page didn't load correctly or in time");
            String Loginpage = pgeobj.Clicklogin();
            Assert.assertEquals(Loginpage, "Swarmio Hive", "Login page didn't load correctly or in time");
            String Registerpage = pgeobj.ClickRegister();
            Assert.assertEquals(Registerpage, "Swarmio Hive", "Register page didn't load correctly or in time");
            System.out.println(pgeobj.ClickTournamentsViewMore());
            driver.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}