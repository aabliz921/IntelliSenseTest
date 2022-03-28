package oi.Intellisense.pages;

import oi.Intellisense.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProjectPage {
    public TestProjectPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-nav'][2]")
    public WebElement bnt_timeAndDate;

    @FindBy(xpath = "//a[@class='interval-tab']")
    public WebElement historic;

    @FindBy(xpath = "//div[@class='control-toggle']")
    public WebElement startTime;

    @FindBy(xpath = "(//div[@class='control-toggle'])[2]")
    public WebElement endTime;

    @FindBy(xpath = "//div[@class='month-container']")
    public WebElement month;

    @FindBy(xpath = "(//div[@class='month-container'])[2]")
    public WebElement montH;

    @FindBy(xpath = "//button[@class='previous btn btn-text']")
    public WebElement btn_select;

    @FindBy(xpath = "(//button[@class='previous btn btn-text'])[2]")
    public WebElement btN_select;


    @FindBy(xpath = "(//select[@name='hours'])[2]")
    public WebElement drpDown_startHours;

    @FindBy(xpath = "(//select[@name='minutes'])[2]")
    public WebElement drpDown_startMinutes;

    @FindBy(xpath = "(//select[@name='hours'])[3]")
    public WebElement drpDown_endHours;

    @FindBy(xpath = "(//select[@name='minutes'])[3]")
    public WebElement drpDown_endMinutes;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement btn_submet;

    @FindBy(xpath = "//span[@class='date-range'][1]")
    public WebElement startDateInfo;

    @FindBy(xpath = "//span[@class='date-range'][2]")
    public WebElement endDateInfo;


    public WebElement selectedDate(int date) {
        WebElement selected_date = null;

        if (date == 2) {
            String locator = "//div[@class='day' and contains(.,'" + date + "')][1]";

            selected_date = Driver.get().findElement(By.xpath(locator));

        } else if (date == 14) {

            String locator = "(//div[@class='day' and contains(text(),'"+date+"')])[2]";

            selected_date = Driver.get().findElement(By.xpath(locator));
        }

        return selected_date;
    }


}
