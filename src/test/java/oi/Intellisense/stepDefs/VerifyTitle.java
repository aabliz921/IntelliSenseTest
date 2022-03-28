package oi.Intellisense.stepDefs;

import io.cucumber.java.en.Given;
import oi.Intellisense.pages.DashbordPage;
import oi.Intellisense.util.BrowserUtillities;
import oi.Intellisense.util.Driver;
import org.junit.Assert;

public class VerifyTitle {

    DashbordPage dashbordPage = new DashbordPage();
    @Given("^User on the (.*) screen$")
    public void validationOfPage(String expectedPageTitle) {
        String url = Driver.get().getCurrentUrl();
        System.out.println("Home Page: " + url);

        String actualPageTitle = Driver.get().getTitle();
        System.out.println("The page title is: " + actualPageTitle);
        BrowserUtillities.waitFor(1);
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }




    @Given("^User on the (.*) subtitle page$")
    public void validationOfSubtitle(String expectedSubtitle) {
        String actualPageSubtitle = dashbordPage.subtitle.getText();
        System.out.println("Home Page: " + actualPageSubtitle);

        BrowserUtillities.waitFor(1);
        Assert.assertTrue(actualPageSubtitle.contains(expectedSubtitle));
    }

}
