package Bejamas.step_definitions;

import Bejamas.pages.DashboardPage;
import Bejamas.pages.LocatorsPage;
import Bejamas.utilities.BrowserUtils;
import Bejamas.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class ProductList_step_def {
    DashboardPage dashboardPage =new DashboardPage();
    LocatorsPage locatorsPage = new LocatorsPage();

    @When("user able to see six different artworks under the category")
    public void user_able_to_see_six_different_artworks_under_the_category() {

        //verify the page contains "category" part
        String category_Title = locatorsPage.category.getText();
        String expected_Title = "Category";

        //verify that actual title is match with expected title
        assertEquals(expected_Title,category_Title);

        //verify the category has 6 different subcategories
        String subCategories = locatorsPage.sixCategories.getText();

    }
    @Then("user able to select which artworks category do you want")
    public void user_able_to_select_which_artworks_category_do_you_want() {

        //select pets category
        locatorsPage.petsBox.click();
        BrowserUtils.waitFor(2);

        //select nature category
        locatorsPage.natureBox.click();
        BrowserUtils.waitFor(2);

        //select technology category
        locatorsPage.technologyBox.click();
        BrowserUtils.waitFor(2);

        //verify that pets,nature and technology categories selected and the others not
        assertTrue("petBox is selected",locatorsPage.petsBox.isSelected());
        assertTrue("natureBox is selected",locatorsPage.natureBox.isSelected());
        assertTrue("technologyBox is selected",locatorsPage.technologyBox.isSelected());

        assertFalse("foodBox is NOT selected",locatorsPage.foodBox.isSelected());
        assertFalse("luxuryBox is NOT selected",locatorsPage.luxuryBox.isSelected());
        assertFalse("artBox is NOT selected",locatorsPage.artBox.isSelected());


    }
    @When("user  hovering over the image,the {string} bar is displayed.")
    public void user_hovering_over_the_image_the_bar_is_displayed(String addToCart) {

        //verify that user able to  hover over on the image
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(locatorsPage.phone_img).perform();

        //verify that user able to see "Add the cart" button
        assertEquals(locatorsPage.addToChartButton.getText(), addToCart);

    }

    @When("user should able to see product which has {string} flag")
    public void user_should_able_to_see_product_which_has_flag(String BestSeller) {

        //verify that user able to see which product has "Best Seller" flag
        assertTrue("user can see the best seller product",locatorsPage.bestSellerFlag.isDisplayed());

    }


}
