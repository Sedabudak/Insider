package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePages {
    public HomePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy (xpath= "(//*[@class='dropdown-icon'])[5]")
   public WebElement companyMenu;

   @FindBy(xpath = "//a[text()='Careers']")
   public WebElement careersLink;

   @FindBy(xpath = "//h2[text()='Life at Insider']")
    public WebElement LifeAtInsider;





}
