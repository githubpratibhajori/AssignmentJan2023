import java.io.IOException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.TestCase;

public class Validatetexts extends TestCase {
	
	ReadFileforRegex rF;	
    
	//SearchPlainText searchPlainText;
	  
	  @Test(priority=1)
		public void validateStraightTextMatch() throws InterruptedException, IOException {
		     
		    
		    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
			System.out.println("Enter text to search:");
			String expTextMatch= sc.nextLine(); 
			String aclTextMatch = SearchPlainText.getActualTexttDetails(expTextMatch);
			System.out.println("Actual Text: " + aclTextMatch);
			Assert.assertEquals(aclTextMatch, expTextMatch);
			
		}
	  
	 @BeforeMethod
	public void createdata() {
				System.out.println("Reading File data");
				rF = new ReadFileforRegex();
   }

		
	
	

}
