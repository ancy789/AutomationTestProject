package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JustWatchesCheckoutPage {

	WebDriver driver;
	
	//Contact
	By chEmail=By.xpath("//*[@id=\"email\"]");
	
	//Delivery address
	
	By fname=By.xpath("//*[@id=\"TextField0\"]");
	By lname=By.xpath("//*[@id=\"TextField1\"]");
	By address=By.xpath("//*[@id=\"shipping-address1\"]");
	By apartment=By.xpath("//*[@id=\"TextField3\"]");
	By city=By.xpath("//*[@id=\"TextField4\"]");
	By state=By.xpath("//*[@id=\"Select1\"]");
	By stOption=By.xpath("//*[@id=\"Select1\"]/option[18]");
	By pin=By.xpath("//*[@id=\"TextField5\"]");
	By phn=By.xpath("//*[@id=\"TextField6\"]");
	
	public JustWatchesCheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checkout(String email,String fn,String ln,String addr,String ap,String ci,String pi,String ph)
	{
		driver.findElement(chEmail).sendKeys(fn);
		driver.findElement(fname).sendKeys(fn);
		driver.findElement(lname).sendKeys(ln);
		driver.findElement(address).sendKeys(addr);
		driver.findElement(apartment).sendKeys(ap);
		driver.findElement(city).sendKeys(ci);
		driver.findElement(state).click();
		driver.findElement(stOption).click();
		driver.findElement(pin).sendKeys(pi);
		driver.findElement(phn).sendKeys(ph);
	}
	
	
	
}
