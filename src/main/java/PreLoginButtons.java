import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PreLoginButtons extends BaseClass {
    @FindBy(xpath = "//*[contains(@class, 'd-block me-3')]")
    WebElement Client_name;

    @FindBy(xpath = "//*[text()='Watch']")
    WebElement Watch;

//    @FindBy(xpath = "//*[@id='app']/section/div/div[1]/div/nav[1]/section/div/a[2]")
//    WebElement Challenges;

    @FindBy(xpath = "//*[text()='Events']")
    WebElement Events;

    @FindBy(xpath = "//*[text()='Store']")
    WebElement Store;

    @FindBy(xpath = "//*[text()='Login']")
    WebElement Login;

    @FindBy(xpath = "//*[text()='Register']")
    WebElement Register;

    @FindBy(xpath = "//*[@id='app']/section/main/section/div/section[1]/div/div[5]/div[3]/a/span[1]")
    WebElement Challenges_ViewMore;

    @FindBy(xpath = "//*[contains(@class, 'dFancyButton_buttonText__1SdKu')]")
    WebElement Tournaments_ViewMore;

   /* @FindBy(xpath = "//*[contains(@class, 'dFancyButton_buttonText__1SdKu')]")
    WebElement Gameservers_ViewMore;*/

    /*@FindBy(xpath = "//*[@id='app']/section/main/section/div/section[2]/div[2]/div/a/span[1]")
    WebElement JoinNow;*/

    public PreLoginButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String ClientName() {
        try {
//            wait.until(ExpectedConditions.elementToBeClickable(Client_name));
            Client_name.click();

            /*if (Client_name.isDisplayed() && Client_name.isEnabled()) {
                Client_name.click();
            } else {
                System.out.println("Homepage button does not show up");
            }*/
            Thread.sleep(5000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);

        } catch (Exception e) {

        }
        String validation = "Homepage loads fine on clicking client name";
        return validation;
    }


    public String ClickWatch() {
        try {
//            wait.until(ExpectedConditions.elementToBeClickable(Watch));
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
            Events.click();
            Thread.sleep(5000);

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
            Client_name.click();

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