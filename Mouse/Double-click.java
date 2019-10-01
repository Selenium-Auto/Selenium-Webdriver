import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver w=new FirefoxDriver();
		
		w.navigate().to("https://artoftesting.com/sampleSiteForSelenium.html");
		
		w.manage().window().maximize();
		
	    WebElement we=w.findElement(By.id("dblClkBtn"));
	    
	    Actions a=new Actions(w);
	    a.doubleClick(we).perform();
	    
	    Thread.sleep(5000);
	     w.close();
	}

}
