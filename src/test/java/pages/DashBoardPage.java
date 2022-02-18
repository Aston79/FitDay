package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class DashBoardPage extends BasePage {

    public static final SelenideElement WEIGHT_LOG_EDIT_BUTTON = $(By.xpath("//*[@id=\"weight-current\"]/table/tbody/tr[3]/td/a/span[2]"));
    public static final SelenideElement WEIGHT_SAVE_BUTTON = $(By.xpath("//*[@id=\"weight-current\"]/table/tbody/tr[3]/td/a[2]/span[2]"));
    public static final SelenideElement WEIGHT_GOAL_EDIT_BUTTON = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[1]/a/span[2]"));
    public static final SelenideElement WEIGHT_CAL_GOAL_EDIT_BUTTON = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[2]/a/span[2]"));
    public static final By PROFILE_LINK = By.id("profile-link");
    public static final SelenideElement VISIBILITY_NAME_OF_LOG = $(By.xpath("//*[@id=\"main\"]/h1"));

    public static final SelenideElement ENTER_TYPE_OF_FOOD = $(By.xpath("//*[@id=\"food-search-bar\"]/form/input"));
    public static final SelenideElement SEARCH_RESULT = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[1]/a"));
    public static final SelenideElement INPUT_NEW_CUSTOM_FOOD = $(By.xpath("//*[@id=\"food-search-bar\"]/form/input"));
    public static final SelenideElement SEARCH_RESULT_OF_CUSTOM_FOOD = $(By.xpath("//*[@id=\"food-search-custom\"]/div[1]/div"));
    public static final SelenideElement RESULT_IN_FOOD_LOG = $(By.xpath("//*[@id=\"food-log\"]/table/tbody/tr[2]/td[1]/a"));
    public static final SelenideElement FILL_TEXTAREA = $(By.xpath("//*[@id=\"j-diary-diary\"]/div[1]/textarea"));

    @Override
    public boolean isPageOpened() {
        return isExist((SelenideElement) PROFILE_LINK);
    }

    public static final SelenideElement CREATE_CUSTOM_FOOD_ITEM = $(By.xpath("//*[@id=\"food-search-tabs\"]/ul/li[3]/a"));

    @Step("Create custom food item")
    public void createCustomFoodItem() {
        log.info("Create custom food item");
        $(CREATE_CUSTOM_FOOD_ITEM).click();
    }

    public static final SelenideElement ADD_FOOD_BUTTON = $(By.xpath("//*[@id=\"dashboard\"]/table/tbody/tr[3]/td[1]/a/span[2]"));

    @Step("Add food button")
    public void addFoodButton() {
        log.info("Add food button");
        $(ADD_FOOD_BUTTON).click();
    }

    public static final SelenideElement CHOOSE_THE_KIND = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[1]/a"));

    @Step("Choose the kind of food")
    public void chooseTheKindOfFood() {
        log.info("Choose the kind of food");
        $(CHOOSE_THE_KIND).click();
    }

    public static final SelenideElement ADD_TO_FOOD_LOG = $(By.xpath("//*[@id=\"food-add-dialog\"]/div/a/span[2]"));

    @Step("Add to food Log")
    public void addToFoodLog() {
        log.info("Add to food Log");
        $(ADD_TO_FOOD_LOG).click();
    }

    public static final SelenideElement ADD_ACTIVITY_BUTTON = $(By.xpath("//*[@id=\"dashboard\"]/table/tbody/tr[3]/td[2]/a/span[2]"));

    @Step("Add activity button")
    public void addActivityButton() {
        log.info("Add activity button");
        $(ADD_ACTIVITY_BUTTON).click();
    }

    public static final SelenideElement EDIT_CAL_BUTGET_BUTTON = $(By.xpath("//*[@id=\"dashboard\"]/table/tbody/tr[3]/td[5]/a/span[2]"));

    @Step("Edit Calorie butget button")
    public void editCalButgetButton() {
        log.info("Edit Calorie butget button");
        $(EDIT_CAL_BUTGET_BUTTON).click();
    }

    public static final SelenideElement EDIT_MOOD_BUTTON = $(By.xpath("//*[@id=\"dashboard\"]/table/tbody/tr[3]/td[4]/a/span[2]"));

    @Step("Edit mood button")
    public void editMoodButton() {
        log.info("Edit mood button");
        $(EDIT_MOOD_BUTTON).click();
    }

    @Step("Edit mood button 'edit'")
    public void editMoodButtonEdit() {
        log.info("Edit mood button 'edit'");
        $(By.xpath("//*[@id=\"j-diary-diary\"]/div[2]/div/a/span[2]")).click();
    }

    public static final SelenideElement EDIT_WEIGHT_BUTTON = $(By.xpath("//*[@id=\"dashboard\"]/table/tbody/tr[3]/td[3]/a/span[2]"));

    @Step("Edit weight value")
    public void editingWeightValue() {
        log.info("Edit weight value");
        $(EDIT_WEIGHT_BUTTON).click();
    }

    public static final SelenideElement CHOOSE_DROPDOWN_VARIANT_ACTIVITY = $(By.xpath("//*[@id=\"activity-browse\"]"));
    public static final SelenideElement PRESS_ENTER_DROPDOWN_ACTIVITY = $(By.xpath("//*[@id=\"activity-browse\"]"));
    public static final SelenideElement DETAILS_OF_ACTIVITY = $(By.xpath("//*[@id=\"result-activities\"]/table/thead/tr/th[2]"));

    @Step("Choose the dropdown activity variant")
    public void chooseTheVariantFromDropdownActivity() {
        log.info("Choose the dropdown activity variant");
        $(CHOOSE_DROPDOWN_VARIANT_ACTIVITY).sendKeys(Keys.ARROW_DOWN);
        $(PRESS_ENTER_DROPDOWN_ACTIVITY).pressEnter();
    }

    public static final SelenideElement CHOOSE_DROPDOWN_VARIANT_FOOD_VALUE = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[3]/select"));
    public static final SelenideElement PRESS_ENTER_DROPDOWN_FOOD_VALUE = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[3]/select"));
    public static final SelenideElement ADD_FOOD_AMOUNT = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[5]/a"));

    @Step("Choose the variant from dropdown kind of food")
    public void chooseTheVariantFromDropdownKindOfFood() {
        log.info("Choose the variant from dropdown kind of food");
        $(CHOOSE_DROPDOWN_VARIANT_FOOD_VALUE).sendKeys(Keys.ARROW_DOWN);
        $(PRESS_ENTER_DROPDOWN_FOOD_VALUE).pressEnter();
    }

    @Step("Add food amount")
    public void foodAmountAdd() {
        log.info("Add food amount");
        $(ADD_FOOD_AMOUNT).click();
    }

    public static final SelenideElement CLEAN_INPUT_SPACE_FOOD_AMOUNT = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[2]/input"));
    public static final SelenideElement BACK_SPACE_FOOD_AMOUNT = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[2]/input"));
    public static final SelenideElement ENTER_TYPE_OF_FOOT_AMOUNT = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[1]/td[2]/input"));

    @Step("Clean input space of food amount")
    public void cleanInputSpaceFoodAmount() {
        log.info("Clean input space of food amount");
        $(CLEAN_INPUT_SPACE_FOOD_AMOUNT).sendKeys(Keys.CONTROL + "a");
        $(BACK_SPACE_FOOD_AMOUNT).sendKeys(Keys.BACK_SPACE);
    }

    public static final SelenideElement CHOOSE_DROPDOWN_VARIANT_FOOD_VALUE2 = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[3]/td[3]/select"));
    public static final SelenideElement PRESS_ENTER_DROPDOWN_FOOD_VALUE2 = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[3]/td[3]/select"));

    @Step("Choose the food amount variant from dropdown")
    public void chooseTheFoodAmountVariantFromDropdown() {
        log.info("Choose the food amount variant from dropdown");
        $(CHOOSE_DROPDOWN_VARIANT_FOOD_VALUE2).sendKeys(Keys.ARROW_DOWN);
        $(PRESS_ENTER_DROPDOWN_FOOD_VALUE2).pressEnter();
    }

    public static final SelenideElement ADD_VALUE_TO_FOOD_LOG = $(By.xpath("//*[@id=\"food-search-all\"]/div[1]/table/tbody/tr[3]/td[5]/a"));
    public static final SelenideElement RESULT_OF_FOOD_LOG = $(By.xpath("//*[@id=\"food-log\"]/table/tfoot/tr/td[2]"));

    @Step("Add value to food log")
    public void addingValueToFoodLog() {
        log.info("Add value to food log");
        $(ADD_VALUE_TO_FOOD_LOG).click();
    }

    public static final SelenideElement CLEAN_INPUT_SPACE_OF_WEIGHT = $(By.xpath("//*[@id=\"weight-current\"]/table/tbody/tr[2]/td/form/input"));
    public static final SelenideElement BACK_SPACE_OF_WEIGHT_SPACE = $(By.xpath("//*[@id=\"weight-current\"]/table/tbody/tr[2]/td/form/input"));
    public static final SelenideElement INPUT_VALUE_OF_WEIGHT = $(By.xpath("//*[@id=\"weight-current\"]/table/tbody/tr[2]/td/form/input"));

    @Step("Clean input space of weight")
    public void cleanInputSpaceWeight() {
        log.info("Clean input space of weight");
        $(CLEAN_INPUT_SPACE_OF_WEIGHT).sendKeys(Keys.CONTROL + "a");
        $(BACK_SPACE_OF_WEIGHT_SPACE).sendKeys(Keys.BACK_SPACE);
    }

    @Step("Click the save weight button")
    public void savingActionWeightLog() {
        log.info("Click the save weight button");
        $(WEIGHT_SAVE_BUTTON).click();
    }

    public static final SelenideElement WEIGHT_LOG_PROGRESS = $(By.xpath("//*[@id=\"weight-tabs\"]/ul/li[1]/a"));
    public static final SelenideElement WEIGTH_GOAL_SAVE_BUTTON = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[1]/a[3]/span[2]"));

    @Step("Click the save weight goal button")
    public void savingActionWeightGoal() {
        log.info("Click the save weight goal button");
        $(WEIGTH_GOAL_SAVE_BUTTON).click();
    }

    public static final SelenideElement CONTINUE_BUTTON = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[2]/a[2]/span[2]"));

    @Step("Click the save continue button")
    public void continueButtonCalGoalPress() {
        log.info("Click the save continue button");
        $(CONTINUE_BUTTON).click();
    }

    public static final SelenideElement SAVE_CAL_GOAL_BUTTON = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[2]/a[3]/span[2]"));

    @Step("Click the save cal.goal button")
    public void savingActionCalGoal() {
        log.info("Click the save cal.goal button");
        $(SAVE_CAL_GOAL_BUTTON).click();
    }

    public static final SelenideElement CHART_PICKER_CALORIE_BALANCE = $(By.name("chart-picker"));

    @Step("Click on calorie-balance of chart-picker")
    public void clickOnChartPickerCalorieBalance() {
        log.info("Click on calorie-balance of chart-picker");
        $(CHART_PICKER_CALORIE_BALANCE).click();
    }

    public static final SelenideElement SELECT_VALUE_OF_CHART_PICKER = $(By.xpath("//*[@id=\"chart-picker\"]/select"));
    public static final SelenideElement NET_CALORIES_RESULT = $(By.xpath("//*[@id=\"chart-highchart\"]/div[1]/strong"));

    public static final SelenideElement INPUT_KIND_OF_ACTIVITY = $(By.xpath("//*[@id=\"activity-search-bar\"]/form/input"));
    public static final SelenideElement INPUT_DISTANCE = $(By.xpath("//*[@id=\"result-activities\"]/table/tbody/tr[1]/td[4]/input"));

    public static final SelenideElement CLEAN_INPUT_SPACE_OF_ACTIVITY_TIME = $(By.xpath("//*[@id=\"result-activities\"]/table/tbody/tr[1]/td[4]/input"));
    public static final SelenideElement BACK_SPACE_OF_ACTIVITY_TIME = $(By.xpath("//*[@id=\"result-activities\"]/table/tbody/tr[1]/td[4]/input"));
    public static final SelenideElement INPUT_ACTIVITY_TIME = $(By.xpath("//*[@id=\"result-activities\"]/table/tbody/tr[1]/td[4]/input"));

    @Step("Clean input time of activity space")
    public void cleanInputSpaceTimeOfActivity() {
        log.info("Clean input time of activity space");
        $(CLEAN_INPUT_SPACE_OF_ACTIVITY_TIME).sendKeys(Keys.CONTROL + "a");
        $(BACK_SPACE_OF_ACTIVITY_TIME).sendKeys("\b\b");
    }

    public static final SelenideElement ADD_ACTIVITY_LOG_BUTTON = $(By.xpath("//*[@id=\"result-activities\"]/table/tbody/tr[1]/td[7]/a"));
    public static final SelenideElement TITLE_OF_ACTIVITY_LOG = $(By.xpath("//*[@id=\"main\"]/h1"));
    public static final SelenideElement ADD_TO_ACTIVITY_LOG = $(By.xpath("//*[@id=\"activity-add-top\"]/div/a/span[2]"));
    public static final SelenideElement ACTIVITY_LOG_RESULT = $(By.xpath("//*[@id=\"activity-log\"]/table/tbody/tr[1]/td[1]"));

    @Step("Add activity log button")
    public void addActivityLogButton() {
        log.info("Add activity log button");
        $(ADD_ACTIVITY_LOG_BUTTON).click();
    }

    @Step("Add to activity log")
    public void addToActivityLog() {
        log.info("Add to activity log");
        $(ADD_TO_ACTIVITY_LOG).click();
    }

    public static final SelenideElement EDIT_BUTTON_OF_WEIGHT_GOAL = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[1]/a/span[2]"));

    @Step("Click on edit button")
    public void weightGoalEditing() {
        log.info("Click on edit button");
        $(EDIT_BUTTON_OF_WEIGHT_GOAL).click();
    }

    public static final SelenideElement CLEAN_INPUT_SPACE_OF_START_WEIGHT_GOAL = $(By.xpath("//*[@id=\"startweight\"]"));
    public static final SelenideElement BACK_SPACE_OF_START_WEIGHT_GOAL = $(By.xpath("//*[@id=\"startweight\"]"));
    public static final SelenideElement INPUT_VALUE_OF_START_WEIGHT_GOAL = $(By.xpath("//*[@id=\"startweight\"]"));

    @Step("Input value of 'start' weight goal")
    public void inputValueOfStartWeightGoal() {
        log.info("Input value of 'start' weight goal");
        $(CLEAN_INPUT_SPACE_OF_START_WEIGHT_GOAL).click();
        $(BACK_SPACE_OF_START_WEIGHT_GOAL).sendKeys("\b\b\b\b\b");
    }

    public static final SelenideElement CLEAN_INPUT_SPACE_OF_GOAL_WEIGHT_GOAL = $(By.xpath("//*[@id=\"goalweight\"]"));
    public static final SelenideElement BACK_SPACE_OF_GOAL_WEIGHT_GOAL = $(By.xpath("//*[@id=\"goalweight\"]"));
    public static final SelenideElement INPUT_VALUE_OF_GOAL_WEIGHT_GOAL = $(By.xpath("//*[@id=\"goalweight\"]"));
    public static final SelenideElement SAVE_BUTTON_OF_GOAL_WEIGHT_GOAL = $(By.xpath("//*[@id=\"weight-goals\"]/table/tbody/tr[3]/td[1]/a[3]/span[2]"));
    public static final SelenideElement PROGRESS_TAB_OF_WEIGHT_GOAL = $(By.xpath("//*[@id=\"weight-progress\"]/table/tbody/tr[3]/td[2]"));

    @Step("Input value of 'goal' weight goal")
    public void inputValueOfGoalWeightGoal() {
        log.info("Input value of 'goal' weight goal");
        $(CLEAN_INPUT_SPACE_OF_GOAL_WEIGHT_GOAL).click();
        $(BACK_SPACE_OF_GOAL_WEIGHT_GOAL).sendKeys("\b\b\b\b\b");
    }

    @Step("Click on save button of 'goal' weight goal")
    public void savingActionOfWeightGoal() {
        log.info("Click on save button of 'goal' weight goal");
        $(SAVE_BUTTON_OF_GOAL_WEIGHT_GOAL).click();
    }


    public static final SelenideElement DASHBOARD_DATE = $(By.xpath("//*[@id=\"datepick\"]/div[1]/a[2]/span"));
    public static final SelenideElement CALENDAR_BUTTON = $(By.xpath("//*[@id=\"menu\"]/div/ul[1]/li[2]/a"));

    @Step("Click on calendar button")
    public void movingToCalendar() {
        log.info("Click on calendar button");
        $(CALENDAR_BUTTON).click();
    }

    @Step("Input the date on calendar")
    public void inputTheDateOnCalendar() {
        log.info("Input the date on calendar");
        $(By.xpath("//*[@id=\"j-calendar\"]/table/tbody/tr[2]/td[5]/div/a")).click();
    }

    public static final SelenideElement TODAYS_DIARY_ENTRY = $(By.xpath("//*[@id=\"body-top\"]/div[1]/div[1]"));
    public static final SelenideElement MOOD_LOG = $(By.xpath("//*[@id=\"main\"]/h1"));

    @Step("Click on mood icon")
    public void clickOnMoodIcon() {
        log.info("Click on mood icon");
        $(By.xpath("//*[@id=\"j-calendar\"]/table/tbody/tr[1]/td[3]/div/table/tbody/tr[1]/td[1]/a")).click();
    }

    @Step("Click on save button of action mood")
    public void savingActionMood() {
        log.info("Click on save button of action mood");
        $(By.xpath("//*[@id=\"j-diary-diary\"]/div[2]/div/a/span[2]")).click();
    }


    public static final SelenideElement INSERT_DIARY_TEXTAREA = $(By.xpath("//*[@id='j-diary-diary']/div[1]/textarea"));
    public static final SelenideElement BACK_SPACE_OF_DIARY_TEXTAREA = $(By.xpath("//*[@id='j-diary-diary']/div[1]/textarea"));

    @Step("Click on edit button of mood")
    public void editCalendarMoodButton() {
        log.info("Click on edit button of mood");
        $(By.xpath("//*[@id=\"j-diary-diary\"]/div[2]/div/a/span[2]")).click();
    }

    @Step("Cleaning Diary textarea")
    public void cleaningDiaryTextArea() {
        log.info("Cleaning Diary textarea");
        $(INSERT_DIARY_TEXTAREA).click();
        $(BACK_SPACE_OF_DIARY_TEXTAREA).sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
    }
}

