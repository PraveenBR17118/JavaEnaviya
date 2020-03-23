package TestCases;

import PageObjects.*;
import io.qameta.allure.*;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


@Listeners({AllureListener.class})
public class Test1Allure extends BaseClass
{
    public WebDriver driver;
    public HomePage hp;

    @BeforeClass
    public void setup()
    {
        BaseClass b1 = new BaseClass();
        driver=b1.initialize_driver();
        driver.get("https://www.enaviya.com/");
        //driver.manage().window().maximize();

    }

    @Test(priority = 1,description = "Verify logo is displayed")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify logo is presence in home page......")
    @Epic("EP001")
    @Feature("Feature1 : Logo")
    @Story("Story : Logo Presence")
    public void logoIsPresent()
    {
     hp = new HomePage(driver);
     boolean b1 = hp.logoIsDisplayed();
        Assert.assertTrue(b1);
    }

    @Test(priority = 2, description = "Verify Page title")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify the page title.......")
    @Epic("EP001")
    @Feature("Feature2 : Page Title")
    @Story("Story : Page Title displayed")
    public void getPageTitle()
    {
        hp = new HomePage(driver);
        String s1 = hp.checkPageTitle();
        Assert.assertEquals(s1,"Bridging the Gap Between Business and Technology");
    }


    @Test(priority = 4,description = "Verify company year")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify company year.....!")
    @Epic("EP001")
    @Feature("Feature4 : Company year")
    @Story("Story : Company Opened")
    public void companyString()
    {
        hp = new HomePage(driver);
        String h1= hp.getCompanyYear();
        Assert.assertEquals(h1,"Custom Software Development Company in India Since 2006");
    }

    @Test(priority = 5,description = "Verify enquiry button is clickable")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify enquiry button is clickable...!")
    @Epic("EP001")
    @Feature("Feature5 : Enquiry Button ")
    @Story("Story : enquiry Button ")
    public void enquiryButtonEnabled()
    {
        hp = new HomePage(driver);
        hp.checkEnquiryButtonClickable();
    }

    @Test(priority = 6,description = "Verify T&E Management Software is displayed")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify T&E Management Software is displayed")
    @Epic("EP001")
    @Feature("Feature6 : T&E Management ")
    @Story("Story : Travel Expense ")
    public void verifyTravelAndExpenseIsDisplayed()
    {
        hp = new HomePage(driver);
        hp.verifyTravelAndExpenseIsDisplayed();
    }


    @Test(priority = 7,description = "Verify Procurement Management Software is displayed")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify ProcurementE Management Software is displayed")
    @Epic("EP001")
    @Feature("Feature7 : Procurement Management ")
    @Story("Story : Procurement Management ")
    public void verifyProcurementManagementIsDisplayed()
    {
        hp = new HomePage(driver);
        hp.verifyProcurementManagementIsDisplayed();
    }

    @Test(priority = 8,description = "Verify Auction Management Software is displayed")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Auction Management Software is displayed")
    @Epic("EP001")
    @Feature("Feature8 : Auction Management ")
    @Story("Story : Auction Management ")
    public void verifyAuctionManagementIsDisplayed()
    {
        hp = new HomePage(driver);
        hp.verifyAuctionManagementIsDisplayed();
    }

    @Test(priority = 9,description = "Verify Expertise button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Expertise button is enabled...!")
    @Epic("EP001")
    @Feature("Feature9 : Expertise button ")
    @Story("Story : Expertise button enabled ")
    public void verifyExpertiseButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.expertiseButtonIsEnabled();
    }

    @Test(priority = 10,description = "Verify Service button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Service button is enabled...!")
    @Epic("EP001")
    @Feature("Feature10 : Service button ")
    @Story("Story : Service button enabled ")
    public void verifyServiceButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.serviceButtonIsEnabled();
    }

    @Test(priority = 11,description = "Verify Solution button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Solution button is enabled...!")
    @Epic("EP001")
    @Feature("Feature11 : Solution button ")
    @Story("Story : Solution button enabled ")
    public void verifySolutionButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.solutionsButtonIsEnabled();
    }

    @Test(priority = 12,description = "Verify Products button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Products button is enabled...!")
    @Epic("EP001")
    @Feature("Feature12 : Products button ")
    @Story("Story : Products button enabled ")
    public void verifyProductsButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.productsButtonIsEnabled();
    }

    @Test(priority = 13,description = "Verify Industries button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Industries button is enabled...!")
    @Epic("EP001")
    @Feature("Feature13 : Industries button ")
    @Story("Story : Industries button enabled ")
    public void verifyIndustriesButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.industriesButtonIsEnabled();
    }

    @Test(priority = 14,description = "Verify Company button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Company button is enabled...!")
    @Epic("EP001")
    @Feature("Feature14 : Company button ")
    @Story("Story : Company button enabled ")
    public void verifyCompanyButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.companyButtonIsEnabled();
    }

    @Test(priority = 15,description = "Verify Contact button is enabled")
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Contact button is enabled...!")
    @Epic("EP001")
    @Feature("Feature15 : Contact button ")
    @Story("Story : Contact button enabled ")
    public void verifyContactButtonIsEnabled()
    {
        hp = new HomePage(driver);
        hp.contactButtonIsEnabled();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hp.scrollTillSoftwareDevelopmentServices();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Test(priority = 17,description = "Verify service button drop down box")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify service button drop down box")
    @Epic("EP001")
    @Feature("Feature17 : Drop down box")
    @Story("Story : Drop down box display...!")
    public void mouseoversToServiceButton() throws InterruptedException
    {
        hp = new HomePage(driver);
        hp.mouseOverToServiceButton();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
