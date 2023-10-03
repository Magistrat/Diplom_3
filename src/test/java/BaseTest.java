import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.project.SettingsInterface.LIST_CHROME_OPTIONS;

public abstract class BaseTest {

    protected static WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(LIST_CHROME_OPTIONS);
        driver = new ChromeDriver(options);


        driver.manage().window().maximize();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
