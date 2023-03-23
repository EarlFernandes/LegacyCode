import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class RegisterNewUserGlobe extends BaseClass {
    public PreLoginButtons pgeobj;
    public PostLoginButtons Logbtns;

    @Test
    public void TeamCreate() {

        try {
            pgeobj = PageFactory.initElements(driver, PreLoginButtons.class);
            Logbtns = PageFactory.initElements(driver, PostLoginButtons.class);
            driver.get("https://qa-hive-globe-cicd.swarmio.gg/");
            driver.manage().window().maximize();
            pgeobj.ClickRegister();
            pgeobj.RegisterUser();
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}