package Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class filp {
	public static void main(String[] args) throws InterruptedException, Throwable
	{
	WebDriverManager.edgedriver().setup();

		WebDriver wd= new EdgeDriver();
		wd.get("https://www.flipkart.com/");
	WebElement E= wd.findElement(By.name("q"));
	E.sendKeys("Redmi mobile",Keys.ENTER);
	List<String> textList;
	List<String> textList1;
	  textList = new LinkedList<>();
	  textList1 = new LinkedList<>();
	Map<List<String>, List<String>> pricelist = new LinkedHashMap<>();

	for (int i = 1; i <= 25; i++) {
	  
	    List<WebElement> elements = wd.findElements(By.xpath("(//div[contains(text(),'REDMI ')])[" + i + "]"));
	    for (WebElement element : elements) {
	        String text = element.getText();
	        textList.add(text);
	    }
	}
	    Thread.sleep(3000);
	    for (int j = 1; j <= 24; j++) {
	        
	    	   List<WebElement> elements1 = wd.findElements(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[" + j + "]"));
	    
	    for (WebElement element1 : elements1) {
	        String text1 = element1.getText();
	        textList1.add(text1);
	    }
	    }
	
	pricelist.put(new LinkedList<>(textList), new LinkedList<>(textList1));
	for (Map.Entry<List<String>, List<String>> entry : pricelist.entrySet()) {
	  System.out.println("Key: " + entry.getKey());
	    System.out.println("Value: " + entry.getValue());
	}
	
	File F = new File("C:\\sample\\filp6.xlsx");
	int a=textList.size();
	int b=textList1.size();
	System.out.println(a);
	System.out.println(b);
	Workbook w = new XSSFWorkbook();
	Sheet S= w.createSheet("Redmi");
	for (int k = 0; k < textList1.size(); k++) {
	    Row r = S.createRow(k);
	    Cell c = r.createCell(0); // First column
	    c.setCellValue(textList.get(k));
	    System.out.println(textList.get(k));
	    Cell c2 = r.createCell(1); // Second column
	    c2.setCellValue(textList1.get(k));
	    System.out.println(textList1.get(k));
	}
	
	FileOutputStream F1 = new FileOutputStream(F);
	w.write(F1);
	F1.close();
	}
	

	}
	
	


