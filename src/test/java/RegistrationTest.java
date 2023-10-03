import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;


import static com.pageobject.SettingsUiTestInterface.REGISTER_URL;

public class RegistrationTest extends BaseTest {

    @Before
    public void openRegistrationPage(){
        driver.get(REGISTER_URL);
    }

    @Test
    @DisplayName("Успешная регистрация")
    public void positiveRegistration(){

    }

}
