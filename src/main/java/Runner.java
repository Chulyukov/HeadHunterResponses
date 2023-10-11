import data.User;
import hooks.ChromeWebHooks;
import lombok.SneakyThrows;

import static steps.FindSteps.reply;
import static steps.LoginSteps.auth;
import static steps.MainSteps.clickShowAll;

public class Runner {
    @SneakyThrows
    public static void main(String[] args) {
//        setChromeWebHooks();
        auth(User.ZAUR);
        clickShowAll();
        reply();
//        closeBrowser();
    }
}
