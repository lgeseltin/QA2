package firstTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOnGradle {

    @Test
    public void secondTestOnFireFox()throws InterruptedException{
    System.setProperty("webdriver.gecko.driver", "C:/Java/QA2/Utils/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        //Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void secondTestOnChrome()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Java/QA2/Utils/chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("http://javaguru.lv");
        //Thread.sleep(5000);
        driver2.quit();
    }
}
