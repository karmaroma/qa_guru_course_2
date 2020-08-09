package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {
    @Test
    void fillFormTest() {
        // Открыть форму
        open("http://suninjuly.github.io/simple_form_find_task.html");

        // Act: Регистрация
        $(byName("first_name")).sendKeys("Name");
        $(byName("last_name")).sendKeys("Surname");
        $(".city").sendKeys("DefaultCity");
        $("#country").sendKeys("Russia");
        $("#submit_button").click();

        // Assert 
        String expectedText = "Congrats, you've passed the task!";
        String actualText = switchTo().alert().getText();
        assertTrue(actualText.contains(expectedText), actualText);
    }

}
