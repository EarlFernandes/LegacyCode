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

    public String ClickWatch() throws InterruptedException {
        try {
            if (Watch.isDisplayed()) {
                Watch.click();
                Thread.sleep(8000);
            } else {
                System.out.println("Watch button not displayed on navbar");
            }
        } catch (Exception e) {

        }
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String ClientName() throws InterruptedException {
        try {
            if (Client_name.isDisplayed()) {
                Client_name.click();
                Thread.sleep(10000);
            } else {
                System.out.println("Swarmio logo not displayed on navbar");
            }
        } catch (Exception e) {

        }
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String ClickEvents() throws InterruptedException {
        try {
            if (Events.isDisplayed()) {
                Events.click();
                Thread.sleep(12000);
            } else {
                System.out.println("Events button not displayed on navbar");
            }
        } catch (Exception e) {

        }
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String ClickStore() throws InterruptedException {
        try {
            if (Store.isDisplayed()) {
                Store.click();
                Thread.sleep(8000);
            } else {
                System.out.println("Storepage button is not displayed on Navbar");
            }
        } catch (Exception e) {

        }
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String Clicklogin() throws InterruptedException {
        try {
            if (Login.isDisplayed()) {
                Login.click();
                Thread.sleep(8000);
            } else {
                System.out.println("Login page is not displayed on navbar");
            }
        } catch (Exception e) {

        }
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String ClickRegister() throws InterruptedException {
        try {
            if (Register.isDisplayed()) {
                Register.click();
                Thread.sleep(8000);
            } else {
                System.out.println("Register page is not displayed on navbar");
            }
        } catch (Exception e) {

        }
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String ClickTournamentsViewMore() {
        try {
            if (Tournaments_ViewMore.isDisplayed()) {
                Tournaments_ViewMore.click();
                Thread.sleep(8000);
            } else {
                System.out.println("Events page is not displayed");
            }
        } catch (Exception e) {

        }

        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String EnterUsername() {
        try {
            Thread.sleep(5000);
            Username.sendKeys("earl@swarmio.media");

        } catch (Exception e) {

        }
        String validation = "Username was entered fine";
        return validation;
    }

    public String EnterPassword() {
        try {
            Thread.sleep(5000);
            Password.sendKeys("qapass1234");

        } catch (Exception e) {

        }
        String validation = "Password was entered fine";
        return validation;
    }

    public String ClickLoginButton() {
        try {
            Thread.sleep(5000);
            LoginButton.click();

        } catch (Exception e) {

        }
        String validation = "User was logged in";
        return validation;
    }

}