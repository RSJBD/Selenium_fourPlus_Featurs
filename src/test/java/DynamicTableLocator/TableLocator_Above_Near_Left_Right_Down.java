package DynamicTableLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class TableLocator_Above_Near_Left_Right_Down {
	static WebDriver driver;
	
public static void main(String[] args) {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setBrowserVersion("119");
	 driver= new ChromeDriver(chromeOptions);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//a[normalize-space()='Jasmine.Morgan']")));
//Formated for thid code 1st target path then target from left/righ/left/bottom/near path (known locator text )
	element.click();//Click Check box --> Jasmine.Morgan
//	
//	WebElement belowelement = driver.findElement(RelativeLocator.with(By.xpath("//a[normalize-space()='Jasmine.Morgan']")).below(By.xpath("//a")));
//	System.out.println(belowelement.getText());
	
	
	selectUser("John.Smith");
	selectUser("Joe.Root");
}
public static void selectUser(String name) //username is table "Garry.White"  "Joe.Root"
{System.out.println("//a[normalize-space()='"+name+"']");
	WebElement checkbox = driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//a[normalize-space()='"+name+"']")));
	checkbox.click();
}

}
