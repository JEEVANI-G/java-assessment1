import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkTwo 
{
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
	ObjDriver.manage().window().maximize();
	ObjDriver.get("http://demo.automationtesting.in/Register.html");
	WebElement username=ObjDriver.findElement(By.name("Name"));
	highLightElement(ObjDriver,username);
	
}

	private static void highLightElement(WebDriver ObjDriver, WebElement element) 
	{
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)ObjDriver;
		js.executeScript("argument[0].setAttribute('style',"+"'background:yellow;border:2px solid red;');", element);
		try{Thread.sleep(1000);}
		catch(InterruptedException e){System.out.println(e.getMessage());}
		js.executeScript("argument[0].setAttribute('style',"+"'background:yellow;border:2px solid black;');", element);
		
	}
}