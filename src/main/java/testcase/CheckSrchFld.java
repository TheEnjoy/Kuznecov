package testcase;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.MainPage;
import utils.ParsingPage;

public class CheckSrchFld {
    public static void execute(WebDriver chromeDriver){
        MainPage mainPage = new MainPage();
        ParsingPage parsingPage = new ParsingPage();


        System.out.println("####---Check input");
        Assert.assertEquals("test", mainPage.searchAndCheck(chromeDriver,"test"));
        Assert.assertEquals(12, mainPage.searchAndCheckInt(chromeDriver,"12"));


    }
}
