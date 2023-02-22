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
            pgeobj.ClickWatch();
            System.out.println(pgeobj.ClickWatch());
            pgeobj.ClientName();
            System.out.println(pgeobj.ClientName());
            pgeobj.ClickTournaments();
            System.out.println(pgeobj.ClickTournaments());
            pgeobj.ClickRewards();
            System.out.println(pgeobj.ClickRewards());
            pgeobj.Clicklogin();
            System.out.println(pgeobj.Clicklogin());
            pgeobj.ClickRegister();
            System.out.println(pgeobj.ClickRegister());
            pgeobj.ClickTournamentsViewMore();
            System.out.println(pgeobj.ClickTournamentsViewMore());
            driver.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}