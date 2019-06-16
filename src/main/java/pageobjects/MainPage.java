package pageobjects;


import Interfaces.ElementStatus;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Interfaces.ElementStatus.NOTPRESENTS;
import static Interfaces.ElementStatus.PRESENTS;


public class MainPage {

    private By searchField = By.name("q");
    private By serachBtn = By.name("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
    private By twoSearchBtn = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]");
    private By loginBtn = By.id("gb_70");
    private By linkEmail = By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a");
    private By linkImg = By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a");

    public By getSerachField(){
        return searchField;
    }

    public By getSerachBtn(){
        return serachBtn;
    }

    public By getTwoSearchBtn(){
        return twoSearchBtn;
    }

    public By getLoginBtn(){
        return loginBtn;
    }

    public By getLinkEmail(){
        return linkEmail;
    }

    public By getLinkImg(){
        return linkImg;
    }

    public void search(final WebDriver browersDriver, final String inputSearch){
        System.out.println("#####-------------------#####");
        System.out.println("Searching by string value: " + inputSearch);
        System.out.println("#####-------------------#####");

        browersDriver.findElement(getSerachField()).clear();
        browersDriver.findElement(getSerachField()).sendKeys(inputSearch);
        browersDriver.findElement(getSerachField()).sendKeys(Keys.ENTER);
    }

    public void search(final WebDriver browersDriver, final int inputSearch){
        System.out.println("#####-------------------#####");
        System.out.println("Searching by string value: " + inputSearch);
        System.out.println("#####-------------------#####");
        browersDriver.findElement(getSerachField()).clear();
        browersDriver.findElement(getSerachField()).sendKeys(String.valueOf(inputSearch));
        browersDriver.findElement(getSerachField()).sendKeys(Keys.ENTER);
    }

    public void searchAndClick(final ChromeDriver chromeDriver, final String inputSearch){
        System.out.println("#####-------------------#####");
        System.out.println("Searching by string value: " + inputSearch);
        System.out.println("#####-------------------#####");
        chromeDriver.findElement(getSerachField()).clear();
        chromeDriver.findElement(getSerachField()).sendKeys(String.valueOf(inputSearch));
        chromeDriver.findElement(getSerachField()).sendKeys(Keys.ENTER);
        chromeDriver.findElement(getSerachField()).click();
    }

    public String searchAndCheck(final WebDriver browersDriver, final String inputSearch){
        System.out.println("#####-------------------#####");
        System.out.println("Searching by string value: " + inputSearch);
        System.out.println("#####-------------------#####");
        browersDriver.findElement(getSerachField()).clear();
        browersDriver.findElement(getSerachField()).sendKeys(String.valueOf(inputSearch));
        browersDriver.findElement(getSerachField()).sendKeys(Keys.ENTER);
       return browersDriver.findElement(getSerachField()).getAttribute("value");
    }

    public int searchAndCheckInt(final WebDriver browersDriver, final String inputSearch){
        System.out.println("#####-------------------#####");
        System.out.println("Searching by string value: " + inputSearch);
        System.out.println("#####-------------------#####");
        browersDriver.findElement(getSerachField()).clear();
        browersDriver.findElement(getSerachField()).sendKeys(String.valueOf(inputSearch));
        browersDriver.findElement(getSerachField()).sendKeys(Keys.ENTER);
        return Integer.parseInt(browersDriver.findElement(getSerachField()).getAttribute("value"));
    }


    public void search(final ChromeDriver chromeDriver, final String... inputSearch){

       // WebElement searchTextBox = chromeDriver.findElement()
    }

    public void clickButtonTwo(final WebDriver browersDriver){
        System.out.println("#####-------------------#####");
        System.out.println("Click Button Search on Google: " );
        System.out.println("#####-------------------#####");

       // Assert.assertEquals(true, chromeDriver.findElement(getSerachBtn()).isDisplayed());
      //  Assert.assertEquals(true, chromeDriver.findElement(getSerachBtn()).isEnabled());

//        if(chromeDriver.findElement(getSerachBtn()).isDisplayed()) {
//       chromeDriver.findElement(getSerachBtn()).click();
//      }
//       else {
//        System.out.println("Button is not appearing");
//        }

      //  chromeDriver.findElement(getSerachBtn()).click();

        Assert.assertEquals(PRESENTS,isElementVisible(browersDriver,getTwoSearchBtn(),NOTPRESENTS));
        if(isElementVisible(browersDriver,getTwoSearchBtn(),NOTPRESENTS) == PRESENTS){
            browersDriver.findElement(getTwoSearchBtn()).click();
        }
            else {
            System.out.println("Not found");
        }

       // System.out.println(isElementVisible(chromeDriver,getTwoSearchBtn(),NOTPRESENTS));
    }

    public void clickButtonOne(final WebDriver browersDriver){
        System.out.println("#####-------------------#####");
        System.out.println("Click Button Search on Google: " );
        System.out.println("#####-------------------#####");

        // Assert.assertEquals(true, chromeDriver.findElement(getSerachBtn()).isDisplayed());
        //  Assert.assertEquals(true, chromeDriver.findElement(getSerachBtn()).isEnabled());

//        if(chromeDriver.findElement(getSerachBtn()).isDisplayed()) {
//       chromeDriver.findElement(getSerachBtn()).click();
//      }
//       else {
//        System.out.println("Button is not appearing");
//        }

        //  chromeDriver.findElement(getSerachBtn()).click();

        Assert.assertEquals(PRESENTS,isElementVisible(browersDriver,getSerachBtn(),NOTPRESENTS));
        if(isElementVisible(browersDriver,getSerachBtn(),NOTPRESENTS) == PRESENTS){
            browersDriver.findElement(getSerachBtn()).click();
        }
        else {
            System.out.println("Not found");
        }

        // System.out.println(isElementVisible(chromeDriver,getTwoSearchBtn(),NOTPRESENTS));
    }

    private ElementStatus isElementVisible(final WebDriver browersDriver, By by, ElementStatus getStatus){
        try{
            if(getStatus.equals(ElementStatus.ENABLED)){
                if(browersDriver.findElement(by).isEnabled())
                    return ElementStatus.ENABLED;
                return ElementStatus.NOTENABLED;
            }
            if(getStatus.equals(ElementStatus.VISIBLE)){
                if(browersDriver.findElement(by).isDisplayed())
                    return ElementStatus.VISIBLE;
                return ElementStatus.NOTVISIBLE;
            }
            return PRESENTS;
        }catch(org.openqa.selenium.NoSuchElementException nse){
            return NOTPRESENTS;
        }
    }

}
