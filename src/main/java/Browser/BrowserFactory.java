package Browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public abstract class BrowserFactory {

    private BrowserFactory() {
    }
    public static WebDriver getDriver(String browser){
        WebDriver defaultDriver = new ChromeDriver();

        if ("DEFULT".equals(browser)){
            return new ChromeDriver();
        } else if ("IE".equalsIgnoreCase(browser)){
            return new InternetExplorerDriver();
        } else if ("OPERA".equalsIgnoreCase(browser)){
            return new OperaDriver();
        }
        return null;
    }
}