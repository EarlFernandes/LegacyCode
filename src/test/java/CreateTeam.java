import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class CreateTeam extends BaseClass {
    public PreLoginButtons pgeobj;
    public PostLoginButtons Logbtns;

    @Test
    public void TeamCreate() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            Logbtns = PageFactory.initElements(driver, PostLoginButtons.class);
            driver.get("https://qa-hive-swarmio-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.Clicklogin();
            System.out.println(pgeobj.EnterUsername());
            System.out.println(pgeobj.EnterPassword());
            System.out.println(pgeobj.ClickLoginButton());
            System.out.println(Logbtns.LoginCheck());
            System.out.println(Logbtns.CreateTeam());
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}