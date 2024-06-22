package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Test_Base {
    public static WebDriver driver;
    public static void intializeDriver() {
        File edge_Driver= new File("driver/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", edge_Driver.getAbsolutePath());
        EdgeOptions options= new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new EdgeDriver(options);
        driver.manage().window().maximize();
    }

    public static void WebDelay() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void clickOnElement(By element){
        driver.findElement(element).click();
    }

    public static void fillInTextBox(By element, String value){
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(value);
    }

    public static void selectDropdown(By element, String value){
        Select dropdown = new Select(driver.findElement(element));
        dropdown.selectByValue(value);
    }

    public static void delayTillElementIsClickable(By locator) {
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void delayTillElementIsPresent(By locator) {
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void espoDropdownFillIn(By locator, String value){
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(locator),value).sendKeys(Keys.ENTER).build().perform();
    }
}