package Control;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class UiElement {
    final AndroidDriver driver;

    public UiElement(AndroidDriver driver) {
        this.driver = driver;
    }

    public MobileElement Find(By locator) {
        return (MobileElement) driver.findElement(locator);
    }

    public Boolean Display(By locator) {
        return Find(locator).isDisplayed();
    }
}
