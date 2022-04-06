package Control;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends UiElement {
    public Button(AndroidDriver driver) {
        super(driver);
    }

    public void Click(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Find(locator).click();
    }

    public void ClickCoordinate(Integer xOffset, Integer yOffset) throws InterruptedException {
        Thread.sleep(5000);
        (new TouchAction(driver)).tap(PointOption.point(xOffset, yOffset)).perform();
    }

/*   public void swipe(Integer xOffset, Integer yOffset, Integer xOffsetm, Integer yOffsetm) throws InterruptedException {
        Thread.sleep(5000);
        (new TouchAction(driver)).press(PointOption.point(xOffset, yOffset))
                .moveTo(xOffsetm, yOffsetm)
               .release()
               .perfom();
   }*/
}
