package oi.Intellisense.pages;

import oi.Intellisense.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "emailAddress")
    public WebElement inputBox_username;

    @FindBy(id = "password")
    public WebElement inputBox_password;

    @FindBy(css = ".MuiButton-label:nth-of-type(1)")
    public WebElement btn_signIn;



}
