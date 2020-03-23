package TestCases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class Base
{
    public static WebDriver driver;

    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public static void setUp(String br)
    {
        logger = Logger.getLogger("Enaviya");
        PropertyConfigurator.configure("Log4j.properties");


        if(br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:/GitRepository/enaviya/chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","D:/GitRepository/enaviya/geckodriver.exe");
            driver = new FirefoxDriver();
        }
//        System.setProperty("webdriver.chrome.driver","D:/GitRepository/enaviya/chromedriver.exe");
//        driver = new ChromeDriver();
        logger.info("Opened Browser");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.enaviya.com/");


    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
