package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fram {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver wd = new EdgeDriver();
		//WebDriver we = new EdgeDriver();
		wd.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//WebElement F1=wd.findElement(By.xpath("//iframe[@id='frame1']"));
	//wd.switchTo().frame(F1);
	//WebElement F2=wd.findElement(By.xpath("//input[@type='text']"));
	//F2.sendKeys("frames");
	//Thread.sleep(3000);
	wd.switchTo().frame("frame3");
	//String s6=wd.findElement(By.id("animals")).getText();
	//System.out.println(s6);
	//wd.findElement(By.xpath("//input[@id='a']")).click();
	//Thread.sleep(3000);
	//wd.switchTo().parentFrame();
	
//String S1=wd.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
	//System.out.println(S1);
	wd.switchTo().defaultContent();
	String S2=wd.findElement(By.xpath("//h1[contains(text(),'Frames Examples in Selenium Webdriver')]")).getText();
	System.out.println(S2);
	}

}
