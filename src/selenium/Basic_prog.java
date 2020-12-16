package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_prog {
	public static void main(String[] agrs) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVI\\eclipse-workspace\\javaPrograms\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//span(@class='a-size-medium a-color-base a-text-normal')"));
		
		int s1=li.size();
		System.out.println(s1);
		
		for (int i = 0; i < li.size(); i++) {
			WebElement s = li.get(i);
			String q = s.getText();
			System.out.println(q);
			
		}
		driver.quit();
		
	}

}





