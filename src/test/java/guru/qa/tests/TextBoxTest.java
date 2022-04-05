package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBoxTest {
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1900x1080";
    }

    @Test
    void fillFormTest() {
        String name = "Alex Egorov"; //todo make with other test data
        String address = "Permananet Address :Another Street 2";

        open("/text-box");
        $("[id=userName]").setValue("Alex Egorov");
        $("[id=userEmail]").setValue("alex@egorov.com");
        $("[id=currentAddress]").setValue("Some street 1");
        $("[id=permanentAddress]").setValue("Another Street 2");
        $("[id=submit]").click();

        //Asserts
        $("[id=output]").shouldHave(text(name), text("alex@egorov.com"),
                text("Some street 1"), text("Another street 2"));

        $("[id=output] [id=name]").shouldHave(text(name));
        $("[id=name]").shouldHave(text(name));

   //wrong $("[id=permanentAddress]").shouldHave(text(address));
        $("p[id=permanentAddress]").shouldHave(text(address));
        $("[id=permanentAddress]", 1).shouldHave(text(address));

        /** Значение этих 3х строчек приравнивается к
         $("p[id=permanentAddress]").shouldHave (text ("Permanent Address: Another Street 2"));**/
       String expectedPermanentAddress = "Permananet Address :Another Street 2";
       String actualPermanentAddress = $("p[id=permanentAddress]").text();
       assertEquals(expectedPermanentAddress, actualPermanentAddress);

    }


}

