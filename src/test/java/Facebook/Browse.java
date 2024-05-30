package Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browse {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\priya\\eclipse-workspace\\type\\Automation\\target\\driver\\msedgedriver.exe");

WebDriverManager.edgedriver().setup();
WebDriver W =new EdgeDriver();
String S2="https://www.researchsquare.com/";
//W.get("https://www.researchsquare.com/");
W.navigate().to("https://www.facebook.com/login.php/");
WebElement E = W.findElement(By.id("email"));
//E.sendKeys("priyankajaya86@gmail.com");
//E.clear();
//E.sendKeys("12345");
W.findElement(By.)
W.findElement(By.xpath("//input[@type='text']"));
Thread.sleep(2000);
W.findElement(By.xpath("//title[@id='pageTitle']"));
Thread.sleep(2000);
W.manage().window().maximize();
W.findElement(By.xpath("//a[text()='தமிழ்']"));
W.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
W.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
for(int i=0;i<=20;i++)
{
	List<WebElement> a  = W.findElements(By.xpath("//a[1]"));
	System.out.println(a);
}
//E.sendKeys(E,"priyanka@gmail.com")
Actions A = new Actions(W);

A.
A.sendKeys(E,"priyanka@gmail.com");
A.doubleClick().build().perform();
A.click(E);
A.doubleClick();

A.contextClick().build().perform();
Robot R = new Robot();

W.findElement(By.)
JavascriptExecutor jse = (JavascriptExecutor)W;
jse.executeScript(null, args)
//E.clear();
//E.sendKeys("12345");
E.clear();
E.getT
String S3=E.getAttribute("type");
System.out.println(S3);
String S4=E.getText();
System.out.println(S4);
//String S4=E.getAttribute("value");
//System.out.println(S4);
//WebElement E1 =W.findElement(By.id("pass"));
//E1.sendKeys("priya");


//W.findElement(By.linkText("login")).click();
//WebElement E2= W.findElement(By.partialLinkText("log"));
//E2.click();

//List<WebElement> E3=W.findElements(By.partialLinkText("l"));
//for(int i=0;i<E3.size();i++)
//{
//WebElement E4= E3.get(i);
	//String S1=E4.getText();
	//System.out.println(S1);
//}



//W.navigate().back();
	//W.manage().window().maximize();
	//String S= W.getTitle();
	//System.out.println(S);
//String S1=W.getCurrentUrl();
///System.out.println(S1);
//String S3=W.getPageSource();
//System.out.println(S3);
//W.navigate().to("https://www.facebook.com/login.php/");
	
	//Thread.sleep(5000);
//	W.navigate().forward();
	
	//Thread.sleep(2000);
	//W.navigate().refresh();
	
	//String S3=W.getCurrentUrl();
	//if(S2.equals(S3))
	//{
		//System.out.println("match found "+S3);
		
	//}
//	else 
	//{
	//	System.out.println("not match");
	//}
	//String pagesource = W.getPageSource();
	//System.out.println(""+pagesource);
	}

}
