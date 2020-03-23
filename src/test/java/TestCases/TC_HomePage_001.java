package TestCases;

import PageObjects.*;
import org.testng.annotations.Test;

public class TC_HomePage_001 extends Base
{
    @Test
    public void openHomePage()
    {
        logger.info("WebPage Opened");
        HomePage hp = new HomePage(driver);
                hp.checkPageTitle();
        logger.warn("Completed Task");
    }
}
