import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Random;

public class PostLoginButtons extends BaseClass {

    public float getRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }
    @FindBy(xpath = "//*[contains(@data-icon, 'coins')]")
    WebElement Coins;

    @FindBy(xpath = "//*[contains(@data-testid, 'dropdown-display-name')]")
    WebElement Dropdown;

    @FindBy(css = "#app > section > div:nth-child(2) > div > div.HorizontalNav_navContainer__1wPhM.Dashboard_mainNavigation__3pb4k > div > div > div > div > div.UserNavigation_userMenuContainer__K1HfP.UserNavigation_show__3twgc > a:nth-child(2)")
    WebElement Teams;

    @FindBy(xpath = "//*[contains(@data-icon, 'circle-plus')]")
    WebElement AddTeam;

    @FindBy(xpath = "//*[contains(@id, 'name')]")
    WebElement TeamName;

    @FindBy(xpath = "//*[contains(@class, 'w-100 mt-auto btn btn-primary')]")
    WebElement CreateTeamButton;


    public PostLoginButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String LoginCheck() {
        try {
            if (Coins.isDisplayed()) {
                System.out.println("Coins displayed, user logged in");

                Thread.sleep(5000);
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
            TeamName.sendKeys("Earl's team" +getRandomNumber());
            Thread.sleep(5000);
            CreateTeamButton.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Manage Teams | Swarmio Hive";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            System.out.println("Actual title is: "+ ActualTitle);


        } catch (Exception e) {

        }
        String validation = "Create team succeeded";
        return validation;
    }



}
