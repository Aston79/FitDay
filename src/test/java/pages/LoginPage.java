package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class LoginPage extends BasePage {

    public static final SelenideElement USERNAME_INPUT = $(By.xpath("//*[@id=\"username\"]"));
    public static final SelenideElement PASSWORD_INPUT = $(By.xpath("//*[@id=\"form-login\"]/p[2]/input"));
    public static final SelenideElement LOGIN_BUTTON = $(By.xpath("//*[@id=\"form-login\"]/p[4]/input"));
    public static final SelenideElement HOME_PAGE = $(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a/span"));
    public static final SelenideElement PROFILE_PAGE = $(By.xpath("//*[@id=\"menu\"]/div/ul[1]/li[3]/a"));
    public static final SelenideElement CHANGE_PASSWORD_PAGE = $(By.xpath("//*[@id=\"j-profile-user\"]/table/tbody/tr[1]/td[2]/a"));
    public static final SelenideElement OLD_PASSWORD = $(By.name("OldPassword"));
    public static final SelenideElement NEW_PASSWORD1 = $(By.name("Password1"));
    public static final SelenideElement NEW_PASSWORD2 = $(By.name("Password2"));
    public static final SelenideElement SAVE_NEW_PASS_BUTTON = $(By.xpath("//*[@id=\"container\"]/div[2]/form/p[4]/input"));
    public static final SelenideElement DASHBOARD_PAGE = $(By.xpath("//*[@id=\"main\"]/h1"));
    public static final SelenideElement ERROR_MESSAGE = $(By.xpath("//*[@id=\"container\"]/div[2]/div"));

    @Step("Opening page")
    public void openPage() {
        open("/login.html");
    }

    @Override
    public boolean isPageOpened() {
        return isExist(LOGIN_BUTTON);
    }

    @Step("Login as user '{userName}' use password '{password}'")
    @Description(value = "Login with valid data")
    public void login(String username, String password) {
        log.info("Login with valid data");
        $(USERNAME_INPUT).sendKeys(username);
        $(PASSWORD_INPUT).sendKeys(password);
        $(LOGIN_BUTTON).click();
    }

    @Step("Move to Profile")
    @Description("Move to profile for an password changing")
    public void moveToProfileChangePassword() {
        log.info("Move to profile for an password changing");
        $(HOME_PAGE).click();
        $(PROFILE_PAGE).click();
        $(CHANGE_PASSWORD_PAGE).click();
    }

    @Step("Input Password")
    @Description("Input incorrect 'old' password")
    public void inputIncorrectOldPassword() {
        log.info("Input incorrect 'old' password");
        $(OLD_PASSWORD).sendKeys("121212");
    }

    @Step("Input new password")
    @Description("Input new password twiсe")
    public void inputNewPasswordAndAgain() {
        log.info("Input new password twiсe");
        $(NEW_PASSWORD1).sendKeys("qwerty");
        $(NEW_PASSWORD2).sendKeys("qwerty");
        $(SAVE_NEW_PASS_BUTTON).click();
    }
}
