import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CreateTeamEtisalat extends BaseClass {
    public PreLoginButtons pgeobj;
    public PostLoginButtons Logbtns;
    public Utils util;

    @Test
    public void TeamCreate() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            Logbtns = PageFactory.initElements(driver, PostLoginButtons.class);
            driver.get("https://qa-hive-etisalat-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.Clicklogin();
            System.out.println(pgeobj.EnterUsername());
            System.out.println(pgeobj.EnterPassword());
            System.out.println(pgeobj.ClickLoginButton());
            Thread.sleep(5000);
            System.out.println(Logbtns.LoginCheck());
            System.out.println(Logbtns.CreateTeam());
        } catch (Exception e) {
            System.out.println(e);
            util.writeCurrentPageSource("TeamCreateEtisalatFail.html");
        }
    }
}