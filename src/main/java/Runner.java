import data.User;
import hooks.ChromeWebHooks;
import lombok.SneakyThrows;

import static steps.FindSteps.reply;
import static steps.LoginSteps.auth;
import static steps.MainSteps.clickShowAll;

public class Runner extends ChromeWebHooks {
    @SneakyThrows
    public static void main(String[] args) {
        setChromeWebHooks();
        auth(User.ME);
        clickShowAll();
        reply();
        closeBrowser();
    }
}
