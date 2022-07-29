package Login_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_13 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://vinayavish.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/div[3]/span")).click();

	}

}
