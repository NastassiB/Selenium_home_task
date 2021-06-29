package page.pastebin;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

  WebDriver driver = Driver.getWebDriver();
  WebDriverWait wait = new WebDriverWait(driver,10);

  public void openMainPage() {
    String url = "https://pastebin.com";
    driver.get(url);
  }

  public void setCode(String codeText) {
    driver.findElement(By.id("postform-text")).sendKeys(codeText);
  }

  public void setPasteExpiration() {
    driver.findElement(By.id("select2-postform-expiration-container")).click();
    driver.findElement(By.xpath("//li[contains(@id, '10M')]")).click();
  }

  public void setPasteName(String pasteName) {
    driver.findElement(By.id("postform-name")).sendKeys(pasteName);
  }

  public void setSyntaxHighlighting(String syntaxHighlightingName) {
    String syntaxHighlightingText = String.format("//li[text() = '%s']", syntaxHighlightingName);
    driver.findElement(By.id("select2-postform-format-container")).click();
    driver.findElement(By.xpath(syntaxHighlightingText)).click();
  }

  public void savePaste() {
    driver.findElement(By.xpath("//button[text() = 'Create New Paste']")).click();
  }
}
