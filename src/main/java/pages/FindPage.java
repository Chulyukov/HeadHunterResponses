package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/*
    Страница с релевантными вакансиями под вашем резюме
*/
public class FindPage {
    public static ElementsCollection replyButton = $$x("//a[@class='bloko-button bloko-button_kind-success bloko-button_scale-small']");
    public static SelenideElement textarea = $x("//textarea[@data-qa='vacancy-response-popup-form-letter-input']");
    public static SelenideElement rejectBtn = $x("//span[.='Отмена']//parent::button//following-sibling::button");
}
