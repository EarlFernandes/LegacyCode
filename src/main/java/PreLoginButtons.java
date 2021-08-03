import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreLoginButtons extends BaseClass {
    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div/nav[1]/a/span/img")
    WebElement Client_name;

    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div/nav[1]/section/div/a[1]")
    WebElement Watch;

    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div/nav[1]/section/div/a[2]")
    WebElement Challenges;

    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div[2]/nav/section/div/a[3]")
    WebElement Tournaments;

    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div[2]/nav/section/div/a[4]")
    WebElement Rewards;

    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div/nav[2]/section/div/a[1]")
    WebElement Login;

    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div/nav[2]/section/div/a[2]")
    WebElement Register;

    @FindBy(xpath = "//*[@id='app']/section/main/section/div/section[1]/div/div[5]/div[3]/a/span[1]")
    WebElement Challenges_ViewMore;

    @FindBy(xpath = "//*[@id='app']/section/main/section/div/section[1]/div/div[9]/div[3]/a/span[1]")
    WebElement Tournaments_ViewMore;

    @FindBy(xpath = "//*[@id='app']/section/main/section/div/section[1]/div/div[13]/div[3]/a/span[2]/svg")
    WebElement Gameservers_ViewMore;

    @FindBy(xpath = "//*[@id='app']/section/main/section/div/section[2]/div[2]/div/a/span[1]")
    WebElement JoinNow;

    public PreLoginButtons(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String ClientName() {
        try {

            Client_name.click();

            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);

        } catch (Exception e) {

        }
        String validation ="Homepage loads fine on clicking client name";
        return validation;
    }

    public String ClickWatch() {
        try {

            Watch.click();
            Thread.sleep(1000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Watch | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);



        } catch (Exception e) {

        }
        String validation = "Watch page visited successfully";
        return validation;
    }

    public String ClickChallenges() {
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
    }

    public String ClickTournaments() {
        try {
            Tournaments.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Tournaments | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);


        } catch (Exception e) {

        }
        String validation =  "Tournaments page visited";
        return validation;
    }

    public String ClickRewards() {
        try {
            Rewards.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Rewards | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);


        } catch (Exception e) {

        }
        String validation = "Rewards page visited";
        return validation;
    }

    public String Clicklogin() {
        try {
            Login.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
        String validation = "Login page loads fine";
        return validation;
    }

    public String ClickRegister() {
        try {
            Register.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
        String validation  = "Register page loads fine";
        return validation;
    }

    public String ClickChallengesViewMore() {
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

    }

    public String ClickTournamentsViewMore() {
        try {
            Tournaments_ViewMore.click();
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Tournaments | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            driver.navigate().back();

        } catch (Exception e) {

        }
    String validation = "View more tournaments page loads fine";
        return validation;
    }

    public String ClickGameserversViewMore() {
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
    }

    public String ClickJoinNow() {
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
    }
}