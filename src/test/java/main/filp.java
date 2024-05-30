package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import addon.setup;

public class filp {
	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException
	{
		setup S= new setup();
		Thread.sleep(2000);
		S.setup1("https://www.flipkart.com/");
		String Serch= S.file("C:\\sample\\lists.txt");
		 List<String> l1= new ArrayList<>();
	     String[] S3= Serch.split(" ");
		 for(int i=0; i<S3.length;i++)
		    {
		     l1.add(S3[i]);
		    }
		    S.Search(l1);
		    }
		
	}


