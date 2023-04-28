package steps;

import data.User;
import lombok.SneakyThrows;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;
import static pages.LoginPage.*;

public class LoginSteps {
    @SneakyThrows
    public static void auth(User user) {
        open("https://hh.ru/");
        entireButton.should(exist, ofSeconds(120)).click();
        authInput.should(exist, ofSeconds(120)).sendKeys(User.valueOf(user.name()).getEMAIL());
        authButton.should(exist, ofSeconds(120)).click();
    }
}
