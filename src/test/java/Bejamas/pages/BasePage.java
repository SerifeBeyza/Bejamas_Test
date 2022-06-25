package Bejamas.pages;

import Bejamas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public abstract class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.get(),this);}


    public static WebElement pageNumber8(String pageNumber8) {
        return Driver.get().findElement(By.xpath("//li[normalize-space()='" + pageNumber8 + "']"));

    }

    public static WebElement items (String itemName){
        return Driver.get().findElement(By.xpath("//p[normalize-space()='"+itemName+"']"));
    }

    //choosing random page number by using this method
    public static int randomNum(int min,int max){
        Random random = new Random();
        return random.nextInt(max)+min;
    }
    /*public static WebElement productIndex(String randomNumber){
        return Driver.get().findElement(By.xpath("//li["+randomNumber+"]//article[1]"));
    }
    */


}
