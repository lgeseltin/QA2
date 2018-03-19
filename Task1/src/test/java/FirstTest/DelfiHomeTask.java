package FirstTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DelfiHomeTask {
    private static final String ARTICLE_TO_FIND = "Пять главных вещей о выборах президента РФ: Путин установил рекорд по голосам";
    private static final By TITLE = By.xpath("//a[contains(@class, 'top2012-title')]");

    @Test
    public void checkArticlePresent() {
        //запуск браузера
        System.setProperty("webdriver.gecko.driver", "C:/Java/QA2/Utils/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //ввод адреса страницы
        driver.get("http://rus.delfi.lv");

        // ищем на самой странице статью
        List<WebElement> titles = driver.findElements(TITLE);
        boolean isArticleFound = false;

        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).getText().equals(ARTICLE_TO_FIND)) {
                isArticleFound = true;
                break;
            }
        }

        Assert.assertTrue("No article found", isArticleFound);

//        for (WebElement we : titles) {
//            if (we.getText().equals(ARTICLE_TO_FIND)) {
//                break;
//            }
//        }
    }

}
