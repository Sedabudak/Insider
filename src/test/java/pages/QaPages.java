package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaPages {

    public QaPages() {PageFactory.initElements(Driver.getDriver(), this);}

  @FindBy (xpath = "//a[.='See all QA jobs']")
    public WebElement SeeAllQaJobs;

  @FindBy (id = "select2-filter-by-location-container")
    public WebElement FilterLocation;

  @FindBy (xpath = "//*[text()='Istanbul, Turkiye']")
    public WebElement Istanbul;

  @FindBy (xpath = "//*[text()='Quality Assurance']")
    public WebElement FilterDepartment;



}
