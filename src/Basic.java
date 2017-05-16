import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
public static void main(String...s)
{
System.out.println("Hello");	
System.out.println("Rahul");
System.out.println("Monu");
System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul.choudhary\\Downloads\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.co.in");
driver.manage().window().maximize();
}
}
