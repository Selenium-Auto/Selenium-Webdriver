import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		
	    driver.findElement(By.id("twotabsearchtextbox")).submit();
	    
	    WebElement web=driver.findElement(By.id("twotabsearchtextbox"));
	    
	    String text=web.getText();
	    System.out.println(text);
	    
	    String text1=web.getAttribute("id");
	    System.out.println(text1);
	    
	    String text2=web.getCssValue("id");
	    System.out.println(text2);
	    
	    
	   
	   // driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	
	   
	    Point po=web.getLocation();
	    System.out.println("X: "+ po.x);
	    System.out.println("Y: "+ po.y);
	    
	    boolean status=web.isEnabled();
	    System.out.println(status);
	    
	    boolean st=web.isSelected();
	    System.out.println(st);
	    
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
	}

}
