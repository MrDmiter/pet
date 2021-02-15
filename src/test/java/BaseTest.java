import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before class");
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void init() {
        System.out.println("IN before method");
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        System.out.println("IN after method");
    }

    @AfterAll
    static void afterClass() {
        driver.close();
        System.out.println("After class");
    }


}
