package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final By
            mainPageLocator = By.name("StudentStartPage");

    public void checkOpen(){
        String currentUrl = WebDriverRunner.url();
        assert currentUrl.contains("myMeasureList");
        $(mainPageLocator).shouldBe(Condition.visible);
    }
}
