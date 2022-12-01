package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.time.Duration;

public class Commands extends RunCucumber {
    public static void waitElementBeClickable(By element, Integer tempo) {
        Duration durationInSeconds = Duration.ofSeconds(tempo);
        WebDriverWait wait = new WebDriverWait(getDriver(), durationInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
