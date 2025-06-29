
//komentarze

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends PageSetup {


    @Test
    public void testOne() {


        WebElement button = driver.findElementById("idExample");
        button.click();

        WebElement text = driver.findElementByClassName("entry-title");
        String textSuccess = text.getText();
        Assertions.assertEquals("Button success", textSuccess);


    }

    //sposoby oczekiwania na elementy w selenium
    // implicity wait, explicit wait, fluent wait(jako explicity o zwiększonej częstotliwości odpytywania strony), Java Thread.sleep

    @Test
    public void testTwo() {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
        emailInput.sendKeys("tester@test.pl");

        WebElement button = driver.findElementByName("et_builder_submit_button");
        button.click();

    }

    @Test
    public void testThree() {
        WebElement blueField = driver.findElementByXPath("");
        Assertions.assertEquals("#2ea3f2", blueField.getCssValue("blackground-color"));



    }


}
