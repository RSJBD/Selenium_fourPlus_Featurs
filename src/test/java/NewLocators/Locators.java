package NewLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locators {
public static void main(String[] args) {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setBrowserVersion("119");
	WebDriver driver= new ChromeDriver(chromeOptions);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.manage().window().maximize();
	driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
	System.out.println(driver.getTitle());
	WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//a[normalize-space()='Jasmine.Morgan']")).near(By.xpath("//input[@type='checkbox']")));
String text = element.getText();System.out.println(text);	
}

}
