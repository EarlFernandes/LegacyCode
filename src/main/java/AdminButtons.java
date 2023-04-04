import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

//    @FindBy(xpath = "//*[contains(@type, 'submit')]")
    @FindBy(xpath = "//*[contains(@class, 'MuiButton')]//*[text() = 'Save']")
    WebElement Save;

//    @FindBy(xpath = "//*[text() = 'Id']/parent::*/following-sibling::*/span")
    @FindBy(xpath = "//*[@id='react-admin-title']/span")
//    @FindBy(xpath = "//*[contains(@class, 'MuiTypography-root jss116 MuiTypography-h6 MuiTypography-colorInherit')]/span")
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
            if(ParticipantType.isDisplayed()) {
                ParticipantType.click();
                System.out.println("ParticipantType dropdown opened");
            }
            else {
                System.out.println("ParticipantType dropdown not opened");
            }
            if(IndividualParticipantType.isDisplayed()) {
                IndividualParticipantType.click();
                System.out.println("IndividualParticipantType from dropdown has been selected");
            }
            else {
                System.out.println("IndividualParticipantType from dropdown has not been selected");
            }
            if(CompetitionType.isDisplayed()) {
                CompetitionType.click();
                System.out.println("CompetitionType dropdown is opened");
            }
            else{
                System.out.println("CompetitionType dropdown is not opened");
            }
            if(TournamentType.isDisplayed()) {
                TournamentType.click();
                System.out.println("TournamentType is selected from dropdown");
            }
            else{
                System.out.println("TournamentType is not selected from dropdown");
            }
            if(TournamentFormat.isDisplayed()) {
                TournamentFormat.click();
                System.out.println("TournamentFormat dropdown is opened");
            }
            else {
                System.out.println("TournamentFormat dropdown is not opened");
            }
            if(SingleElimination.isDisplayed()) {
                SingleElimination.click();
                System.out.println("SingleElimination is selected from dropdown");
            }
            else {
                System.out.println("SingleElimination is not selected from dropdown");
            }
            if(Game.isDisplayed()) {
                Game.click();
                System.out.println("Game dropdown has been opened");
            }
            else {
                System.out.println("Game dropdown has not been opened");
            }
            if(LeagueofLegends.isDisplayed()) {
                LeagueofLegends.click();
                System.out.println("LeagueofLegends has been selected from dropdown");
            }
            else {
                System.out.println("LeagueofLegends has not been selected from dropdown");
            }
            if(GameAccType.isDisplayed()) {
                GameAccType.click();
                System.out.println("GameAccType dropdown has been opened");
            }
            else{
                System.out.println("GameAccType dropdown has not been opened");
            }
            if(GameAccTypeID.isDisplayed()) {
                GameAccTypeID.click();
                System.out.println("GameAccTypeID has been selected from dropdown");
            }
            else{
                System.out.println("GameAccTypeID has not been selected from dropdown");
            }

            if(StartTime.isDisplayed()) {
                StartTime.sendKeys("002023-12-310200AM");
                System.out.println("StartTime has been entered");
            }
            else {
                System.out.println("StartTime has not been entered");
            }
            if(RegistrationOpen.isDisplayed()) {
                RegistrationOpen.sendKeys("002023-03-270200AM");
                System.out.println("RegistrationOpen time has been entered");
            }
            else {
                System.out.println("RegistrationOpen time has not been entered");
            }
            if(RegistrationClose.isDisplayed()) {
                RegistrationClose.sendKeys("002023-12-310100AM");
                System.out.println("RegistrationClose time has been entered");
            }
            else {
                System.out.println("RegistrationClose time has not been entered");
            }
            if(DetailsTab.isDisplayed()) {
                DetailsTab.click();
                System.out.println("DetailsTab has been opened");
            }
            else {
                System.out.println("DetailsTab has not been opened");
            }
            Thread.sleep(2000);
            if(Category.isDisplayed()) {
                Category.click();
                System.out.println("Category dropdown has been opened");
            }
            else {
                System.out.println("Category dropdown has not been opened");
            }
            if(CategoryType.isDisplayed()) {
                CategoryType.click();
                System.out.println("CategoryType has been selected");
            }
            else {
                System.out.println("CategoryType has not been selected");
            }
            if(Region.isDisplayed()) {
                Region.click();
                System.out.println("Region dropdown has been opened");
            }
            else {
                System.out.println("Region dropdown has not been opened");
            }
            if(RegionType.isDisplayed()) {
                RegionType.click();
                System.out.println("RegionType has been selected from dropdown");
            }
            else {
                System.out.println("RegionType has not been selected from dropdown");
            }
            if(LocalizedEventType.isDisplayed()) {
                LocalizedEventType.click();
                System.out.println("LocalizedEventType has been opened");
            }
            else {
                System.out.println("LocalizedEventType has not been opened");
            }

            DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date = new Date();
            String date1 = dateformat.format(date);

            if(LocalizedName.isDisplayed()) {
                LocalizedName.sendKeys("Event " + date1);
                System.out.println("LocalizedName of the event has been added");
            }
            else {
                System.out.println("LocalizedName of the event has not been added");
            }
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", "");
            Thread.sleep(2000);
            if(Save.isDisplayed()) {
//                Save.click();
                String element_text = Save.getText();
                String classAttribute = Save.getAttribute("class");
                String tagname = Save.getTagName();
                String width = Save.getCssValue("width");
                System.out.println(element_text);
                System.out.println(classAttribute);
                System.out.println(tagname);
                System.out.println(width);
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", Save);
            }
            else {
                System.out.println("Event has not been saved");
            }
            Thread.sleep(12000);

        } catch (Exception e) {

        }

        String Eventid = EventID.getText();
        System.out.println("Current string is: "+Eventid);
        String Eventid2 = Eventid.substring(8,44);
//        String Eventid2 = "Event has been created";
        return Eventid2;
    }





}
