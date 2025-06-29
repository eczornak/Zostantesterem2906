
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




}
