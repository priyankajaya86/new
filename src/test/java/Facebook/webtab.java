package Facebook;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtab {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver wd= new EdgeDriver();
		wd.get("https://demo.guru99.com/test/web-table-element.php");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String S1=	wd.findElement(By.xpath("//table[@class='dataTable']")).getText();
		//System.out.println(S1);
		List<WebElement> L1=wd.findElements(By.tagName("tr"));
		for(int i=0;i<L1.size();i++)
		{
			WebElement we1=L1.get(i);
			List<WebElement> L2=we1.findElements(By.tagName("td"));
			for(int j=0;j<L2.size();j++)
			{
			WebElement we=L2.get(j);
			String S2=we.getText();
			//System.out.println(S2);
			String S3="UCO Bank";
			if(S2.equals(S3))
			{
			System.out.println(L1.get(i).getText());
			
			}
			
			}
		}
	}
		
		
	}


