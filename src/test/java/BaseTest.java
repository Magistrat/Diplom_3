import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

    protected static WebDriver driver;

    @Before
    public void setUp(){

    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
