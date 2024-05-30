package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letcode {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver wd= new EdgeDriver();
		wd.get("https://letcode.in/frame");
		wd.switchTo().frame("firstFr");
	WebElement e=wd.findElement(By.xpath("//iframe[@src='innerFrame']"));
	wd.switchTo().frame(e);
	WebElement f=wd.findElement(By.xpath("//input[@name='email']"));
	
		f.sendKeys("priya");
		
		
		
	}

}
