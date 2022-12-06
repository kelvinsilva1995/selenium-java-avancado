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
    public static void waitElementBeVisible(By element, Integer tempo) {
        Duration durationInSeconds = Duration.ofSeconds(tempo);
        WebDriverWait wait = new WebDriverWait(getDriver(), durationInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static void clickElement(By element){
        System.out.println("########################################");
        try {
            System.out.println("Vai clicar no elemento: " + element);
            waitElementBeVisible(element, 10);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento: " + element);
        }catch (Exception error){
            System.out.println("********Aconteceu um erro ao tentar clicar no elemento: " + element);
            System.out.println(error);
        }
        System.out.println("########################################");
    }

    public static void fillField(By element, String value){
        System.out.println("########################################");
        try {
            System.out.println("Vai preencher o campo: " + element);
            waitElementBeClickable(element, 10);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("Preencheu o campo: " + element);
        }catch (Exception error){
            System.out.println("********Aconteceu um erro ao tentar preencher o campo: " + element);
            System.out.println(error);
        }
        System.out.println("########################################");
    }

}
