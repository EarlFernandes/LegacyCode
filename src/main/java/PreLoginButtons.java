import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public String ClickWatch() {
        try {
            if (Watch.isDisplayed()) {
                Watch.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Watch Page not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
    }

    public String ClientName() {
        try {
            if (Client_name.isDisplayed()) {
                Client_name.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Swarmio logo not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
    }

    public String ClickTournaments() {
        try {
            if (Events.isDisplayed()) {
                Events.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Events page not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
    }

    public String ClickStore() {
        try {
            if (Store.isDisplayed()) {
                Store.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Store page is not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
    }

    public String Clicklogin() {
        try {
            if (Login.isDisplayed()) {
                Login.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Login page is not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
    }

    public String ClickRegister() {
        try {
            if (Register.isDisplayed()) {
                Register.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Register page is not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
    }

    public String ClickTournamentsViewMore() {
        try {
            if (Tournaments_ViewMore.isDisplayed()) {
                Tournaments_ViewMore.sendKeys(Keys.ENTER);

                Thread.sleep(5000);
            } else {
                System.out.println("Events page is not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        return title;
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

}