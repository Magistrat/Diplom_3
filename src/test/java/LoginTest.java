import com.api.pojo.login.LoginPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveRequestPojo;
import com.pageobject.pages.LoginPage;
import com.pageobject.pages.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.api.CrateLoginDeleteUserByApi.*;
import static com.pageobject.SettingsUiTestInterface.BASE_URL;

public class LoginTest extends BaseTest {

    @Before
    public void openRegistrationPage(){
        // Окрытие страницы, создание тестового пользователя
        driver.get(BASE_URL);

        creteUserByApiAndGetBearerToken(
                new RegisterPositiveRequestPojo(
                        generatedTestEmail,
                        generatedTestPassword,
                        generatedTestName
                )
        );
    }

    @Test
    @DisplayName("Вход по кнопке «Войти в аккаунт» на главной странице")
    public void loginToAccountFromMainPage(){
        MainPage mainPage = new MainPage(driver);

        mainPage.checkMainPage(false);
        mainPage.clickToLoginToAccountFromMainPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        mainPage.checkMainPage(true);
    }


    @After
    public void deleteTestUser(){
        String bearerToken = loginUserByApiAndGetBearerToken(
                new LoginPositiveRequestPojo(
                        generatedTestEmail,
                        generatedTestPassword
                )
        );
        deleteUserByBearerToken(bearerToken);
    }
}
