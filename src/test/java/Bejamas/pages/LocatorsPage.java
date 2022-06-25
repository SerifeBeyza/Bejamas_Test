package Bejamas.pages;

import Bejamas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class LocatorsPage {

public LocatorsPage(){
    PageFactory.initElements(Driver.get(),this);
}

//featured product locators
@FindBy(xpath = "//img[@alt='pets']")
public WebElement featuredProduct;

@FindBy(xpath = "//p[normalize-space()='Photo of the day']")
    public WebElement photoOfTheDay;

@FindBy(xpath = "//h1[normalize-space()='Samurai King Resting']")
    public WebElement textOfFeaturedProduct;

//Category and subcategory locators
@FindBy(xpath = "//h2[normalize-space()='Category']")
    public WebElement category;
@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[5]/div/div[1]/div/div[2]")
    public WebElement sixCategories;

@FindBy(xpath = "//input[@label='pets']")
    public WebElement petsBox;

@FindBy (xpath = "//input[@label='nature']")
    public WebElement natureBox;

@FindBy (xpath = "//input[@label='food']")
    public WebElement foodBox;

@FindBy (xpath = "//input[@label='technology']")
    public WebElement technologyBox;

@FindBy (xpath = "//input[@label='luxury']")
    public WebElement luxuryBox;

@FindBy (xpath = "//input[@label='art']")
    public WebElement artBox;

//image's locator
@FindBy(xpath = "//img[@alt='telephone iphone']")
    public WebElement phone_img;

//addToCartButton for telephone and iphone img
@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[5]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/button")
    public WebElement addToChartButton;

//@FindBy(linkText = "(//*[text()='Add to Cart'])[5]")//it is not working
  //  public WebElement addToChartNew;

    //Best seller flag locator
@FindBy(xpath = "//div[@class='style__Column-sc-4ctdae-1 eAPRKs']//div[2]//div[1]//div[1]//p[1]")
    public WebElement bestSellerFlag;

//pagenumber's locators
    @FindBy(xpath = "//ol[@class='PaginationIndicatorstyle__Ol-urm45v-0 hRXIFn']")
    public WebElement AllpageNumber;

    @FindBy(xpath = "//li[normalize-space()='1']")
    public WebElement firstPage;

    @FindBy(xpath = "//li[normalize-space()='2']")
    public WebElement secondPage;

    @FindBy(xpath = "//li[normalize-space()='3']")
    public WebElement thirdPage;


    //arrow's locators

    @FindBy(xpath = "//li[@class='PaginationIndicatorstyle__Li-urm45v-1 MCnLo']//*[name()='svg']")
    public WebElement nextArrowLong;


    @FindBy(xpath = "(//*[name()='path' and contains(@d,'M11 2L3 10')])[1]")
    public WebElement prevArrow;
    @FindBy(xpath = "(//*[name()=\'path\' and contains(@d,\'M11 2L3 10\')])[2]")
    public WebElement nextArrow;


    // pagination first product
    @FindBy(xpath = "//p[normalize-space()='Three Men Standing Near Waterfalls']")
    public WebElement firstProduct;


    // six different item's locators in first landed on page

    @FindBy(xpath = "//p[normalize-space()='Watercolor painting']")
    public WebElement firstItem;

    @FindBy(xpath = "//p[normalize-space()='Watch']")
    public WebElement secondItem;

    @FindBy(xpath = "//p[normalize-space()='Vegetable salad on plate']")
    public WebElement thirdItem;

    @FindBy(xpath = "//p[normalize-space()='Three Men Standing Near Waterfalls']")
    public WebElement fourthItem;







}
