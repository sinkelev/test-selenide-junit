package Pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final By
            loginSelector = By.name("user"),
            passwordSelector = By.name("password"),
            enterButtonSelector = By.id("button_submit_login_form");

    public LoginPage open() {
        Selenide.open("https://lmslite47vr.demo.mirapolis.ru/mira");
        return this;
    }

    public LoginPage inputLogin(String text) {
        $(loginSelector).sendKeys(text);
        return this;
    }
    public LoginPage inputPassword(String text) {
        $(passwordSelector).sendKeys(text);
        return this;
    }
    public void clickLoginButton() {
        $(enterButtonSelector).click();
    }
    public void login(String login, String password)
    {
        this.open()
                .inputLogin(login)
                .inputPassword(password)
                .clickLoginButton();
    }
}
