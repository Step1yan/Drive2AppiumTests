package Test;

import Assertions.Assertions;
import Control.Button;
import Control.InputBox;
import Settings.Settings;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class MazdaTest extends Settings {
    private final Button button = new Button(driver);
    private final InputBox inputField = new InputBox(driver);
    private final Assertions assertions = new Assertions();

    @Test
    public void start() throws InterruptedException {
        button.ClickCoordinate(938, 969);
        Dimension dimension = driver.manage().window().getSize();
        int startX = (int) (dimension.width * 0.5);
        int startY = (int) (dimension.height * 0.8);
        int endX = (int) (dimension.width * 0.5);
        int endY = (int) (dimension.height * 0.1 );

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(endX, endY)).release().perform();

    }
}
