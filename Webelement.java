import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wb=new FirefoxDriver();
		
		wb.navigate().to("https://amazon.com");
		
		wb.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		wb.findElement(By.id("twotabsearchtextbox")).clear();;
		wb.findElement(By.id("twotabsearchtextbox")).sendKeys("pen");
		wb.findElement(By.id("twotabsearchtextbox")).submit();
		
		WebElement w=wb.findElement(By.id("twotabsearchtextbox"));
		
		Point po=w.getLocation();
		System.out.println("x: "+po.x + "y: "+po.y);
		
		String att=w.getAttribute("id");
		Thread.sleep(10000);
		
		
		wb.quit();
	}

}
