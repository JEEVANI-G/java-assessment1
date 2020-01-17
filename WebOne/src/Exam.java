import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam {
public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com/");
		WebElement Obj1 = ObjDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[2]/h4/a"));
		Obj1.click();
		WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id='button-cart']"));
		Obj2.click();
		WebElement Obj3=ObjDriver.findElement(By.xpath("//*[@id='content']/div/div[2]/ul[2]/li[1]/h2"));
		
		String dollar= Obj3.getText();
		System.out.println(""+dollar);
		WebElement Obj4=ObjDriver.findElement(By.xpath("//*[@id='form-currency']/div/ul/li[2]/button"));
		Obj4.click();
		String pound = Obj4.getText();
		System.out.println(" "+pound);
		
}
}
