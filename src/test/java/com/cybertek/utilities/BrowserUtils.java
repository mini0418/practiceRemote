package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static List<String> getElementsText(List<WebElement>list){
        List<String>elemTexts=new ArrayList<>();
        for(WebElement el: list){
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }



   /*
   Method to assert title
    */

    public static void titleVerification(String expectedTitle){
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
        //return actualTitle.equals(expectedTitle);
    }




    //create method name: wait
    //converting milliseconds to seconds
    //handle checked exception

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

    public static WebElement waitForVisibility(WebElement element,int timeToWaitInSec){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }





}

