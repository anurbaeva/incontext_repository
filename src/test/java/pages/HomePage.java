package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    WebDriver driver;

    public HomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[@class='st-search-show-outputs st-ui-search-tab']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@class='st-default-search-input st-search-set-focus']")
    public WebElement searchField;

    @FindBy(id = "hs-eu-cookie-confirmation")
    public WebElement cookiePopUp;

    @FindBy(id = "hs-eu-decline-button")
    public  WebElement cookieDeclineButton;

    @FindBy(id = "hs-eu-confirmation-button")
    public  WebElement cookieAcceptButton;

    @FindBy (id = "bi-widget-exitimage")
    public WebElement advertisePopUp;

    @FindBy (xpath = "//div[@class='st-autocomplete-results']//div[@class='st-query-present']/a[1]")
    public WebElement firstAutoSuggestedResult;

//    @FindBy (xpath = "//section[contains(@class,'st-ui-content st-search-results')]//a[1]")
//    public WebElement FirstAutoSuggestedResult1;

    @FindBy (xpath = "//section[@class='st-ui-content st-search-results']//a[@data-st-result-doc-id='5a7b380a07552350689a85c7']")
    public WebElement AutoSuggestedMixedReality;




}
