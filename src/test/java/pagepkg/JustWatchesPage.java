package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JustWatchesPage {
	WebDriver driver;
	
	By loginReg=By.xpath("//*[@id=\"topbar\"]/div/div[3]/div/ul/li[2]/a");//Login or Register link
	By createAccount=By.xpath("//*[@id=\"login-form\"]/div/a");
	By fname=By.xpath("//*[@id=\"FirstName\"]");
	By lname=By.xpath("//*[@id=\"LastName\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By pswd=By.xpath("//*[@id=\"CreatePassword\"]");
	By submit=By.xpath("//*[@id=\"create_customer\"]/div[2]/input");
	
	By women=By.xpath("//*[@id=\"shopify-section-sections--16911351152888__header\"]/header/div[1]/div/div/div/nav/ul[1]/li[3]/a");
	By loginmail=By.xpath("//*[@id=\"CustomerEmail\"]");
	By loginpwd=By.xpath("//*[@id=\"CustomerPassword\"]");
	By signIn=By.xpath("//*[@id=\"customer_login\"]/input[3]");
	
	By signout=By.xpath("//*[@id=\"MainContent\"]/section/div/div[1]/a");
	
	//After sign out go for shopping 
	
	By menwatch=By.xpath("//*[@id=\"shopify-section-sections--16911351152888__header\"]/header/div[1]/div/div/div/nav/ul[1]/li[2]/a");
	By watch=By.xpath("//*[@id=\"7758144307448\"]/div/a/div/div/div[1]/img[2]");
	By add2cart=By.xpath("//*[@id=\"product_form_7758144307448\"]/div[3]/div[2]/button");
	By cart=By.xpath("//*[@id=\"shopify-section-sections--16911351152888__header\"]/header/div[2]/div/div[2]/div/img");
	By checkout=By.xpath("//*[@id=\"shopify-section-sections--16911351152888__header\"]/div[2]/div/div/div/form/div[2]/div[2]/div[2]/div[2]/div/fieldset/button");

	
	
	public JustWatchesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void register()
	{
		driver.findElement(loginReg).click();
	}
	public void accountCreation(String finame,String laname,String emailid,String pwd)
	{
		driver.findElement(createAccount).click();
		driver.findElement(fname).sendKeys(finame);
		driver.findElement(lname).sendKeys(laname);
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(pswd).sendKeys(pwd);
		driver.findElement(submit).click();	
	}
	public void womenwatchclick()
	{
		driver.findElement(women).click();
	}
	
	public void loginvalue(String loemail,String lopwd)
	{
		//driver.findElement(loginReg).click();
		driver.findElement(loginmail).sendKeys(loemail);
		driver.findElement(loginpwd).sendKeys(lopwd);
	}
	public void signinClick()
	{
		
		driver.findElement(signIn).click();
		//driver.findElement(signout).click();
		
	}
	public void menwatchClick()
	{
		driver.findElement(menwatch).click();
		driver.findElement(watch).click();
		driver.findElement(add2cart).click();
		driver.findElement(cart).click();
		driver.findElement(checkout).click();
		
	}
	


}
