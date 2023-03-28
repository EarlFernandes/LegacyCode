import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class JoinTournament extends BaseClass {
    public PreLoginButtons pgeobj;
    public PostLoginButtons Logbtns;
    public AdminButtons admbtns;

    @Test
    public void TournamentJoin() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            Logbtns = PageFactory.initElements(driver, PostLoginButtons.class);
            admbtns = PageFactory.initElements(driver, AdminButtons.class);
            String username = "swarmioadmin";
            String password = "FvtJ3ypjAsJ07bP";
            driver.get("https://" +username +":" +password +"@"+ "qa-hive-swarmio-admin-cicd.swarmio.gg");
            driver.manage().window().maximize();
            String eventID = admbtns.EventCreate();
            driver.get("https://qa-hive-swarmio-cicd.swarmio.gg/");
            pgeobj.Clicklogin();
            System.out.println(pgeobj.EnterUsername());
            System.out.println(pgeobj.EnterPassword());
            System.out.println(pgeobj.ClickLoginButton());
            Thread.sleep(5000);
            driver.get("https://qa-hive-swarmio-cicd.swarmio.gg/event/" + eventID);
            Thread.sleep(5000);
            System.out.println(Logbtns.JoinEvent());
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}