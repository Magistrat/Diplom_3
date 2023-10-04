import com.api.pojo.login.LoginPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveRequestPojo;
import com.pageobject.pages.LoginPage;
import com.pageobject.pages.MainPage;
import com.pageobject.pages.RegistrationPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.api.CrateLoginDeleteUserByApi.*;
import static com.pageobject.SettingsUiTestInterface.REGISTER_URL;

public class LoginFromRegisterPageTest extends BaseTest{

    @Before
    public void openRegisterPage(){
        // Окрытие страницы Регистрации, создание тестового пользователя
        driver.get(REGISTER_URL);

        creteUserByApiAndGetBearerToken(
                new RegisterPositiveRequestPojo(
                        generatedTestEmail,
                        generatedTestPassword,
                        generatedTestName
                )
        );
    }

    @Test
    @DisplayName("Вход через кнопку в форме регистрации")
    public void loginToAccountFromRegisterPage(){
        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.checkRegistrationPage();
        registrationPage.clickToLoginFromRegistrationPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        MainPage mainPage = new MainPage(driver);
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
