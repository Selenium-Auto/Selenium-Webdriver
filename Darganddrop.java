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
		
		w.navigate().to("https://material.angular.io/cdk/drag-drop/overview");
		
		w.manage().window().maximize();
    
    WebElement src=w.findElement(By.xpath("//div[@class='example-box cdk-drag']"));
    WebElement dest=w.findElement(By.xpath("//div[@class='example-box cdk-drag ng-star-inserted']"));
		
    //using action class perform drag and drop operation
		Actions act=new Actions(w);
		act.dragAndDrop(src,dest).perform();
    
    }
    
    }
    
