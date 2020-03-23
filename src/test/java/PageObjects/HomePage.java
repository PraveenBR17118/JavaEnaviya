package PageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class HomePage
{
    public WebDriver driver;
    public Actions act;
    public HomePage(WebDriver rdriver)
    {
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[@id='logo']/a/img")
    @CacheLookup
    WebElement Logo;
    public Boolean logoIsDisplayed()
    {
        System.out.println("Logo is displayed " + Logo.isDisplayed());
        return Logo.isDisplayed();
    }

    @FindBy(xpath = "//*[@id='bannerArea']/div[1]/div/div/div/div[1]/div[1]/h2")
    @CacheLookup
    WebElement Pagetitle;
    public String checkPageTitle()
    {
        String st = Pagetitle.getText();
        System.out.println(st);
        return st;
    }


    @FindBy(xpath = "//*[@id='bannerArea']/div[1]/div/div/div/div[1]/div[1]/h3")
    @CacheLookup
    WebElement StringCompanyYear;
    public String getCompanyYear()
    {
        return StringCompanyYear.getText();
    }

    @FindBy(xpath = "//*[@id='bannerArea']/div[1]/div/div/div/div[1]/div[2]/div[1]/a")
    @CacheLookup
    WebElement EnquiryButton;
    public void checkEnquiryButtonClickable()
    {
        System.out.println("Enquiry Button is enabled " +EnquiryButton.isEnabled());
    }

    @FindBy(xpath = "//*[@id='ServicesContainer']/div[2]/div[2]/div[1]/div/div")
    @CacheLookup
    WebElement TravelingExpense;
    public void verifyTravelAndExpenseIsDisplayed()
    {
        act = new Actions(driver);
        act.moveToElement(TravelingExpense).perform();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    @FindBy(xpath = "//*[@id='ServicesContainer']/div[2]/div[2]/div[2]/div/div/div/div/div/p")
    @CacheLookup
    WebElement ProcurementManagement;
    public void verifyProcurementManagementIsDisplayed()
    {
        act = new Actions(driver);
        act.moveToElement(ProcurementManagement).perform();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    @FindBy(xpath = "//*[@id='ServicesContainer']/div[2]/div[2]/div[3]/div/div/div/div/div/p")
    @CacheLookup
    WebElement AuctionManagement;
    public void verifyAuctionManagementIsDisplayed()
    {
        act = new Actions(driver);
        act.moveToElement(AuctionManagement).perform();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//*[@id='dnn_Superfish']/li[1]/a")
    @CacheLookup
    WebElement ExpertiseButton;
    public void expertiseButtonIsEnabled()
    {
        System.out.println("Expertise Button is enabled : " + ExpertiseButton.isEnabled());
    }

    @FindBy(xpath = "//*[@id='dnn_Superfish']/li[2]/a")
    @CacheLookup
    WebElement ServiceButton;
    public void serviceButtonIsEnabled()
    {
        System.out.println("Service Button is enabled : " + ServiceButton.isEnabled());
    }

    @FindBy(xpath = "//a[@title='Solutions']")
    @CacheLookup
    WebElement SolutionsButton;
    public void solutionsButtonIsEnabled()
    {
        System.out.println("Solutions Button is enabled : " + SolutionsButton.isEnabled());
    }

    @FindBy(xpath = "//a[@title='Products']")
    @CacheLookup
    WebElement ProductsButton;
    public void productsButtonIsEnabled()
    {
        System.out.println("Products Button is enabled : " + ProductsButton.isEnabled());
    }

    @FindBy(xpath = "//a[@title='Industries']")
    @CacheLookup
    WebElement IndustriesButton;
    public void industriesButtonIsEnabled()
    {
        System.out.println("Industries Button is enabled : " + IndustriesButton.isEnabled());
    }

    @FindBy(xpath = "(//a[@title='Software Development Company'])[1]")
    @CacheLookup
    WebElement CompanyButton;
    public void companyButtonIsEnabled()
    {
        System.out.println("Company Button is enabled : "+CompanyButton.isEnabled());
    }

    @FindBy(xpath = "//a[@title='Contact']")
    @CacheLookup
    WebElement ContactButton;
    public void contactButtonIsEnabled()
    {
        System.out.println("Contact Button is enabled : " + ContactButton.isEnabled());
    }

    @FindBy(xpath = "//h2[@class='Head']")
    @CacheLookup
    WebElement SoftwareDevelopmentServices;
    public void scrollTillSoftwareDevelopmentServices()
    {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",SoftwareDevelopmentServices);
    }

    @FindBy(xpath = "//a[@title='Expertise']")
    @CacheLookup
    WebElement ExpertiseMouseOver;
    public void mouseOverToExpertiseButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(ExpertiseMouseOver).perform();

        Thread.sleep(5000);
    }

    @FindBy(xpath = "//*[@id='dnn_Superfish']/li[2]/a")
    @CacheLookup
    WebElement ServiceMouseOver;
    public void mouseOverToServiceButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(ServiceMouseOver).perform();

        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[@title='Solutions']")
    @CacheLookup()
    WebElement SolutionsMouseOver;
    public void mouseOverToSolutionsButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(SolutionsMouseOver).perform();

        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[@title='Products']")
    @CacheLookup
    WebElement ProductsMouseOver;
    public void mouseOverToProductsButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(ProductsMouseOver).perform();

        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[@title='Industries']")
    @CacheLookup
    WebElement IndustriesMouseOver;
    public void mouseOverToIndustriesButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(IndustriesMouseOver).perform();

        Thread.sleep(5000);
    }

    @FindBy(xpath = "(//a[@title='Software Development Company'])[1]")
    @CacheLookup
    WebElement CompanyMouseOver;
    public void mouseOverToCompanyButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(CompanyMouseOver).perform();

        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[@title='Contact']")
    @CacheLookup
    WebElement ContactMouseOver;
    public void mouseOverToContactButton() throws InterruptedException
    {
        act = new Actions(driver);
        act.moveToElement(ContactMouseOver).perform();

        Thread.sleep(5000);
    }
}
