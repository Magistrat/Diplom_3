import com.api.pojo.login.LoginPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveRequestPojo;
import com.pageobject.pages.LoginPage;
import com.pageobject.pages.MainPage;
import com.pageobject.pages.RecoveryPasswordPage;
import com.pageobject.pages.RegistrationPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.api.CrateLoginDeleteUserByApi.*;
import static com.pageobject.pages.BasePage.openMainPage;
import static com.pageobject.pages.BasePage.openForgotPasswordPage;
import static com.pageobject.pages.BasePage.openRegistrationPage;

public class LoginTest extends BaseTest {

    @Before
    public void createTestUser(){
        // Создание тестового пользователя
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
        openMainPage(driver);

        MainPage mainPage = new MainPage(driver);
        mainPage.checkMainPage(false);
        mainPage.clickToLoginToAccountFromMainPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        mainPage.checkMainPage(true);
    }

    @Test
    @DisplayName("Вход по кнопке «Войти в аккаунт» на главной странице")
    public void loginToAccountFromClickProfilePage(){
        openMainPage(driver);

        MainPage mainPage = new MainPage(driver);
        mainPage.checkMainPage(false);
        mainPage.clickToProfileButtonFromHeader();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        mainPage.checkMainPage(true);
    }

    @Test
    @DisplayName("Вход через кнопку в форме регистрации")
    public void loginToAccountFromRegisterPage(){
        openRegistrationPage(driver);

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

    @Test
    @DisplayName("Вход через кнопку в форме восстановления пароля")
    public void loginToAccountFromRecoveryPasswordPage(){
        openForgotPasswordPage(driver);

        RecoveryPasswordPage recoveryPasswordPage = new RecoveryPasswordPage(driver);
        recoveryPasswordPage.checkRecoveryPasswordPage();
        recoveryPasswordPage.clickIfRememberPassword();

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
