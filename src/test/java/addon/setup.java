package addon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
	static WebDriver w;
	public void setup1(String string)
	{
		WebDriverManager.edgedriver().setup();
		w= new EdgeDriver();
		w.get(string);
	}	
	public String file(String S2) throws InvalidFormatException, IOException
	{
		FileReader fr=new FileReader(S2);
		char[] c= new char[30];
		fr.read(c);
		String fc = new String(c);
	    fr.close();
         return fc;
	}
	public static void main(String[] args) throws InvalidFormatException, IOException
	
	{
	
		setup S= new setup();
		S.file("C:\\sample\\lists.txt");
	
		
	}

}
