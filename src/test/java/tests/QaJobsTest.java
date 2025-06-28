package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePages;
import pages.QaPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class QaJobsTest {

    QaPages qaPages = new QaPages();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.driver;

    @BeforeMethod
    public void setup(){

        qaPages = new QaPages();
        Driver.getDriver().get(ConfigReader.getProperty("careerUrl"));

    }

    @Test
    public void QaJobsGoruntulemeTesti (){

     //Go to https://useinsider.com/careers/quality-assurance/, click “See all QA jobs”, filter
     //jobs by Location: “Istanbul, Turkey”, and Department: “Quality Assurance”, check the
     //presence of the job list

        Driver.getDriver().get(ConfigReader.getProperty("careerUrl"));
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String actualUrl = "https://useinsider.com/careers/quality-assurance/";


        Assert.assertTrue(qaPages.SeeAllQaJobs.isDisplayed());
        qaPages.SeeAllQaJobs.click();

        jse.executeScript("window.scrollBy(0, 500);");
        ReusableMethods.bekle(1);

        Assert.assertTrue(qaPages.FilterLocation.isDisplayed());
        qaPages.FilterLocation.click();
        ReusableMethods.bekle(1);



















    }

}
