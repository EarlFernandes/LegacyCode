import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AdminButtons extends BaseClass {


    //Login Webelements
    public float getRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    //Authentication
    @FindBy(xpath = "//*[@id='username']")
    WebElement Username;

    @FindBy(xpath = "//*[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//*[@class='MuiCardActions-root MuiCardActions-spacing']")
    WebElement SignIn;

    @FindBy(xpath = "//*[contains(@class, 'MuiSvgIcon-root')]//*[text() = 'Events']")
    WebElement Events;

    @FindBy(xpath = "//*[contains(@class, 'jss')]//*[text() = 'Create']")
    WebElement CreateEvent;

    @FindBy(xpath = "//*[@id='participantType']")
    WebElement ParticipantType;

    @FindBy(xpath = "//*[contains(@data-value, 'IndividualParticipantType')]")
    WebElement IndividualParticipantType;

    @FindBy(xpath = "//*[@id='competitionType']")
    WebElement CompetitionType;

    @FindBy(xpath = "//*[contains(@data-value, 'tournament')]")
    WebElement TournamentType;

    @FindBy(xpath = "//*[@id='tournamentFormat']")
    WebElement TournamentFormat;

    @FindBy(xpath = "//*[contains(@data-value, 'PrunedSingleElimination')]")
    WebElement SingleElimination;

    @FindBy(xpath = "//*[@id='gameId']")
    WebElement Game;

    @FindBy(xpath = "//*[contains(@data-value, 'LeagueOfLegends')]")
    WebElement LeagueofLegends;

    @FindBy(xpath = "//*[@id='gameAccountTypeIds']")
    WebElement GameAccType;

    @FindBy(xpath = "//*[@id='downshift-2-item-0']")
    WebElement GameAccTypeID;

    @FindBy(xpath = "//*[@id='eventTiming.startTime']")
    WebElement StartTime;

    @FindBy(xpath = "//*[@id='eventTiming.registrationOpen']")
    WebElement RegistrationOpen;

    @FindBy(xpath = "//*[@id='eventTiming.registrationClose']")
    WebElement RegistrationClose;

    @FindBy(xpath = "//*[@id='tabheader-/Event/create/1']")
    WebElement DetailsTab;

    @FindBy(xpath = "//*[@id='category']")
    WebElement Category;

    @FindBy(xpath = "//*[contains(@data-value, 'Tournament')]")
    WebElement CategoryType;

    @FindBy(xpath = "//*[@id='region']")
    WebElement Region;

    @FindBy(xpath = "//*[contains(@data-value, 'EUROPE')]")
    WebElement RegionType;

    @FindBy(xpath = "//*[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text button-add button-add-localizedNames MuiButton-textSizeSmall MuiButton-sizeSmall')]")
    WebElement LocalizedEventType;

    @FindBy(xpath = "//*[@id='localizedNames[0].value']")
    WebElement LocalizedName;

    @FindBy(xpath = "//*[contains(@type, 'submit')]")
    WebElement Save;

//    @FindBy(xpath = "//*[text() = 'Id']/parent::*/following-sibling::*/span")
//    @FindBy(xpath = "//*[@id='react-admin-title']/span")
    @FindBy(xpath = "//*[contains(@class, 'MuiTypography-root jss116 MuiTypography-h6 MuiTypography-colorInherit')]/span")
    WebElement EventID;

    public AdminButtons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String EventCreate() {
        try {
            Username.sendKeys("earl@swarmio.media");
            Password.sendKeys("qapass1234");
            SignIn.click();
            Thread.sleep(5000);
//            Events.click();
//            Thread.sleep(5000);
            CreateEvent.click();
            Thread.sleep(5000);
            ParticipantType.click();
            IndividualParticipantType.click();
            Thread.sleep(5000);
            CompetitionType.click();
            TournamentType.click();
            TournamentFormat.click();
            SingleElimination.click();
            Game.click();
            LeagueofLegends.click();
            GameAccType.click();
            GameAccTypeID.click();


            StartTime.sendKeys("002023-12-310200AM");
            RegistrationOpen.sendKeys("002023-03-270200AM");
            RegistrationClose.sendKeys("002023-12-310100AM");
            DetailsTab.click();
            Category.click();
            CategoryType.click();
            Region.click();
            RegionType.click();
            LocalizedEventType.click();

            DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date = new Date();
            String date1 = dateformat.format(date);

            LocalizedName.sendKeys("Event "+ date1);
            Thread.sleep(5000);
            Save.click();
            Thread.sleep(5000);

        } catch (Exception e) {

        }

        String Eventid = EventID.getText();
        System.out.println("Current string is: "+Eventid);
        String Eventid2 = Eventid.substring(8,44);
//        String Eventid2 = "Event has been created";
        return Eventid2;
    }





}
