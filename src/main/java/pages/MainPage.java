package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/*
    Страница, открывающаяся после успешной авторизации
*/
public class MainPage {
    public static SelenideElement showAll = $x("//a[@data-qa='recommended-vacancies__show-all']");

}
