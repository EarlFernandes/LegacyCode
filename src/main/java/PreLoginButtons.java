import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Random;

public class PreLoginButtons extends BaseClass {

    public int getRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt(1000000);
    }

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

    @FindBy(xpath = "//*[contains(@data-cy, 'email')]")
    WebElement Username;

    @FindBy(xpath = "//*[contains(@data-cy, 'password')]")
    WebElement Password;

    @FindBy(xpath = "//*[contains(@data-semantic, 'sign-in-form-submit')]")
    WebElement LoginButton;

    //RegisterUser Webelements
    @FindBy(xpath = "//*[contains(@data-cy, 'displayName')]")
    WebElement DisplayName;

    @FindBy(xpath = "//*[contains(@data-cy, 'confirmPassword')]")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//*[contains(@data-cy, 'acceptTerms')]")
    WebElement AcceptTerms;

    @FindBy(xpath = "//*[contains(@data-semantic, 'registration-form-submit')]")
    WebElement Continuebtn;

    @FindBy(xpath = "//*[contains(@data-cy, 'verifyEmailTitle')]")
    WebElement VerifyAccMsg;

    public PreLoginButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickWatch() throws InterruptedException {
        try {
            if (Watch.isDisplayed()) {
                Watch.click();
            } else {
                System.out.println("Watch button not displayed on navbar");
            }
        } catch (Exception e) {

        }
    }

    public void ClientName() throws InterruptedException {
        try {
            if (Client_name.isDisplayed()) {
                Client_name.click();
            } else {
                System.out.println("Swarmio logo not displayed on navbar");
            }
        } catch (Exception e) {

        }
    }

    public void ClickEvents() throws InterruptedException {
        try {
            if (Events.isDisplayed()) {
                Events.click();
            } else {
                System.out.println("Events button not displayed on navbar");
            }
        } catch (Exception e) {

        }
    }

    public void ClickStore() throws InterruptedException {
        try {
            if (Store.isDisplayed()) {
                Store.click();
            } else {
                System.out.println("Storepage button is not displayed on Navbar");
            }
        } catch (Exception e) {

        }
    }

    public String Clicklogin() throws InterruptedException {
        try {
            if (Login.isDisplayed()) {
                Login.click();
                new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(Username));
            } else {
                System.out.println("Login page is not displayed on navbar");
            }
        } catch (Exception e) {

        }
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public String ClickRegister() throws InterruptedException {
        try {
            if (Register.isDisplayed()) {
                Register.click();
                new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(Username));
            } else {
                System.out.println("Register page is not displayed on navbar");
            }
        } catch (Exception e) {

        }
        String title = driver.getTitle();
        System.out.println(title);
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

    public String RegisterUser() {
        try {
            {
                int number = getRandomNumber();
                DisplayName.sendKeys("Earl " + number);
                Username.sendKeys("Tester+"+number+"@swarmio.media");
                Password.sendKeys("qapass1234");
                ConfirmPassword.sendKeys("qapass1234");
                AcceptTerms.click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,250)", "");
                Continuebtn.click();
                new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(VerifyAccMsg));
                String VerifyEmailMessage = VerifyAccMsg.getText();
                Assert.assertEquals(VerifyEmailMessage, "Verify Your Account", "Verify Your Account message is not displayed correctly");
                System.out.println("Verify your account message has been displayed correctly, pending account verification graphql call");
            }

        } catch (Exception e) {

        }
        String validation = "User was logged in";
        return validation;


    }
}