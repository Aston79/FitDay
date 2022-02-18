package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.DashBoardPage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.ReportsPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
public abstract class BaseTest {

    String username, password;
    public LoginPage loginPage;
    public DashBoardPage dashBoardPage;
    public ReportsPage reportsPage;
    public LogOutPage logOutPage;

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp() {
        log.info("Setup options and configurations.");
        if (browser.equals("chrome")) {
            Configuration.browser = "chrome";
        } else if (browser.equals("firefox")) {
            Configuration.browser = ("firefox");
        } else if (browser.equals("edge")) {
            Configuration.browser = "edge";
        }
        Configuration.baseUrl = System.getenv().getOrDefault("FITDAY_URL", PropertyReader.getProperty("fitDay.url")); //"https://www.fitday.com/fitness";
        username = System.getenv().getOrDefault("FITDAY_USERNAME", PropertyReader.getProperty("fitDay.username"));
        password = System.getenv().getOrDefault("FITDAY_PASSWORD", PropertyReader.getProperty("fitDay.password"));
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        System.setProperty("webdriver.gecko.driver", "C:\\Projects\\geckodriver-v0.30.0-win64\\GeckoDriver.exe");
//        Configuration.headless = true;
        Configuration.browserSize = "1280x960";
        Configuration.browserPosition = "0x0";
        Configuration.clickViaJs = true;
        Configuration.savePageSource = false;
        Configuration.timeout = 20000;
        Configuration.pageLoadTimeout = 30000;
        Configuration.reportsFolder = "test-result/reports";

        loginPage = new LoginPage();
        logOutPage = new LogOutPage();
        dashBoardPage = new DashBoardPage();
        reportsPage = new ReportsPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("Browser close.");
        getWebDriver().quit();
    }
}
