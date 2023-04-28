package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/*
    Страница авторизации
*/
public class LoginPage {
    public static SelenideElement entireButton = $x("//a[@class='supernova-button']");
    public static SelenideElement authInput = $x("//input[@data-qa='account-signup-email']");
    public static SelenideElement authButton = $x("//button[@data-qa='account-signup-submit']");
}
