package Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\priya\\eclipse-workspace\\type\\Automation\\target\\driver\\msedgedriver.exe");
		WebDriver W =new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		W.navigate().to("https://demo.automationtesting.in/Alerts.html");
		W.manage().window().maximize();	
		W.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert A=W.switchTo().alert();
		Thread.sleep(6000);
		A.accept();
		W.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
W.findElement(By.xpath("//button[@class='btn btn-primary']")).click();		
A.dismiss();
W.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
W.findElement(By.xpath("//button[@class='btn btn-info']")).click();
String S1=A.getText();
System.out.println(S1);
A.sendKeys("ALL");
A.accept();

/*TaesScreenshot t = (TakesScreenshot)W;
	File Src=t.getScreenshotAs(OutputType.FILE);
	File des= new File("C:\\Users\\priya\\eclipse-workspace\\type\\Automation\\target\\Screen.png");
	FileUtils.copyFile(Src, des);*/
	
	
	}
	TakesScreenshot t = (TakesScreenshot)W;
	

}
