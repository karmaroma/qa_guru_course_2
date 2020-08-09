package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SoapTests {
    @Test
    void registerFormTest() {
        open("https://soap4.me/");

        //act: Регистрация аккаунта
        $(byText("регистрация")).click();
        $(byName("login")).sendKeys("Surname");
        $(byName("email")).sendKeys("test@mail.com");
        $(byName("password")).sendKeys("password");
        $(".button.corners").click();

        //assert: Логин уже занят
        $("#message").shouldHave(text("К сожалению этот логин занят, либо на этот почтовый адрес уже зарегистрирован аккаунт"));
    }
}
