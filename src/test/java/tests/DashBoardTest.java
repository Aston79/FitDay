package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.DashBoardPage.*;

@Log4j2
public class DashBoardTest extends BaseTest {

    @Link("https://docs.qameta.io/allure/#_testng")
    @Issue("456")
    @TmsLink("taskLink")
    @Test(description = "Try to add some foodname to food table")
    public void foodButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.addFoodButton();
        log.info("Comparison of expected and actual");
        $(VISIBILITY_NAME_OF_LOG).shouldBe(visible);
    }

    @Test(description = "Try to search some kind of foodname")
    public void foodSearchTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.addFoodButton();
        log.info("Enter the type of food");
        $(ENTER_TYPE_OF_FOOD).sendKeys("cheese");
        log.info("Comparison of expected and actual");
        $(SEARCH_RESULT).shouldBe(visible);
    }

    @Test(description = "Try to search some custom foodname")
    public void foodCustomSearchTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.addFoodButton();
        dashBoardPage.createCustomFoodItem();
        log.info("Input new custom food");
        $(INPUT_NEW_CUSTOM_FOOD).sendKeys("golubtsy");
        log.info("Comparison of expected and actual");
        $(SEARCH_RESULT_OF_CUSTOM_FOOD).shouldNotBe(visible);
    }

    @Test(description = "Try to change value of amount + unit")
    public void changingTheValueOfFoodAmountTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.addFoodButton();
        log.info("Input value of food");
        $(ENTER_TYPE_OF_FOOD).sendKeys("meat");
        dashBoardPage.chooseTheVariantFromDropdownKindOfFood();
        dashBoardPage.cleanInputSpaceFoodAmount();
        log.info("Input value of food amount");
        $(ENTER_TYPE_OF_FOOT_AMOUNT).sendKeys("3");
        dashBoardPage.chooseTheFoodAmountVariantFromDropdown();
        dashBoardPage.addingValueToFoodLog();
        log.info("Comparison of expected and actual");
        $(RESULT_OF_FOOD_LOG).shouldNotBe(value("0"));
    }

    @Test(description = "Checking of add activity button")
    public void activityButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.addActivityButton();
        log.info("Comparison of expected and actual");
        $(VISIBILITY_NAME_OF_LOG).shouldBe(visible);
    }

    @Test(description = "Checking of activity dropdown button")
    public void activityDropDownButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.addActivityButton();
        dashBoardPage.chooseTheVariantFromDropdownActivity();
        log.info("Comparison of expected and actual");
        $(DETAILS_OF_ACTIVITY).shouldBe(visible);
    }


    @Test(description = "Checking of edit weight button")
    public void editWeightButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.editingWeightValue();
        log.info("Comparison of expected and actual");
        $(VISIBILITY_NAME_OF_LOG).shouldBe(visible);
    }

    @Test(description = "Checking edit button of mood")
    public void editMoodButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.editMoodButton();
        log.info("Comparison of expected and actual");
        $(VISIBILITY_NAME_OF_LOG).shouldBe(visible);
    }

    @Test(description = "Try to add some notes to 'Today`s dairy'")
    public void editMoodTodaysDairyTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.editMoodButton();
        dashBoardPage.editMoodButtonEdit();
        log.info("Clean textarea of diary");
        dashBoardPage.cleaningDiaryTextArea();
        log.info("Send the message");
        $(FILL_TEXTAREA).sendKeys("That's the way!!!");
        dashBoardPage.savingActionMood();
        log.info("Comparison of expected and actual");
        $(TODAYS_DIARY_ENTRY).shouldBe(visible);
    }

    @Test(description = "Checking of edit 'Cal budget button'")
    public void editCalBudgetButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.editCalButgetButton();
        log.info("Comparison of expected and actual");
        $(VISIBILITY_NAME_OF_LOG).shouldBe(visible);
    }

    @Test(description = "Checking of weight goal edit button")
    public void weightGoalEditButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.editCalButgetButton();
        $(WEIGHT_GOAL_EDIT_BUTTON).click();
        dashBoardPage.savingActionWeightGoal();
        log.info("Comparison of expected and actual");
        $(WEIGHT_LOG_PROGRESS).shouldBe(visible);
    }

    @Test(description = "Checking of weight cal goal edit button")
    public void weightCalGoalEditButtonTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.editCalButgetButton();
        $(WEIGHT_CAL_GOAL_EDIT_BUTTON).click();
        dashBoardPage.continueButtonCalGoalPress();
        dashBoardPage.savingActionCalGoal();
        log.info("Comparison of expected and actual");
        $(WEIGHT_LOG_PROGRESS).shouldBe(visible);
    }

    @Test(description = "Checking of calorie balance dropdown")
    public void dropDownCalorieBalanceWindowTest() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.clickOnChartPickerCalorieBalance();
        log.info("Select value of the chart picker");
        $(SELECT_VALUE_OF_CHART_PICKER).selectOptionByValue("calorie_breakdown");
        log.info("Comparison of expected and actual");
        $(NET_CALORIES_RESULT).shouldBe(visible);
    }

    @Test(description = "Try to click on some date in calender to move to dashboard with the same date")
    public void changingDateOnDashboardThroughCalendar() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.movingToCalendar();
        log.info("Enter the date on calendar");
        dashBoardPage.inputTheDateOnCalendar();
        log.info("Comparison of expected and actual");
        $(DASHBOARD_DATE).shouldBe(visible);
    }

    @Test(description = "Try to click on mood-icon of any date to move on food log with the same\n" +
            "           date, enter and save the message in a diary \n")
    public void changingMemoryMessageThroughCalendar() {
        log.info("Open page fitday.com");
        loginPage.openPage();
        loginPage.login(username, password);
        dashBoardPage.movingToCalendar();
        dashBoardPage.clickOnMoodIcon();
        dashBoardPage.editCalendarMoodButton();
        log.info("Clean textarea of diary");
        dashBoardPage.cleaningDiaryTextArea();
        log.info("Send the message");
        $(FILL_TEXTAREA).sendKeys("Hello there!");
        dashBoardPage.savingActionMood();
        log.info("Comparison of expected and actual");
        $(MOOD_LOG).shouldBe(visible);
    }
}
