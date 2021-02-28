        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import org.testng.annotations.Test;


        public class HomePageSmokeTest extends BaseClass{
        public PreLoginButtons pgeobj;

    @Test
    public void HomePageButtons() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            driver.get("https://qa-hive-swarmio.swarmio.gg/");
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            System.out.println(ActualTitle);
            pgeobj.ClientName();
            System.out.println(pgeobj.ClientName());
            pgeobj.ClickWatch();
            System.out.println(pgeobj.ClickWatch());
            pgeobj.ClickChallenges();
            System.out.println(pgeobj.ClickChallenges());
            pgeobj.ClickTournaments();
            System.out.println(pgeobj.ClickTournaments());
            pgeobj.ClickRewards();
            System.out.println(pgeobj.ClickRewards());
            pgeobj.Clicklogin();
            System.out.println(pgeobj.Clicklogin());
            pgeobj.ClickRegister();
            System.out.println(pgeobj.ClickRegister());
            pgeobj.ClickChallengesViewMore();
            System.out.println(pgeobj.ClickChallengesViewMore());
            pgeobj.ClickTournamentsViewMore();
            System.out.println(pgeobj.ClickTournamentsViewMore());
            pgeobj.ClickGameserversViewMore();
            System.out.println(pgeobj.ClickGameserversViewMore());
            pgeobj.ClickJoinNow();
            System.out.println(pgeobj.ClickJoinNow());

            driver.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}