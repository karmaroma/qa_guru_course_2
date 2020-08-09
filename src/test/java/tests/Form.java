package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Form {
    @Test
    void fillFormTest() {
        // Открыть форму
        open("http://suninjuly.github.io/simple_form_find_task.html");

        // Act: Регистрация
        $(byTagName("input")).sendKeys("Name");
        $(byName("last_name")).sendKeys("Surname");
        $(byClassName("city")).sendKeys("DefaultCity");
        $(byId("country")).sendKeys("Russia");
        $(byCssSelector("button.btn")).click();
        sleep(2000);


    }

}
