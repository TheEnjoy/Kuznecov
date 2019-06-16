package testcase;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;
import utils.ParsingPage;

public class CheckBtn {

    public static void execute(WebDriver browersDriver){
        MainPage mainPage = new MainPage();
        ParsingPage parsingPage = new ParsingPage();

        System.out.println("####---In this test we`ve checking button \"Search in Google\"");
        mainPage.clickButtonTwo(browersDriver);


    }

}
