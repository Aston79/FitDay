package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.DASHBOARD_PAGE;
import static pages.LoginPage.ERROR_MESSAGE;

@Log4j2
public class LoginTest extends BaseTest {

    @Test(description = "Login action")
    public void loginTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldBe(visible);
    }

    @Test(description = "Login without username")
    public void loginWithoutUserNameTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        log.info("Input just correct password");
        loginPage.login("", password);
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldNotBe(visible);
    }

    @Test(description = "Login without password")
    public void loginWithoutPasswordTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        log.info("Input just correct username");
        loginPage.login(username, "");
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldNotBe(visible);
    }

    @Test(description = "Try to login without any creds")
    public void loginWithoutCredsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        log.info("No need to fill username and password fields");
        loginPage.login("", "");
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldNotBe(visible);
    }

    @Test(description = "Try to login with incorrect creds")
    public void loginWithWrongCredsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        log.info("Input incorrect username and incorrect password");
        loginPage.login("Askold", "121212");
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldNotBe(visible);
    }

    @Test(description = "Try to login with incorrect username and correct password")
    public void loginWithIncorrectUsernameAndCorrectPasswordTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        log.info("Input incorrect username and correct password");
        loginPage.login("FitDay", password);
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldNotBe(visible);
    }

    @Test(description = "Try to login with correct username and incorrect password")
    public void loginWithCorrectUsernameAndIncorrectPasswordTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        log.info("Input correct username and incorrect password");
        loginPage.login(username, "FitDayDotCom");
        log.info("Comparison of expected and actual");
        $(DASHBOARD_PAGE).shouldNotBe(visible);
    }

    @Test(description = "Try to change password with using incorrect old password")
    public void changingPasswordWithIncorrectOldPasswordTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        log.info("Try to change old password to new one");
        loginPage.moveToProfileChangePassword();
        log.info("Input incorrect old password");
        loginPage.inputIncorrectOldPassword();
        log.info("Input new password twice");
        loginPage.inputNewPasswordAndAgain();
        log.info("Comparison of expected and actual");
        $(ERROR_MESSAGE).shouldBe(visible);
    }
}
