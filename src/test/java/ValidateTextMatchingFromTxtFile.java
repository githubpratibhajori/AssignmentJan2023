import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ValidateTextMatchingFromTxtFile {
 
  ReadFileforRegex rF;	
    
//SearchPlainText searchPlainText;
  
  @Test(priority=1)
	public void validateStraightTextMatch() throws InterruptedException {
	     
	    
	    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.println("Enter text to search:");
		String expTextMatch= sc.nextLine(); 
		String aclTextMatch = SearchPlainText.getActualTexttDetails();
		System.out.println("Actual Text: " + aclTextMatch);
		Assert.assertEquals(aclTextMatch, expTextMatch);
	}

	  @BeforeMethod
		public void createdata() {
			System.out.println("Reading File data");
			rF = new ReadFileforRegex();
			
		}

	
	  

}
