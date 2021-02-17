import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TestResultLoggerExtension.class)
public class AllTests extends BaseTest {

    @Test
    //@Tag("Regression")
    @DisplayName("Open site test")
    void firstTest() {
        System.out.println("Inside test1");
        driver.get("https://www.jetbrains.com/");
        WebElement myAccount = driver.findElement(By.cssSelector("[data-test='menu-main-icon-account']"));
        myAccount.click();
        assertEquals(driver.findElement(By.tagName("h1")).getText(), "Welcome to JetBrains Account");
    }

    @Test
    //@Tag("Regression")
    void secondTest() {
        System.out.println("Inside test2");
        driver.get("https://www.jetbrains.com/");
        WebElement title = driver.findElement(By.tagName("h1"));
        assertEquals(title.getText(), "Essential tools for software developers and teams");

    }

    @Test
    @Description("Some description that describess our test")
    @Epic("EPIC003")
    @Feature("Feature1")
    @Story("Cart verification")
    @Step("Step click on cart")
    void thirdTest() {
        System.out.println("Inside test3");
        driver.get("https://www.jetbrains.com/");
        WebElement cart = driver.findElement(By.cssSelector("[data-test='menu-main-icon-cart'"));
        cart.click();
        assertEquals(driver.getCurrentUrl(), "https://www.jetbrains.com/store/#commercial?billing=yearly");
    }

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {"dsf", "sdf", "lkmlk"})
    void checkParamTestInJunit(String toCompare) {
        assertEquals("sdf", toCompare);
    }

}
