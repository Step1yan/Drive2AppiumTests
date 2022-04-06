package Assertions;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Assertions {
    //assertTrue(loginAssertions.validSignIn(driver).getText().contains("Лента"));
    public void HaveText(MobileElement element, String actual) {
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated());
        assertTrue(element.getText().contains(actual));
    }
}
