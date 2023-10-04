import com.api.pojo.login.LoginPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveRequestPojo;
import com.pageobject.pages.LoginPage;
import com.pageobject.pages.MainPage;
import com.pageobject.pages.ProfilePage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.api.CrateLoginDeleteUserByApi.*;
import static com.pageobject.pages.BasePage.openLoginPage;

public class ProfileTest extends BaseTest{

    @Before
    public void createTestUser(){
        // Открытие страницы Авторизации, создание тестового пользователя
        openLoginPage(driver);

        creteUserByApiAndGetBearerToken(
                new RegisterPositiveRequestPojo(
                        generatedTestEmail,
                        generatedTestPassword,
                        generatedTestName
                )
        );
    }

    @Test
    @DisplayName("Переход по клику на «Личный кабинет»")
    public void loginToAccountCheckProfile(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        MainPage mainPage = new MainPage(driver);
        mainPage.checkMainPage(true);
        mainPage.clickToProfileButtonFromHeader();

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.checkProfilePagePage(generatedTestName, generatedTestEmail);
    }

    @Test
    @DisplayName("Переход из личного кабинета в конструктор")
    public void loginToAccountFromProfileGoToConstructor(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        MainPage mainPage = new MainPage(driver);
        mainPage.clickToProfileButtonFromHeader();

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickToConstructorButtonFromHeader();

        mainPage.checkMainPage(true);
    }

    @Test
    @DisplayName("Переход из личного кабинета на логотип Stellar Burgers")
    public void loginToAccountFromProfileGoToLogoSite(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        MainPage mainPage = new MainPage(driver);
        mainPage.clickToProfileButtonFromHeader();

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickToWebSiteLogoButtonFromHeader();

        mainPage.checkMainPage(true);
    }

    @Test
    @DisplayName("Выход из аккаунта по кнопке «Выйти» в личном кабинете")
    public void loginToAccountAndLogOutInProfile(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
        loginPage.fillToLoginFields(generatedTestEmail, generatedTestPassword);
        loginPage.clickToLoginInForm();

        MainPage mainPage = new MainPage(driver);
        mainPage.clickToProfileButtonFromHeader();

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickLogOutInProfile();

        loginPage.checkLoginPage();
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
