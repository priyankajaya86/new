package Facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jscript {
	public static void main(String[] args) throws InterruptedException, Throwable
	{
		WebDriverManager.edgedriver().setup();
	
		WebDriver wd = new EdgeDriver();
		//WebDriver we = new EdgeDriver();
		wd.get("https://www.naukri.com/registration/createAccount?othersrcp=2263622");
		wd.findElement(By.xpath(" (//p[@class='main-2'])[1]")).click();
		Thread.sleep(3000);
		//wd.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		wd.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\priya\\OneDrive\\Desktop\\fileup.exe");
		/*WebElement log=wd.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement pass=wd.findElement(By.xpath("//button[text()='Request OTP']"));
		WebElement down =wd.findElement(By.xpath("//a[text()='Contact Us']"));
		WebElement up =wd.findElement(By.xpath("//a[text()='Contact Us']"));
		JavascriptExecutor je = (JavascriptExecutor)wd;
		je.executeScript("arguments[0].setAttribute('value','priyanka')", log);
		je.executeScript("arguments[0].setAttribute('style','background:blue;border:2px solid red')", log);
		//Object obj=je.executeScript("return arguments[1].getAttribute('value','priyanka')",log, pass);
		//je.executeScript("arguments[1].click()", log,pass);
		//je.executeScript("arguments[0].scrollIntoView(true)", down);
		//Thread.sleep(5000);
		//je.executeScript("arguments[0].scrollIntoView(false)", up);
		//System.out.println(obj);
		Thread.sleep(5000);
	String S1=log.getCssValue("font-size");
	String S2=pass.getCssValue("font-size");
	String S3=log.getCssValue("width");
	String S4=pass.getCssValue("background");
	System.out.println(S1);
	System.out.println(S2);
	System.out.println(S3);
	System.out.println(S4);
	//wd.get("https://www.flipkart.com/account/login?ret=/");*/
		
		
	}
	

}
