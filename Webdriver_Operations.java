import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver w=new FirefoxDriver();
		
		w.get("http://google.com");
		
		Thread.sleep(6000);
		
		w.navigate().to("https://amazon.com");
		
		Thread.sleep(4000);
		
		String page= w.getCurrentUrl();
		System.out.println(page);
		
		String title=w.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		
		w.navigate().to("https://www.amazon.in/gp/site-directory?ref_=nav_shopall_btn");
		
		Thread.sleep(1000);
		
		w.navigate().refresh();
		
		Thread.sleep(2000);
		
		w.navigate().back();
		
		Thread.sleep(1000);
		
		w.navigate().forward();
		
		Thread.sleep(1000);
		
		w.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		Dimension dem=new Dimension(1000,1000);
		w.manage().window().setSize(dem);;
		
		w.manage().window().maximize();
		
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		w.findElement(By.xpath("//input[@class='nav-input']")).click();
		
		w.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		
	}

}
