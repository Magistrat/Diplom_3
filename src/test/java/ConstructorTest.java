import com.pageobject.pages.MainPage;
import com.pageobject.pages.MainPageTabs;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static com.pageobject.pages.BasePage.openMainPage;

public class ConstructorTest extends BaseTest {

    @Before
    public void openMain() {
        openMainPage(driver);
    }

    @Test
    @DisplayName("Переход в таб «Булки»")
    public void goToBunTab() {
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.checkActiveTabConstructorInMainPage(MainPageTabs.BUN);
    }

    @Test
    @DisplayName("Переход в таб «Соусы»")
    public void goToSauceTab() {
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.clickToTabSauceFromMainPage();
        mainPage.checkActiveTabConstructorInMainPage(MainPageTabs.SAUCES);
    }

    @Test
    @DisplayName("Переход в таб «Начинки»")
    public void goToIngredientTab() {
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.clickToTabIngredientFromMainPage();
        mainPage.checkActiveTabConstructorInMainPage(MainPageTabs.INGREDIENT);
    }

}
