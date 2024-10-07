package selenium3.reusableMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Selenium3ReusableMethod {
    // reusable method to launch different browser
    public static void reusableMethod(String browser) {

        // chrome browser case
        if (browser.equals("chrome")) {
            // set the path for the chromeDriver
            String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                    + "resources" + File.separator + "chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");

            // Firefox browser case
        } else if (browser.equals("Firefox")) {
            // set the path for the GeckoDriver(Firefox)
            String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                    + "resources" + File.separator + "geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", path);
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.com/");

            // Edge browser case
        } else if (browser.equals("edge")) {
            // set the path for the EdgeDriver
            String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                    + "resources" + File.separator + "msedgedriver.exe";
            System.setProperty("webdriver.edge.driver", path);
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.walmart.com/");
        }
    }

    // the main method to test the reusableMethod
    public static void main(String[] args) {

        // call the method and pass the desired browser as a parameter
        Selenium3ReusableMethod.reusableMethod("edge");
    }
}
