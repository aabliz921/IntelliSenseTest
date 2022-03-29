package oi.Intellisense.stepDefs;

import com.google.common.base.Verify;
import io.cucumber.java.en.*;
import oi.Intellisense.pages.DashbordPage;
import oi.Intellisense.pages.LoginPage;
import oi.Intellisense.pages.TestProjectPage;
import oi.Intellisense.util.BrowserUtillities;
import oi.Intellisense.util.ConfigurationReader;
import oi.Intellisense.util.Driver;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;


public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    DashbordPage dashbordPage = new DashbordPage();
    TestProjectPage testProjectPage = new TestProjectPage();

    @Given("navigato the Brain-app signin page")
    public void navigato_the_Brain_app_page() {

        Driver.get().get(ConfigurationReader.get("url"));


    }

    @Then("User enters valid credential")
    public void user_enters_valid_credential() {
        loginPage.inputBox_username.sendKeys(ConfigurationReader.get("username"));
        loginPage.inputBox_password.sendKeys(ConfigurationReader.get("password"));


    }

    @Then("Clicks the signin button")
    public void clicks_the_signin_button() {

        loginPage.btn_signIn.click();
    }

    @Then("User goes to this url {string}")
    public void user_goes_to_this_url(String url) {
        Driver.get().get(url);

    }

    @Then("User enters date from date {string} time {string} to date {string} time {string} in the date fields")
    public void user_enters_date_from_date_time_to_date_time_in_the_date_fields(String startDate, String startTime, String endDate, String endTime) {
        testProjectPage.bnt_timeAndDate.click();
        BrowserUtillities.waitFor(1);
        testProjectPage.historic.click();
        testProjectPage.startTime.click();

        while (true) {
            testProjectPage.btn_select.click();
            if (startDate.equals(testProjectPage.month.getText())) {
                testProjectPage.selectedDate(2).click();
                break;
            }
        }
        Select selectHoures = new Select(testProjectPage.drpDown_startHours);
        selectHoures.selectByValue("11");
        Select selectMinutes = new Select(testProjectPage.drpDown_startMinutes);
        selectMinutes.selectByValue("35");

        testProjectPage.startTime.click();
        testProjectPage.endTime.click();
        BrowserUtillities.waitFor(1);


        while (true) {
            testProjectPage.btN_select.click();
            if (endDate.equals(testProjectPage.montH.getText())) {
                testProjectPage.selectedDate(14).click();
                break;
            }
        }

        Select select_houres = new Select(testProjectPage.drpDown_endHours);
        select_houres.selectByValue("12");
        Select select_minutes = new Select(testProjectPage.drpDown_endMinutes);
        select_minutes.selectByValue("35");

        testProjectPage.btn_submet.click();


    }

    @Then("User sees the inputed data {string} to {string} on the page")
    public void user_sees_the_inputed_data_to_on_the_page(String starDateTime, String endDateTime) {

        BrowserUtillities.waitFor(1);
        assertTrue(testProjectPage.startDateInfo.getText().contains(starDateTime));
        BrowserUtillities.waitFor(1);
        assertTrue(testProjectPage.endDateInfo.getText().contains(endDateTime));

    }


}
