package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait2=new WebDriverWait(driver,20);
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		Select sc= new Select(driver.findElement(By.name("fromPort")));
		sc.selectByVisibleText("Paris");
		Thread.sleep(3000);
		
		Select sc1= new Select(driver.findElement(By.name("toPort")));
		sc1.selectByVisibleText("London");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("Archana Sharma");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("address")).sendKeys("Manjri");
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys("Pune");
		Thread.sleep(3000);
		
		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		Thread.sleep(3000);
		
		driver.findElement(By.id("zipCode")).sendKeys("412307");
		Thread.sleep(3000);
		
		
		
		Select sc2= new Select(driver.findElement(By.name("cardType")));
		sc2.selectByVisibleText("Visa");
		Thread.sleep(3000);
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234");
		Thread.sleep(3000);
		
		driver.findElement(By.id("creditCardMonth"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("creditCardYear"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("nameOnCard")).sendKeys("John");
		Thread.sleep(3000);
		
		driver.findElement(By.id("rememberMe")).sendKeys("John");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		
		/*String cssSelectorOfSameElements="input[type='submit'][value='Choose This Flight']";
		List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements));
		a.get(0).click();
		
		driver.findElement(By.xpath("//input[@value='//tbody/tr[1]/td[1]/input[1]']")).click();
		*/
		
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.elementFromPoint(10, 10).click()");
		//driver.navigate().refresh();

		//wait2.until(ExpectedConditions.elementToBeClickable(By.id("fromCity"))).click();
		//Thread.sleep(3000);
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='From']"))).sendKeys("del");

		//List<WebElement>elements=driver.findElements(By.xpath("//*[@role='option']"));
		//elements.get(0).click();

	}




	}


