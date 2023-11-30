package testpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.BaseClass;

public class JustWatchesBrokenLinkCheckTest extends BaseClass {
	
	@Test
	public void test1()
	{
	  List<WebElement> li=driver.findElements(By.tagName("a"));
	  System.out.println("No of links in justwatches="+li.size()); //No of links in FB
	  for(WebElement links:li)
	  {   
		  String link=links.getAttribute("href");
		  verifyLink(link);
		  
	  }

    }
	private void verifyLink(String link) {   //method creation of above
		try
		{
			URL u=new URL(link); //links is the constructor
			HttpURLConnection con=(HttpURLConnection)u.openConnection();    //HttpURLConnection is the subclass of URL
			con.connect();
			if(con.getResponseCode()==	200)
			{
				System.out.println("200 valid-"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("404 responsecode-"+link);
			}
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		

}
