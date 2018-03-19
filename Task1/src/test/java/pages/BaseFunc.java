package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc(){
        System.setProperty("webdriver.chrome.driver","C:/Java/QA2/Utils/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }

        public void goToUrl(String url){
            if (!url.contains("http://") && !url.contains("https://")){
                url = "http://" + url;
            }
            driver.get(url);
        }

        public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
        }
}
