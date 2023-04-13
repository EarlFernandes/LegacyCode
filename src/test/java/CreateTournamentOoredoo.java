import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CreateTournamentOoredoo extends BaseClass {
    public PreLoginButtons pgeobj;
    public PostLoginButtons Logbtns;

    public AdminButtons admbtns;
    public Utils util;

    @Test
    public void TournamentCreate() {

        try {
            admbtns = PageFactory.initElements(driver, AdminButtons.class);
            util = PageFactory.initElements(driver, Utils.class);
            String username = "swarmioadmin";
            String password = "FvtJ3ypjAsJ07bP";
            driver.get("https://" +username +":" +password +"@"+ "qa-hive-ooredoo-admin-cicd.swarmio.gg");
            driver.manage().window().maximize();
            System.out.println(admbtns.EventCreate());
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
            util.writeCurrentPageSource("TournamentCreateOoredooFail.html");
        }
    }
}