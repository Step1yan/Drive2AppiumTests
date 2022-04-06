package Test;

import Assertions.Assertions;
import Control.Button;
import Control.InputBox;
import Selectors.LoginSelectors;
import Settings.Settings;
import org.junit.*;

public class LoginTest extends Settings {
    private final Button button = new Button(driver);
    private final InputBox inputField = new InputBox(driver);
    private final LoginSelectors selectors = new LoginSelectors();
    private final Assertions assertions = new Assertions();

    @Test
    //positive test with valid login data
    public void First() {
        button.Click(selectors.BySign());
        button.Click(selectors.ByMain());
        inputField.SendKeys(selectors.MainField(), "grigorqa@gmail.com");
        inputField.SendKeys(selectors.PasswordField(), "Tesvan2022");
        button.Click(selectors.SignButton());
        assertions.HaveText(button.Find(selectors.AssertSelectorLenta()), "Лента");
    }
    @Test
    //negative test with empty login details
    public void negativeEmpty() {

        button.Click(selectors.BySign());
        button.Click(selectors.ByMain());
        button.Click(selectors.SignButton());
        assertions.HaveText(button.Find(selectors.AssertSelectorUserName()),"Укажите email адрес или номер телефона." );
        assertions.HaveText(button.Find(selectors.AssertSelectorPassword()),"Не указан пароль" );
    }
    @Test
    //negative test with valid userName empty password details
    public void ValUsNmEmptyPass(){
        button.Click(selectors.BySign());
        button.Click(selectors.ByMain());
        inputField.SendKeys(selectors.MainField(), "grigorqa@gmail.com");
        button.Click(selectors.SignButton());
        assertions.HaveText(button.Find(selectors.AssertSelectorEmptyOnlyPass()),"Не указан пароль" );
    }
    @Test
    //negative test with valid userName empty password details
    public void ValPassEmptyUserName(){
        button.Click(selectors.BySign());
        button.Click(selectors.ByMain());
        inputField.SendKeys(selectors.PasswordField(), "Tesvan2022");
        button.Click(selectors.SignButton());
        assertions.HaveText(button.Find(selectors.AssertSelectorUserName()),"Укажите email адрес или номер телефона." );
    }
    @Test
    public void shortPassword4Digit(){
        button.Click(selectors.BySign());
        button.Click(selectors.ByMain());
        inputField.SendKeys(selectors.MainField(), "grigorqa@gmail.com");
        inputField.SendKeys(selectors.PasswordField(), "1234");
        button.Click(selectors.SignButton());
        assertions.HaveText(button.Find(selectors.AssertSelectorEmptyOnlyPass()),"Слабый пароль, добавьте ещё 1 символ");
    }
}
