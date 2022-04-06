package Selectors;

import org.openqa.selenium.By;

public class LoginSelectors {
    public By BySign() {
        return By.id("com.drive2:id/bottomGuestActionButton");
    }
    public By ByMain() {
        return  By.xpath("//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.Button");
    }

    public By MainField() {
        return By.xpath("//android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText");
    }

    public By PasswordField() {
        return By.xpath("//android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
    }

    public By SignButton() {
        return By.xpath("//android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button");
    }

//Assertions
    public By AssertSelectorLenta() {
        return By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View");
    }
    public By AssertSelectorUserName() {
        return By.xpath("//android.view.View/android.view.View[2]/android.view.View[2]");
    }
    public By AssertSelectorPassword() {
        return By.xpath("//android.view.View/android.view.View[2]/android.view.View[4]");
    }
    public By AssertSelectorEmptyOnlyPass(){
        return By.xpath("//android.view.View/android.view.View[2]/android.view.View[3]");
    }

}
