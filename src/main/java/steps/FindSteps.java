package steps;

import lombok.SneakyThrows;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;
import static pages.FindPage.*;
import static pages.MainPage.showAll;

public class FindSteps {
    @SneakyThrows
    public static void reply() {
        for (int i = 0; i <= 20; i++) {
            replyButton.get(i).scrollIntoView("{block: \"center\"}").should(exist, ofSeconds(120)).click();
            Thread.sleep(500);
            if (textarea.exists()) {
                textarea.sendKeys("Я самый сильный и крутой, хоть называюсь школотой!");
                Thread.sleep(2000);
                rejectBtn.click();
            }
            if (i == 20) {
                i = 1;
                refresh();
            }
            if (!replyButton.get(i + 1).exists()) {
                Thread.sleep(500);
                back();
            }
            if (showAll.exists()) {
                showAll.click();
            }
        }
    }
}
