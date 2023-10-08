import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.pageobject.SettingsUiTestInterface.LIST_CHROME_OPTIONS;

public abstract class BaseTest {

    protected static WebDriver driver;

    private static final Faker faker = new Faker();

    protected static String generatedTestName;
    protected static String generatedTestEmail;
    protected static String generatedTestPassword;
    protected static String invalidGeneratedTestPassword;


    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(LIST_CHROME_OPTIONS);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        generatedTestName = faker.name().firstName();
        generatedTestEmail = faker.internet().emailAddress();
        generatedTestPassword = faker.internet().password(6, 7);
        invalidGeneratedTestPassword = faker.internet().password(5, 6);
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
