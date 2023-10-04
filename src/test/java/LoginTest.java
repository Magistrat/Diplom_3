import com.api.pojo.login.LoginPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveRequestPojo;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.api.CrateLoginDeleteUserByApi.*;
import static com.pageobject.SettingsUiTestInterface.REGISTER_URL;

public class LoginTest extends BaseTest {

    @Before
    public void openRegistrationPage(){
        // Окрытие страницы, создание тестового пользователя
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
    @DisplayName("Вход по кнопке «Войти в аккаунт» на главной странице")


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
