package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class Lepra {
    @Test
    void lepraPayTest() {
        // Открыть leprosorium
        open("https://leprosorium.ru");

        // Нажать "Поехали"
        $(".b-login-cruise_button").pressEnter();
        // Ввести почту
        $("#js-login-cruise-pay_field_input").sendKeys("123@ru.com");
        sleep(500);
        // Отметить чекбокс
        $("#js-login-cruise-pay_agreement_input").click();
        sleep(500);
        // Выбрать платежную систему
        $(".b-login-cruise-pay_method-img").click();
        //Нажать олптатить
        $("#js-login-cruise_go").click();
        sleep(8000);

        //assert: произошел переход на платежную систему
        $(".shopLogoNative").shouldBe(visible);
    }

}
