import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestResultLoggerExtension implements TestWatcher {




    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        File file1 = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file1, new File("src/test/resources/image"+Math.random()+".png"));
        } catch (IOException e) {
            System.out.println("Here bug");
            e.printStackTrace();
        }
        System.out.println("FAILUUUUUUUUUUUUUUUUU___REEEE");
    }


}