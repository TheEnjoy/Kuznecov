package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ParsingPage {
    private WebElement searchResultContainer;

    By searchResultHeader = By.xpath("//*[@id='rso']//h3");

  /*  public List<String> readSearchResults() {
        List<WebElement> searchResults = searchResultContainer
                .findElements(searchResultHeader);

        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            searchResultsHeaderText.add(searchResults.get(i).getText());
        }
        return searchResultsHeaderText;

    }
    */
   /* public void readSearchResults() {
        List<WebElement> searchResults = searchResultContainer
                .findElements(searchResultHeader);

        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            System.out.println(searchResultsHeaderText.add(searchResults.get(i).getText()));
            searchResultsHeaderText.add(searchResults.get(i).getText());

        }*/

    /*public void readSearchResults() {
        List<WebElement> searchResults = searchResultContainer
                .findElements(By.xpath("//*[@id='rso']//h3/a"));

        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            System.out.println("#######" + searchResults.get(i).getAttribute("href") + "######");
            searchResultsHeaderText.add(searchResults.get(i).getAttribute("href"));

        }
    }
*/

    public List<String> readSearchResultsTest(WebDriver chromeDriver) {
        List<WebElement> searchResults = chromeDriver.findElements(searchResultHeader);

        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            //System.out.println(searchResults.get(i).getText());
            searchResultsHeaderText.add(searchResults.get(i).getText());
        }
        // Вывод на экран всех элемнтов
        for (WebElement element: searchResults)
            System.out.println(element.getText());

        return searchResultsHeaderText;
    }



}
