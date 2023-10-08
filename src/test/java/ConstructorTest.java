import com.pageobject.pages.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class ConstructorTest extends BaseTest {

    @Test
    @DisplayName("Переход в таб «Булки»")
    public void goToBunTab() {
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.clickToTabBunFromMainPage();
    }

    @Test
    @DisplayName("Переход в таб «Соусы»")
    public void goToSauceTab() {
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.clickToTabSauceFromMainPage();
    }

    @Test
    @DisplayName("Переход в таб «Начинки»")
    public void goToIngredientTab() {
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.clickToTabIngredientFromMainPage();
    }

}
