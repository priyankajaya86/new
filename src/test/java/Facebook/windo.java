package Facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windo {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver wd= new EdgeDriver();
		wd.get("https://www.ebay.com/");
		WebElement W= wd.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		W.sendKeys("Dell");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("(//div[@class='s-item__title'])[2]")).click();
		
		wd.findElement(By.xpath("(//div[@class='s-item__title'])[3]")).click();
		
		wd.findElement(By.xpath("(//div[@class='s-item__title'])[5]")).click();
		
		
		String parent=wd.getWindowHandle();
		System.out.println(parent);
		Set<String> child=wd.getWindowHandles();
		System.out.println(child);
		/*for(String x:child)
		{
			if(!parent.contains(x))
			{
				wd.switchTo().window(x);
				
			}
		}*/
		
		List<String> L1=new ArrayList<>();
		L1.addAll(child);	
		//wd.quit();
		
		wd.switchTo().window(L1.get(2));
		
		//System.out.println(parent);
		//System.out.println(child);
		
	}
}
