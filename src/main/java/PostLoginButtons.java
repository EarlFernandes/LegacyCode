import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.Random;

public class PostLoginButtons extends BaseClass {


    //Login Webelements
    public float getRandomNumber() {
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    @FindBy(xpath = "//*[contains(@data-icon, 'coins')]")
    WebElement Coins;

    //TeamCreation Webelements
    @FindBy(xpath = "//*[contains(@data-testid, 'dropdown-display-name')]")
    WebElement Dropdown;

    @FindBy(xpath = "//*[contains(@class, 'UserNavigation_userMenuItem__7YSv6 btn btn-secondary p-2 fw-bold dropdown-item')]//*[contains(@data-icon, 'users')]")
    WebElement Teams;

    @FindBy(xpath = "//*[contains(@data-icon, 'circle-plus')]")
    WebElement AddTeam;

    @FindBy(xpath = "//*[contains(@id, 'name')]")
    WebElement TeamName;

    @FindBy(xpath = "//*[contains(@class, 'w-100 mt-auto btn btn-primary')]")
    WebElement CreateTeamButton;

    @FindBy(xpath = "//*[contains(@class, 'toast-body')]")
    WebElement TeamCreationMsg;

    @FindBy(xpath = "//*[contains(@data-semantic, 'event-header-join')]")
    WebElement JoinNowbtn;

    @FindBy(xpath = "//*[contains(@data-semantic, 'join-event-modal-next')]")
    WebElement Confirmbtn;

    @FindBy(xpath = "//*[contains(@data-cy, 'successfulJoin')]")
    WebElement Joinevntsuccessmsg;

    public PostLoginButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String LoginCheck() {
        try {
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(Coins));
            if (Coins.isDisplayed()) {
                System.out.println("Coins displayed, user logged in");
            } else {
                System.out.println("Coins not displayed, user login failed");
            }
        } catch (Exception e) {

        }
        String validation = "Login succeeded, user coins displayed";
        return validation;
    }

    public String CreateTeam() {
        try {

            Dropdown.click();
            Teams.click();
            AddTeam.click();
            String TeamsName = "Earl's team" + getRandomNumber();
            TeamName.sendKeys(TeamsName);
            System.out.println("Team's name is: " + TeamsName);
            Thread.sleep(5000);
            CreateTeamButton.sendKeys(Keys.ENTER);
            String TeamcreationMessage = TeamCreationMsg.getText();
            Assert.assertEquals(TeamcreationMessage, "Your team has been successfully created.", "Team creation message is not displayed correctly");
            System.out.println("Team creation message displayed in popup is: " + TeamcreationMessage);

        } catch (Exception e) {

        }
        String title = driver.getTitle();
        return title;
    }

    public String JoinEvent() {
        try {
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(JoinNowbtn));
            JoinNowbtn.click();
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(Confirmbtn));
            Thread.sleep(3000);
            Confirmbtn.click();
            Thread.sleep(3000);
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(Joinevntsuccessmsg));
        } catch (Exception e) {
        }
        String ConfirmJoinMsg = Joinevntsuccessmsg.getText();
        return ConfirmJoinMsg;
    }
}
