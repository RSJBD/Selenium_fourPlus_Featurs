package newTab;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTab {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBrowserVersion("119");
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
//		driver.switchTo().newWindow(WindowType.WINDOW);//create new window
		driver.switchTo().newWindow(WindowType.TAB);//create tab
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
		
	}

}
