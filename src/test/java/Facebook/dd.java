package Facebook;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dd {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\priya\\eclipse-workspace\\type\\Automation\\target\\driver\\msedgedriver.exe");
		WebDriver W =new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		W.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		W.manage().window().maximize();	
		WebElement D1=W.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement D2=W.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions A=new Actions(W);
		A.dragAndDrop(D1, D2).build().perform();
		WebElement D3=W.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement D4=W.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions B=new Actions(W);
		B.dragAndDrop(D3, D4).build().perform();
		WebElement D5=W.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement D6=W.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions C=new Actions(W);
		C.dragAndDrop(D5, D6).build().perform();
		WebElement D7=W.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement D8=W.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions D=new Actions(W);
		D.dragAndDrop(D7, D8).build().perform();
TakesScreenshot S=(TakesScreenshot)W;
File Src=S.getScreenshotAs(OutputType.FILE);
File Des= new File("C:\\Users\\priya\\eclipse-workspace\\type\\Automation\\target\\driver\\msedgedriver.exe\")");
FileUtils.copyFile(Src,Des);

	
	}

}
