package Bejamas.step_definitions;

import Bejamas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class bos_methodlar {

    //verify the color of located page number icon
     /*
        //getting color attribute with getCssValue()
        String colorOfPageNum = locatorsPage.pageNumber(locatedPageNumbers).getCssValue("color");
        System.out.println(colorOfPageNum);
        String color3 =locatorsPage.pageNumber("3").getCssValue("color");
        System.out.println(color3);

        assertEquals("rgba(0, 0, 0, 1)",colorOfPageNum);

        //assertNotEquals("choosen pages color is different from rest of page numbers ", colorOfPageNum, color3);

         */

    //verify 6 items in 1 page
/*
    public void user_able_to_see_six_different_items_on_each_page() {

        List<WebElement> names = new ArrayList<>();
        names.add(locatorsPage.AllpageNumber);

        for (int i=1; i<= names.size();i++){

            String paginationSelector ="//li[normalize-space()='"+i+"']";
            Driver.get().findElement(By.xpath(paginationSelector)).click();

            List<WebElement> namesElements =Driver.get().findElements(By.xpath("/html//div[@id='__next']/div/main/div/div/div[5]/div/div[2]/div/div[1]/div/div[1]"));

            String[]linkText = new String[namesElements.size()];
            int j =0;

            for (WebElement element : namesElements) {
                linkText[j]= element.getText();
                i++;
                System.out.println(j);
            }

           /* for (WebElement namesElement : namesElements) {
                names.add(namesElement.getText());
                */



    }
