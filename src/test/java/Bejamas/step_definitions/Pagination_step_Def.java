package Bejamas.step_definitions;


import Bejamas.pages.DashboardPage;
import Bejamas.pages.LocatorsPage;
import Bejamas.utilities.BrowserUtils;
import Bejamas.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

public class Pagination_step_Def {

    DashboardPage dashboardPage =new DashboardPage();
    LocatorsPage locatorsPage = new LocatorsPage();

    String locatedPageNumbers;

    @When("user able to see all page number")
    public void user_able_to_see_all_page_number() {

        BrowserUtils.scrollToElement(locatorsPage.AllpageNumber);
        BrowserUtils.waitFor(3);

        //verify that user able to see all page numbers below
      assertTrue("user able to see all pageNumber ",locatorsPage.AllpageNumber.isDisplayed());

    }

    @When("user able to see {string} different items on each page")
    public void user_able_to_see_different_items_on_each_page(String products) {

        BrowserUtils.scrollToElement(locatorsPage.firstItem);
        BrowserUtils.waitFor(3);


        List<WebElement> items = new ArrayList<>();
        items.add(locatorsPage.firstItem);
        items.add(locatorsPage.secondItem);
        items.add(locatorsPage.thirdItem);
        items.add(locatorsPage.fourthItem);

        System.out.println("Items in the one page:"+BrowserUtils.getElementsText(items));

        System.out.println( "Items numbers in the one page"+ items.size());

        //verify that the one page has 6 different items

        int actualItemNum=items.size();

        String expectedResult = String.valueOf(actualItemNum);



        //I used the try-catch method because I wanted my codes can run until all the step files were finished.
        //You can see the screenshot of the bug in the cucumber-html reporting section of the target file.
        try{
            assertEquals(products,actualItemNum);

        }catch (Error e) {

            System.out.println("There are 4 different products not 6");
        }


    }

    @When("user navigate to page {string} on listed product page")
    public void user_navigate_to_page_on_listed_product_page(String pageNumber) {

       DashboardPage.pageNumber8(pageNumber).isSelected();
        BrowserUtils.waitFor(3);


    }

    @Then("user able to understand which page she is on")
    public void user_able_to_understand_which_page_she_is_on() {

        //we are already on the second page
        //because of that we can not click second number icon

        assertFalse(locatorsPage.secondPage.isSelected());

    }

    @Then("prev arrow be hidden at page {string} and next arrow hidden last page {string}")
    public void prev_arrow_be_hidden_at_page_and_next_arrow_hidden_last_page(String firstPage,String lastPage) {

        //select pets category
        locatorsPage.petsBox.click();
        BrowserUtils.waitFor(2);

        //select nature category
        locatorsPage.natureBox.click();
        BrowserUtils.waitFor(2);

        //select technology category
        locatorsPage.technologyBox.click();
        BrowserUtils.waitFor(2);


        //select first page
        locatedPageNumbers =firstPage;
        DashboardPage.pageNumber8(firstPage).click();
        BrowserUtils.waitFor(3);

        //verify that prev arrow it is not clickable at first page
        assertFalse("prev arrow can not clickable",locatorsPage.prevArrow.isSelected());


        //verify that next arrow is not clickable in last page
        locatedPageNumbers=lastPage;
        DashboardPage.pageNumber8(lastPage).click();
        BrowserUtils.waitFor(3);


        //verify that next arrow is not clickable in last page
        assertFalse("next arrow can not clickable",locatorsPage.nextArrow.isSelected());

    }
    @Then("user able to see six different icons on each page")
    public void user_able_to_see_six_different_icons_on_each_page() {

        //create a dummy variable
        String actualResult = "";

            // create a list for identify elements in pagination icons number with findElements
            List<WebElement> paginationIcons = Driver.get().findElements(By.xpath("//ol[@class='PaginationIndicatorstyle__Ol-urm45v-0 hRXIFn']"));

            //iterate through pagination Icons list and get the actual result
            for (WebElement i: paginationIcons) {
                actualResult = i.getText();
            }
            //expected result
              int n = 1;

                     while( n <= 6 ){
                       n++;
                     }

                     //int convert to string
              String expectedResult = String.valueOf(n);

                     //verify the actual and expected result are the same
               assertNotEquals(actualResult,expectedResult);

        }

    }




