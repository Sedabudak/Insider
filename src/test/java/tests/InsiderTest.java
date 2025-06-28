package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class InsiderTest {

    HomePages homePages;

    @BeforeMethod
    public void setup(){

        homePages = new HomePages ();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @Test
    public void AnasayfaGoruntulemeTesti () {

        // Visit https://useinsider.com/ and check Insider home page is opened or not

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String actualUrl = "https://useinsider.com/";
    }

    @Test
    public void CompanyVeKariyerSayfasiTesti () {
        //Select the “Company” menu in the navigation bar, select “Careers” and check Career
        //page, its Locations, Teams, and Life at Insider blocks are open or not


        Assert.assertTrue(homePages.companyMenu.isDisplayed());
        homePages.companyMenu.click();

        Assert.assertTrue(homePages.careersLink.isDisplayed());
        homePages.careersLink.click();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.driver;

        try {

            jse.executeScript("window.scrollBy(0, 4000);", homePages.LifeAtInsider);
            ReusableMethods.bekle(1);

            Assert.assertTrue(homePages.LifeAtInsider.isDisplayed());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

















































}
