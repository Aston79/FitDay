package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class LogOutPage extends BasePage {

    public static final By PROFILE_LINK = By.id("profile-link");

    @Override
    public boolean isPageOpened() {
        log.info("The page must be opened");
        return isExist((SelenideElement) PROFILE_LINK);
    }

    public static final SelenideElement LOG_OUT_BUTTON = $(By.xpath("//*[@id=\"header-menu\"]/ul[1]/li[2]/a"));
    public static final SelenideElement LOG_IN_BUTTON = $(By.xpath("//*[@id=\"form-login\"]/p[4]/input"));

    @Step("Logout")
    public void loggingOut() {
        log.info("Click on LogOut button");
        $(LOG_OUT_BUTTON).click();
    }
}
