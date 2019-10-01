import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver w=new FirefoxDriver();
		
		w.navigate().to("https://amazon.in");
		
		w.manage().window().maximize();
    
    WebElement wb=driver.findElement(By.xpath("//a[@class='a-link-normal quadrant-overlay']"));
		
    Actions act=new Actions(driver);
	
    act.contextClick(wb).perform();
		act.sendKeys("w").perform();
		
    Thread.sleep(5000);
		
		driver.close();
