package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.JustWatchesPage;

public class JustWatchesRegTest extends BaseClass {
	
	@Test()
	public void Registration()
	{
	
	JustWatchesPage ob1=new JustWatchesPage(driver);
	ob1.register();
	ob1.accountCreation("Anuradha","Abi","anuradha123@gmail.com","anu23");
	}

}
