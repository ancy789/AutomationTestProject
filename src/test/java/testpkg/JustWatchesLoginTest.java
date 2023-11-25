package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import Utilitypkg.LoginUtility;
import basepkg.BaseClass;
import pagepkg.JustWatchesPage;


public class JustWatchesLoginTest extends BaseClass{
	
	
	@Test()
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		JustWatchesPage ob=new JustWatchesPage(driver);
		ob.register();
		
		String xl="C:\\Users\\HP\\OneDrive\\Documents\\Project_watches.xlsx";
		String sheet="sheet1";
		int rowcount=LoginUtility.getRowCount(xl,sheet);
		System.out.println("Rowcount= "+rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String email=LoginUtility.getCellValue(xl,sheet,i,0);
			System.out.println("Email- "+email);
			String password=LoginUtility.getCellValue(xl,sheet,i,1);
			System.out.println("password- "+password);
			
		    ob.loginvalue(email,password);
		    ob.signinClick();
		    driver.navigate().refresh();
		}    
		
		
	}

	
	

}
