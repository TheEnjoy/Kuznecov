package moduletest;

import Browser.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testcase.CheckBtn;
import testcase.CheckSrchFld;
import testcase.SearchingTest;
import utils.ParsingPage;

import java.util.concurrent.TimeUnit;

public class BaseTest{

    private static WebDriver driver;


    @BeforeTest
    public void startWebDriver(){
        driver = BrowserFactory.getDriver("DEFULT");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

  /*  @Test
    public void oneTest(){
        String test = driver.findElement(By.name("btnK")).getAttribute("value");
        //String test = driver.findElement(By.name("btnK")).;
        System.out.println(test);
        Assert.assertEquals(test, "Поиск в Google");

        *//*if(test.equals("Поиск в Google")){

        }
        else{
            System.out.println();
        }*//*

        driver.findElement(By.name("q")).sendKeys("111");


    }*/

  /*  @Test
    public void checkButton() {
        WebElement buttonWebElement = driver.findElement(By.name("btnK"));
        String actRes = buttonWebElement.getAttribute("value");
        // System.out.println(actRes);
        Assert.assertEquals(actRes,"Поиск в Google");


    }*/
   /* @Test
    public void checkSearchField() {
        WebElement searchWebElement = driver.findElement(By.name("q"));
        searchWebElement.sendKeys("Test");
        String actRes = searchWebElement.getAttribute("value");
        //System.out.println(actRes);
        Assert.assertEquals(actRes, "Test");
    }*/


    @Test
    public void checkSearchingEngine() {
        SearchingTest.execute(driver);
        //CheckBtn.execute(driver);
    }


    @Test
    public void checkSearchingEngines() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        SearchingTest.execute(driver);
        //CheckBtn.execute(driver);
    }

    @Test
    public void checkBtnEngine() {
        CheckBtn.execute(driver);
    }


    @Test
    public void checkSrchEngine() {
        CheckSrchFld.execute(driver);
    }




    /*public static WebElement fld_Login(WebElement element){
        e
    }
    */

//    @AfterTest
//    public void close(){
//        driver.quit();
//    }
}

