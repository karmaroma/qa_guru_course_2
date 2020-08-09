package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class LepraTests {
    @Test
    void lepraPayTest() {
        open("https://leprosorium.ru");

        $(".b-login-cruise_button").pressEnter(); // Нажать "Поехали"
        $("#js-login-cruise-pay_field_input").sendKeys("123@ru.com"); // Ввести почту
        $("#js-login-cruise-pay_agreement_input").click(); // Отметить чекбокс
        $(".b-login-cruise-pay_method-img").click(); // Выбрать платежную систему
        $("#js-login-cruise_go").click(); //Нажать оплатить

        // Assert: произошел переход на платежную систему
        $(".shopLogoNative").waitUntil(visible, 10000).shouldBe(visible);
    }

}
