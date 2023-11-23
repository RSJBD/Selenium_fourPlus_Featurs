package DynamicTableLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TableLocator_Above_Near_Left_Right_Down {
public static void main(String[] args) {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setBrowserVersion("119");
	WebDriver driver= new ChromeDriver(chromeOptions);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.manage().window().maximize();
	driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
	System.out.println(driver.getTitle());
	WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//a[normalize-space()='Jasmine.Morgan']")));
//Formated for thid code 1st target path then target from left/righ/left/bottom/near path (known locator text )
	element.click();
}

}
