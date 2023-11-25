package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.JustWatchesPage;

public class JustWatchesPurchaseTest extends BaseClass {
	
	@Test()
	public void Registration()
	{
		JustWatchesPage ob2=new JustWatchesPage(driver);
		ob2.menwatchClick();
	}

}
