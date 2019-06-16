package testcase;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;
import utils.ParsingPage;

public class SearchingTest {
    public static void execute(WebDriver chromeDriver){
        MainPage mainPage = new MainPage();
        ParsingPage parsingPage = new ParsingPage();


        System.out.println("####---In this test we`ve checking search field");
        mainPage.search(chromeDriver,"This string data is presented here");
       // parsingPage.readSearchResults();
        //parsingPage.readSearchResultsTest(chromeDriver);
        System.out.println("####---Total count h3");
        Assert.assertEquals(parsingPage.readSearchResultsTest(chromeDriver).size(),10 );

    }
}
