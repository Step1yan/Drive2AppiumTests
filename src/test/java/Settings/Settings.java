package Settings;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Settings {
    public AndroidDriver driver;

   // @BeforeTest
   // public void setup() throws MalformedURLException {
//@BeforeTest
public Settings(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
//        desiredCapabilities.setCapability("deviceName", "Google Nexus 5 - 9.0 - API 28 - 1080x1920");
//        desiredCapabilities.setCapability("deviceManufactorer", "Genymotion");

        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("platformName", "Android");
//        File file = new File("src/test/resources/", "DRIVE2.apk");
//        desiredCapabilities.setCapability("app", file.getAbsolutePath());
        desiredCapabilities.setCapability("appPackage", "com.drive2");
        desiredCapabilities.setCapability("appActivity", "com.drive2.v3.ui.activity.StartupActivity");
        desiredCapabilities.setCapability("resetOnSessionStartOnly", true);
        try {
            this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
      //  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void close() {
        driver.close();
        driver.quit();
    }
}
