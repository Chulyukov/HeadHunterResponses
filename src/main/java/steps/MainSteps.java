package steps;


import static com.codeborne.selenide.Condition.exist;
import static java.time.Duration.ofSeconds;
import static pages.MainPage.showAll;

public class MainSteps {
    public static void clickShowAll() {
        showAll.should(exist, ofSeconds(120)).click();
    }
}
