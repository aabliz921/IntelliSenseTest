package oi.Intellisense.pages;

import oi.Intellisense.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {

    public DashbordPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-tachometer']")
    public WebElement module_dashboard;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement subtitle;
}
