package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.JustWatchesCheckoutPage;
import pagepkg.JustWatchesPage;

public class JustWatchesCheckoutTest extends BaseClass {
	
	@Test
	public void test() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		JustWatchesPage obj=new JustWatchesPage(driver);
		obj.menwatchClick();
		
		JustWatchesCheckoutPage ob2=new JustWatchesCheckoutPage(driver);
		ob2.checkout("anu123@gmail.com","Anu","jose","Vadassery","Asset homes","chalakudy","690875","6783456273");
		
	}

}
