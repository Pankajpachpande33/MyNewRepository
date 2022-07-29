package Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://vinayavish.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
//		driver.findElement(By.name("login")).sendKeys("RK77");
//		
//		driver.findElement(By.name("password")).sendKeys("Rk@7665275");
//		
//		driver.findElement(By.xpath("//*[@id=\"stm-lms-login\"]/div[2]/div[3]/a")).click();
	}

}
