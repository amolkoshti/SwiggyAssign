import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggyProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek_sawai\\Documents\\all jars extracted\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.findElement(By.xpath("//a[text()='Search']")).click();
		   
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("Indiranagar, Bengaluru");
		   
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //span[text()='Indiranagar, Bengaluru, Karnataka, India']")).click();
		   
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=\'Search\']")).click();
		
		//enter the resto name
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys("Bite Me");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys((Keys.ENTER));
		
		
		//click on bite me resto
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//img[@alt='Bite Me']")).click();
		driver.findElement(By.xpath("//a[@href='/restaurants/bite-me-100-feet-road-indiranagar-bangalore-505']")).click();
		
		//clickonaddforredvelvet cupcake
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
		
		
		//adding tiramisucake
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='ADD'])[3]")).click();
		
		//click on checkout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1gPB7']")).click();
		
		
	}

}
