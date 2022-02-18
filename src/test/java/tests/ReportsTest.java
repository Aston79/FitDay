package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.ReportsPage.*;

@Log4j2
public class ReportsTest extends BaseTest {

    @Test(description = "Сhecking the availability of the calorie report")
    public void caloriesReportsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        reportsPage.login(username, password);
        $(REPORTS_BUTTON).click();
        $(REPORTS_CALORIE).click();
        log.info("Comparison of expected and actual");
        reportsPage.checkingAvailabilityCalorieReport();
    }

    @Test(description = "Checking the availability of the nutrition report")
    public void nutritionReportsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        reportsPage.login(username, password);
        $(REPORTS_BUTTON).click();
        $(REPORTS_NUTRITION).click();
        log.info("Comparison of expected and actual");
        reportsPage.checkingAvailabilityNutritionReport();

    }

    @Test(description = "Checking the availability of the weight report")
    public void weightReportsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        reportsPage.login(username, password);
        $(REPORTS_BUTTON).click();
        $(REPORTS_WEIGHT).click();
        log.info("Comparison of expected and actual");
        reportsPage.checkingAvailabilityWeightReport();
    }

    @Test(description = "Checking the availability of the body report")
    public void bodyReportsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        reportsPage.login(username, password);
        $(REPORTS_BUTTON).click();
        $(REPORTS_BODY).click();
        reportsPage.choosingPartOfBody();
        log.info("Comparison of expected and actual");
        reportsPage.checkingAvailabilityBodyReport();
    }

    @Test(description = "Checking the availability of the mood report")
    public void moodReportsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        reportsPage.login(username, password);
        $(REPORTS_BUTTON).click();
        $(REPORTS_MOOD).click();
        reportsPage.choosingKindOfMood();
        log.info("Comparison of expected and actual");
        reportsPage.checkingAvailabilityMoodReport();
    }

    @Test(description = "Checking of custom report dropdowns")
    public void customReportsTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        reportsPage.login(username, password);
        $(REPORTS_BUTTON).click();
        $(REPORTS_CUSTOM).click();
        reportsPage.choosingNewSeriesOfCustomReport();
        reportsPage.choosingValueOfNewSeriesOfCustomReport();
        log.info("Comparison of expected and actual");
        $(NOTICE_OF_CUSTOM_REPORT).shouldBe(visible);
    }
}
