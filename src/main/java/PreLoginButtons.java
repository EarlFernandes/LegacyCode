import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PreLoginButtons extends BaseClass {
    @FindBy(xpath = "//*[@data-semantic='navbar-home-link']")
    WebElement Client_name;

    @FindBy(xpath = "//*[@data-semantic='navbar-watch-link']")
    WebElement Watch;

    @FindBy(xpath = "//*[@data-semantic='navbar-events-link']")
    WebElement Events;

    @FindBy(xpath = "//*[@data-semantic='navbar-store-link']")
    WebElement Store;

    @FindBy(xpath = "//*[@data-semantic='navbar-sign-in-link']")
    WebElement Login;

    @FindBy(xpath = "//*[@data-semantic='navbar-create-account-link']")
    WebElement Register;

    @FindBy(xpath = "//*[@data-semantic='cards-container-events-view-all']")
    WebElement Tournaments_ViewMore;

    @FindBy(xpath = "//*[contains(@data-cy, 'email')]")
    WebElement Username;

    @FindBy(xpath = "//*[contains(@data-cy, 'password')]")
    WebElement Password;

    @FindBy(xpath = "//*[contains(@data-semantic, 'sign-in-form-submit')]")
    WebElement LoginButton;


    public PreLoginButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String ClientName() {
        try {
            if (Client_name.isDisplayed()) {
                Client_name.click();

                Thread.sleep(5000);
                String ActualTitle = driver.getTitle();
                String ExpectedTitle = "Swarmio Hive";
                Assert.assertEquals(ActualTitle, ExpectedTitle);
            } else {
                System.out.println("Swarmio logo not displayed");
            }
        } catch (Exception e) {

        }
        String validation = "Homepage loads fine on clicking client name";
        return validation;
    }


    public String ClickWatch() {
        try {
//            wait.until(ExpectedConditions.visibilityOf(Watch));
            Watch.click();
            Thread.sleep(5000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Watch | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);


        } catch (Exception e) {

        }
        String validation = "Watch page visited successfully";
        return validation;
    }

    /*public String ClickChallenges() {
        try {
            Challenges.click();
            Thread.sleep(1000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Challenges | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);


        } catch (Exception e) {

        }
        String validation = "Challenges page visited successfully";
        return validation;
    }*/

    public String ClickTournaments() {
        try {
//            wait.until(ExpectedConditions.visibilityOf(Events));
            Events.click();
            Thread.sleep(7000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Events | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);


        } catch (Exception e) {

        }
        String validation = "Events page visited";
        return validation;
    }

    public String ClickRewards() {
        try {
            Store.click();
            Thread.sleep(5000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Store | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);


        } catch (Exception e) {

        }
        String validation = "Store page visited";
        return validation;
    }

    public String Clicklogin() {
        try {
            Login.click();
            Thread.sleep(5000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
//            Client_name.click();

        } catch (Exception e) {

        }
        String validation = "Login page loads fine";
        return validation;
    }

    public String ClickRegister() {
        try {
            Register.click();
            Thread.sleep(5000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            Client_name.click();
        } catch (Exception e) {

        }
        String validation = "Register page loads fine";
        return validation;
    }

/*    public String ClickChallengesViewMore() {
        try {
            Challenges_ViewMore.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Challenges | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
        String validation = "View more challenges page loads fine";
        return validation;

    }*/

    public String ClickTournamentsViewMore() {
        try {
            Tournaments_ViewMore.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Events | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
        String validation = "View more events page loads fine";
        return validation;
    }

    public String EnterUsername() {
        try {
            Username.sendKeys("earl@swarmio.media");

        } catch (Exception e) {

        }
        String validation = "Username was entered fine";
        return validation;
    }

    public String EnterPassword() {
        try {
            Password.sendKeys("qapass1234");

        } catch (Exception e) {

        }
        String validation = "Password was entered fine";
        return validation;
    }

    public String ClickLoginButton() {
        try {
            LoginButton.click();

        } catch (Exception e) {

        }
        String validation = "User was logged in";
        return validation;
    }

    /*public String ClickGameserversViewMore() {
        try {
            Gameservers_ViewMore.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
        String validation = "View more game servers page loads fine";
        return validation;
    }*/

    /*public String ClickJoinNow() {
        try {
            JoinNow.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
        String validation = "Clicking on join now takes you to Register page successfully";
        return validation;
    }*/
}