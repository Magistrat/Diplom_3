import com.api.pojo.login.LoginPositiveRequestPojo;
import com.pageobject.pages.LoginPage;
import com.pageobject.pages.RegistrationPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static com.api.CrateLoginDeleteUserByApi.deleteUserByBearerToken;
import static com.api.CrateLoginDeleteUserByApi.loginUserByApiAndGetBearerToken;
import static com.pageobject.SettingsUiTestInterface.REGISTER_URL;

public class RegistrationTest extends BaseTest {
    // Автотесты для Регистрации пользователя

    @Before
    public void openRegistrationPage(){
        driver.get(REGISTER_URL);
    }

    @Test
    @DisplayName("Успешная регистрация")
    public void positiveRegistration(){
        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.checkRegistrationPage();
        registrationPage.fillToRegistrationFields(generatedTestName, generatedTestEmail, generatedTestPassword);
        registrationPage.clickToRegisterInForm();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
    }

    @Test
    @DisplayName("Ошибка для некорректного пароля. Минимальный пароль — шесть символов")
    public void negativeRegistrationCheckMinimumLengthPassword(){
        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.checkRegistrationPage();
        registrationPage.fillToRegistrationFields(generatedTestName, generatedTestEmail, invalidGeneratedTestPassword);
        registrationPage.clickToRegisterInForm();

        registrationPage.checkMessageOfIncorrectPassword();
        registrationPage.checkRegistrationPage();
    }


    @After
    public void deleteTestUser(){
        String bearerToken = loginUserByApiAndGetBearerToken(
                new LoginPositiveRequestPojo(
                        generatedTestEmail,
                        generatedTestPassword
                )
        );

        if (bearerToken != null) {
            // Для негативного теста нету Bearer Token
            deleteUserByBearerToken(bearerToken);
        }

    }

}
