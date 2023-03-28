import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CreateTournament extends BaseClass {
    public PreLoginButtons pgeobj;
    public PostLoginButtons Logbtns;

    public AdminButtons admbtns;

    @Test
    public void TournamentCreate() {

        try {
            admbtns = PageFactory.initElements(driver, AdminButtons.class);
            String username = "swarmioadmin";
            String password = "FvtJ3ypjAsJ07bP";
            driver.get("https://" +username +":" +password +"@"+ "qa-hive-swarmio-admin-cicd.swarmio.gg");
            driver.manage().window().maximize();
            System.out.println("Event created with ID " +admbtns.EventCreate());
            driver.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}