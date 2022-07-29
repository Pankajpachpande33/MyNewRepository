package Login_Page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://vinayavish.com/user-account/");;
		
		List<WebElement> mylist = driver.findElements(By.xpath("//a"));
		
		System.out.println("No. of Links =" +mylist.size());
		
		List<WebElement> mylist1 = driver.findElements(By.xpath("//button"));
		
		System.out.println("No. of Button =" +mylist1.size());
		
		List<WebElement> mylist2 = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println("No. of TestBox =" +mylist2.size());
		
		
		
	}

}
