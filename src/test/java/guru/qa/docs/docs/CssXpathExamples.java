/**package guru.qa.docs.docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
        //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("123");
        $(by("data-testid", "email")).setValue("123"); //аттрибут-значение;

        //<input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("123");
        $("#email").setValue("123"); //эталон как должно быть
        $(byId("data-testid", "email")).setValue("123");
        $(By.id("data-testid", "email")).setValue("123");
        $x("//*[@id='email']").setValue("123");
        $x(byXpath("//*[@id='email']").setValue("123");

        //<input type="email" class="inputtext login_form_input_box" name="email" >
        $("[name=email]").setValue("123");
        $(byName("email")).setValue("123");

        //<input type="email" class="inputtext login_form_input_box" name="email">
        $("[class=login_form_input_box]").setValue("123");
        $(".login_form_input_box").setValue("123");
        $x("//*[@id='email']").setValue("123");//*-любой элемент
        $x("//*[@id='email']").setValue("123");


    }


    }
}**/
