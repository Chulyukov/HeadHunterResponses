package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static java.lang.Thread.sleep;

public class ChromeWebHooks {
    public static void setChromeWebHooks() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver102.exe");

        WebDriver driver = new ChromeDriver();
        Configuration.pageLoadTimeout = 3000;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        setWebDriver(driver);
    }

    @SneakyThrows
    public static void stopLoading() {
        sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public static void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }
}
