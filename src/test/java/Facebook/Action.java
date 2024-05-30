package Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\priya\\eclipse-workspace\\type\\Automation\\target\\driver\\msedgedriver.exe");
		//System.setProperty(null, null);
		//system.set
		WebDriver W =new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		//W.get
		W.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement e= W.findElement(By.xpath("//select[@id='first']"));
		Select x= new Select(e);
		x.selectByIndex(0);
		Thread.sleep(2000);
		WebElement e1= W.findElement(By.xpath("//select[@id='animals']"));
		Select x1= new Select(e1);
		x1.selectByValue("babycat");
		x.selectByVisibleText("Yahoo");
		Thread.sleep(2000);
		Alert A= new Alert();

		
		/*List<WebElement> L1=x.getOptions();
		for(int i=L1.size()-1;i>=0;i--)
		{
			WebElement E=L1.get(i);
			String S1=E.getText();
			System.out.println(S1);
			
		}*/
		WebElement E2=W.findElement(By.xpath("//select[@id='second']"));
		Select x2= new Select(E2);
		x2.selectByIndex(0);
		x2.selectByIndex(1);
		x2.selectByIndex(2);
		x2.selectByIndex(3);
		x2.deselectByIndex(2);
		List<WebElement> addselected=x2.getAllSelectedOptions();
		for(int j=addselected.size()-1;j>=0;j--)
		{
			WebElement E1 = addselected.get(j);
			String S1=E1.getText();
			System.out.println(S1);
			
		}
		
		
		
		/*W*.navigate().to("https://www.facebook.com/login.php/");
		//WebElement E = W.findElement(By.xpath("//a[text() = 'Messenger']"));
		Actions A=new Actions(W);
	//	A.moveToElement(E).click().perform();
		WebDriverWait wait =new WebDriverWait(W,Duration.ofSeconds(30));

		WebElement E1=wait.until(ExpectedCondition.presenceOfElementLocated()(By.id("email")));
		WebElement E1=wait.W.findElement(By.id("email"));
		
		//Thread.sleep(2000);
		A.sendKeys(E1,"priyana").perform();
		A.doubleClick().build().perform();
		A.contextClick(E1).build().perform();
		Robot R= new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		

		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		*/
	}
}
	
	



