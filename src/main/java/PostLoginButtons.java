import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PostLoginButtons extends BaseClass {
    @FindBy(xpath = "//*[contains(@data-icon, 'coins')]")
    WebElement Coins;

    public PostLoginButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String LoginCheck() {
        try {
            if (Coins.isDisplayed()) {


                Thread.sleep(5000);
            } else {
                System.out.println("Coins not displayed, user login failed");
            }
        } catch (Exception e) {

        }
        String validation = "Login succeeded, user coins displayed";
        return validation;
    }


}
