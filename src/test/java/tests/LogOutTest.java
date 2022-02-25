package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.LogOutPage.IMAGE_OF_LOGIN_PAGE;
import static pages.LogOutPage.LOG_IN_BUTTON;

@Log4j2
public class LogOutTest extends BaseTest {

    @Test
    public void logOut() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        logOutPage.loggingOut();
        log.info("Comparison of expected and actual");
        $(LOG_IN_BUTTON).shouldBe(visible);
    }
}
