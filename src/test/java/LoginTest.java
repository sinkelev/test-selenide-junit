import org.junit.Test;
import Pages.LoginPage;
import Pages.MainPage;

public class LoginTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("fominaelena", "z0K6CTQR");
        MainPage mainPage = new MainPage();
        mainPage.checkOpen();
    }
}
