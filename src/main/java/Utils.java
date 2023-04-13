import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils extends BaseClass {

    // Login Webelements
    public float getRandomNumber() {
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    /**
     * Write the current page source to a file to download & inspect
     * 
     * @param fileName the name of the file to write to
     */
    public void writeCurrentPageSource(String fileName) {
        System.out.println(String.format("------------ writing page source to fileName: %s -----------", fileName));
        // write this out to a file in the root directory
        try {
            // get the current project directory
            String currentDir = System.getProperty("user.dir");
            System.out.println("currentDir: " + currentDir);
            String exportPath = currentDir + "/exports/";

            // create a new directory called /exports (if necessary)
            File dir = new File(exportPath);
            if (!dir.exists()) {
                dir.mkdir();
            }

            // write out the HTML
            FileWriter fw = new FileWriter(exportPath + fileName);
            fw.write(driver.getPageSource());
            fw.close();
            
            // get a screenshot from the selenium webdriver
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(exportPath + fileName + "_screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
