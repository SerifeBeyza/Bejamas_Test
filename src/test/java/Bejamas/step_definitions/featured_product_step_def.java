package Bejamas.step_definitions;

import Bejamas.pages.DashboardPage;
import Bejamas.pages.LocatorsPage;
import Bejamas.utilities.BrowserUtils;
import Bejamas.utilities.ConfigurationReader;
import Bejamas.utilities.Driver;
import io.cucumber.java.en.Given;
import static org.junit.Assert.*;



public class featured_product_step_def {

    //I would like to access my BasePage in indirect way because of that I create an object with DashboardPage which is already extends Basepage.
    DashboardPage dashboardPage =new DashboardPage();
    //Create an object with LocatorsPage because I would like to access all locators in there which I will use for methods.
    LocatorsPage locatorsPage = new LocatorsPage();

    @Given("user navigates to main page")
    public void user_navigates_to_main_page() throws InterruptedException{

        //user able to go "https://qa-recruitment-task.netlify.app/" website

        String url =ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
        String actual_url =Driver.get().getCurrentUrl();

        //verify that expected and actual url is matching with each other
        assertEquals(url,actual_url);




    }


    @Given("user can able to see featured product")
    public void user_can_able_to_see_featured_product() throws InterruptedException {

        //verify that user able to see "Photo of the Day" on the page
        assertTrue("user able to see featured of product", locatorsPage.photoOfTheDay.isDisplayed());


        //verify that featured product has "photo of the day" flag
        String actual_text=locatorsPage.photoOfTheDay.getText();
        String expected_text="Photo of the day";

        assertEquals(expected_text,actual_text);

    }

}
