package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.*;

@Log4j2
public class ReportsPage extends BasePage {
    //Main reports bar
    public static final SelenideElement REPORTS_BUTTON = $(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a/span"));
    public static final SelenideElement REPORTS_CALORIE = $(By.xpath("//*[@id=\"menu\"]/div/ul[3]/li[1]/a"));
    public static final SelenideElement REPORTS_NUTRITION = $(By.xpath("//*[@id=\"menu\"]/div/ul[3]/li[2]/a"));
    public static final SelenideElement REPORTS_WEIGHT = $(By.xpath("//*[@id=\"menu\"]/div/ul[3]/li[3]/a"));
    public static final SelenideElement REPORTS_BODY = $(By.xpath("//*[@id=\"menu\"]/div/ul[3]/li[4]/a"));
    public static final SelenideElement REPORTS_MOOD = $(By.xpath("//*[@id=\"menu\"]/div/ul[3]/li[5]/a"));
    public static final SelenideElement REPORTS_CUSTOM = $(By.xpath("//*[@id=\"menu\"]/div/ul[3]/li[6]/a"));
    public static final By PROFILE_LINK = By.id("profile-link");
    //Calorie reports
    public static final SelenideElement CAL_REP_WEEK1 = $(By.xpath("//*[@id=\"report-time\"]/a[1]"));
    public static final SelenideElement CAL_REP_WEEK2 = $(By.xpath("//*[@id=\"report-time\"]/a[2]"));
    public static final SelenideElement CAL_REP_WEEK3 = $(By.xpath("//*[@id=\"report-time\"]/a[3]"));
    public static final SelenideElement CAL_REP_MONTH1 = $(By.xpath("//*[@id=\"report-time\"]/a[4]"));
    public static final SelenideElement CAL_REP_MONTH2 = $(By.xpath("//*[@id=\"report-time\"]/a[5]"));
    public static final SelenideElement CAL_REP_MONTH4 = $(By.xpath("//*[@id=\"report-time\"]/a[6]"));
    public static final SelenideElement CAL_REP_MONTH6 = $(By.xpath("//*[@id=\"report-time\"]/a[7]"));
    public static final SelenideElement CAL_REP_MONTH12 = $(By.xpath("//*[@id=\"report-time\"]/a[8]"));
    //Nutrition reports
    public static final SelenideElement NUTR_REP_WEEK1 = $(By.xpath("//*[@id=\"report-time\"]/a[1]"));
    public static final SelenideElement NUTR_REP_WEEK2 = $(By.xpath("//*[@id=\"report-time\"]/a[2]"));
    public static final SelenideElement NUTR_REP_WEEK3 = $(By.xpath("//*[@id=\"report-time\"]/a[3]"));
    public static final SelenideElement NUTR_REP_MONTH1 = $(By.xpath("//*[@id=\"report-time\"]/a[4]"));
    public static final SelenideElement NUTR_REP_MONTH2 = $(By.xpath("//*[@id=\"report-time\"]/a[5]"));
    public static final SelenideElement NUTR_REP_MONTH4 = $(By.xpath("//*[@id=\"report-time\"]/a[6]"));
    public static final SelenideElement NUTR_REP_MONTH6 = $(By.xpath("//*[@id=\"report-time\"]/a[7]"));
    public static final SelenideElement NUTR_REP_MONTH12 = $(By.xpath("//*[@id=\"report-time\"]/a[8]"));
    //Weight reports
    public static final SelenideElement WEIGHT_REP_WEEK1 = $(By.xpath("//*[@id=\"report-time\"]/a[1]"));
    public static final SelenideElement WEIGHT_REP_WEEK2 = $(By.xpath("//*[@id=\"report-time\"]/a[2]"));
    public static final SelenideElement WEIGHT_REP_WEEK3 = $(By.xpath("//*[@id=\"report-time\"]/a[3]"));
    public static final SelenideElement WEIGHT_REP_MONTH1 = $(By.xpath("//*[@id=\"report-time\"]/a[4]"));
    public static final SelenideElement WEIGHT_REP_MONTH2 = $(By.xpath("//*[@id=\"report-time\"]/a[5]"));
    public static final SelenideElement WEIGHT_REP_MONTH4 = $(By.xpath("//*[@id=\"report-time\"]/a[6]"));
    public static final SelenideElement WEIGHT_REP_MONTH6 = $(By.xpath("//*[@id=\"report-time\"]/a[7]"));
    public static final SelenideElement WEIGHT_REP_MONTH12 = $(By.xpath("//*[@id=\"report-time\"]/a[8]"));
    //Body reports
    public static final SelenideElement BODY_REP_WEEK1 = $(By.xpath("//*[@id=\"report-time\"]/a[1]"));
    public static final SelenideElement BODY_REP_WEEK2 = $(By.xpath("//*[@id=\"report-time\"]/a[2]"));
    public static final SelenideElement BODY_REP_WEEK3 = $(By.xpath("//*[@id=\"report-time\"]/a[3]"));
    public static final SelenideElement BODY_REP_MONTH1 = $(By.xpath("//*[@id=\"report-time\"]/a[4]"));
    public static final SelenideElement BODY_REP_MONTH2 = $(By.xpath("//*[@id=\"report-time\"]/a[5]"));
    public static final SelenideElement BODY_REP_MONTH4 = $(By.xpath("//*[@id=\"report-time\"]/a[6]"));
    public static final SelenideElement BODY_REP_MONTH6 = $(By.xpath("//*[@id=\"report-time\"]/a[7]"));
    public static final SelenideElement BODY_REP_MONTH12 = $(By.xpath("//*[@id=\"report-time\"]/a[8]"));
    //Dropdown for choosing report of part of body
    public static final SelenideElement DROPDOWN_PART_OF_BODY = $(By.xpath("//*[@id=\"report-highchart\"]/div[1]/select"));
    public static final SelenideElement DROPDOWN_PART_OF_BODY_BUTTON = $(By.xpath("//*[@id=\"report-highchart\"]/div[1]/select"));
    //Mood reports
    public static final SelenideElement MOOD_REP_WEEK1 = $(By.xpath("//*[@id=\"report-time\"]/a[1]"));
    public static final SelenideElement MOOD_REP_WEEK2 = $(By.xpath("//*[@id=\"report-time\"]/a[2]"));
    public static final SelenideElement MOOD_REP_WEEK3 = $(By.xpath("//*[@id=\"report-time\"]/a[3]"));
    public static final SelenideElement MOOD_REP_MONTH1 = $(By.xpath("//*[@id=\"report-time\"]/a[4]"));
    public static final SelenideElement MOOD_REP_MONTH2 = $(By.xpath("//*[@id=\"report-time\"]/a[5]"));
    public static final SelenideElement MOOD_REP_MONTH4 = $(By.xpath("//*[@id=\"report-time\"]/a[6]"));
    public static final SelenideElement MOOD_REP_MONTH6 = $(By.xpath("//*[@id=\"report-time\"]/a[7]"));
    public static final SelenideElement MOOD_REP_MONTH12 = $(By.xpath("//*[@id=\"report-time\"]/a[8]"));
    //Dropdown for choosing report of kind of mood
    public static final SelenideElement DROPDOWN_KIND_OF_MOOD = $(By.xpath("//*[@id=\"report-highchart\"]/div[1]/select"));
    public static final SelenideElement DROPDOWN_KIND_OF_MOOD_BUTTON = $(By.xpath("//*[@id=\"report-highchart\"]/div[1]/select"));
    //Dropdown for choosing new series of custom report
    public static final SelenideElement DROPDOWN_NEW_SERIES_OF_CUSTOM_REPORT = $(By.xpath("//*[@id=\"report-custom-selector\"]/table/tbody/tr/td[2]/select"));
    public static final SelenideElement DROPDOWN_NEW_SERIES_CLICK = $(By.xpath("//*[@id=\"report-custom-selector\"]/table/tbody/tr/td[2]/select"));
    //Dropdown for choosing the Value of new series of custom report
    public static final SelenideElement DROPDOWN_VALUE_CHOOSING = $(By.xpath("//*[@id=\"report-custom-selector\"]/table/tbody/tr/td[2]/select[2]"));
    public static final SelenideElement DROPDOWN_VALUE_CLICK = $(By.xpath("//*[@id=\"report-custom-selector\"]/table/tbody/tr/td[2]/select[2]"));
    public static final SelenideElement NOTICE_OF_CUSTOM_REPORT = $(By.xpath("//*[@id=\"reports-top\"]/div[2]/div[1]"));

    @Override
    public boolean isPageOpened() {
        return isExist((SelenideElement) PROFILE_LINK);
    }

    @Step("Opening site")
    public void login(String username, String password) {
        log.info("Opening site");
        $(USERNAME_INPUT).sendKeys(username);
        $(PASSWORD_INPUT).sendKeys(password);
        $(LOGIN_BUTTON).click();
    }

    @Step("Check the availability of calorie reports")
    public void checkingAvailabilityCalorieReport() {
        log.info("Check the availability of calorie reports");
        $(CAL_REP_WEEK1).click();
        $(CAL_REP_WEEK2).click();
        $(CAL_REP_WEEK3).click();
        $(CAL_REP_MONTH1).click();
        $(CAL_REP_MONTH2).click();
        $(CAL_REP_MONTH4).click();
        $(CAL_REP_MONTH6).click();
        $(CAL_REP_MONTH12).click();
    }

    @Step("Check the availability of nutrition reports")
    public void checkingAvailabilityNutritionReport() {
        log.info("Check the availability of nutrition reports");
        $(NUTR_REP_WEEK1).click();
        $(NUTR_REP_WEEK2).click();
        $(NUTR_REP_WEEK3).click();
        $(NUTR_REP_MONTH1).click();
        $(NUTR_REP_MONTH2).click();
        $(NUTR_REP_MONTH4).click();
        $(NUTR_REP_MONTH6).click();
        $(NUTR_REP_MONTH12).click();
    }

    @Step("Check the availability of weight reports")
    public void checkingAvailabilityWeightReport() {
        log.info("Check the availability of weight reports");
        $(WEIGHT_REP_WEEK1).click();
        $(WEIGHT_REP_WEEK2).click();
        $(WEIGHT_REP_WEEK3).click();
        $(WEIGHT_REP_MONTH1).click();
        $(WEIGHT_REP_MONTH2).click();
        $(WEIGHT_REP_MONTH4).click();
        $(WEIGHT_REP_MONTH6).click();
        $(WEIGHT_REP_MONTH12).click();
    }

    @Step("Check the availability of body reports")
    public void checkingAvailabilityBodyReport() {
        log.info("Check the availability of body reports");
        $(BODY_REP_WEEK1).click();
        $(BODY_REP_WEEK2).click();
        $(BODY_REP_WEEK3).click();
        $(BODY_REP_MONTH1).click();
        $(BODY_REP_MONTH2).click();
        $(BODY_REP_MONTH4).click();
        $(BODY_REP_MONTH6).click();
        $(BODY_REP_MONTH12).click();
    }

    @Step("Choose the part of body in dropdown")
    public void choosingPartOfBody() {
        log.info("Choose the part of body in dropdown");
        $(DROPDOWN_PART_OF_BODY).sendKeys(Keys.ARROW_DOWN);
        $(DROPDOWN_PART_OF_BODY_BUTTON).click();
    }

    @Step("Check the availability of mood report")
    public void checkingAvailabilityMoodReport() {
        log.info("Check the availability of mood report");
        $(MOOD_REP_WEEK1).click();
        $(MOOD_REP_WEEK2).click();
        $(MOOD_REP_WEEK3).click();
        $(MOOD_REP_MONTH1).click();
        $(MOOD_REP_MONTH2).click();
        $(MOOD_REP_MONTH4).click();
        $(MOOD_REP_MONTH6).click();
        $(MOOD_REP_MONTH12).click();
    }

    @Step("Choose the kind of mood in dropdown")
    public void choosingKindOfMood() {
        log.info("Choose the kind of mood in dropdown");
        $(DROPDOWN_KIND_OF_MOOD).sendKeys(Keys.ARROW_DOWN);
        $(DROPDOWN_KIND_OF_MOOD_BUTTON).click();
    }

    @Step("Choose the new series of custom report in dropdown")
    public void choosingNewSeriesOfCustomReport() {
        log.info("Choose the new series of custom report in dropdown");
        $(DROPDOWN_NEW_SERIES_OF_CUSTOM_REPORT).sendKeys(Keys.ARROW_DOWN);
        $(DROPDOWN_NEW_SERIES_CLICK).click();
    }

    @Step("Choose the value of new series of custom report in dropdown")
    public void choosingValueOfNewSeriesOfCustomReport() {
        log.info("Choose the value of new series of custom report in dropdown");
        $(DROPDOWN_VALUE_CHOOSING).sendKeys(Keys.ARROW_DOWN);
        $(DROPDOWN_VALUE_CLICK).click();
    }
}
