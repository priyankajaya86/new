package Facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class connection {
public connection(String string) 

{
WebDriverManager.edgedriver().setup();
EdgeDriver W=new EdgeDriver();

W.get(string);
//W=DriverManager.getConnection("https://www.facebook.com/login.php/", "priyanka","priya");
}
public static void main(String[] args) 
{
	connection c= new connection("https://www.facebook.com/login.php/");
}
}
