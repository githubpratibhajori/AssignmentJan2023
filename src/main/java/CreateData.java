// Import the File class
// Import the IOException class to handle errors
//import static org.mockito.Mockito.when;

import java.io.*;
import java.util.Collections;
import java.util.Random;


public class CreateData {
  public static void main(String[] args) {
    try {
      File myObj = new File("Test File Finance.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
        insertdata(myObj); 
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  private static void insertdata(File file) {
	// TODO Auto-generated method stub
	  
	  int lines=55;
	  int count=0;
	  int headers=2;
	    
			  
	  //long count=0;
      try{
         //PrintWriter writer = new PrintWriter(file, "UTF-8");
          BufferedWriter writer=new BufferedWriter(new FileWriter(file));
         // Random random = new Random();
          
         for(int i = 0; i < 605; i++)
          {           
        	  
        	 if (count % lines == 0 ) {
        		 //header
        		 writer.write(String.join("",Collections.nCopies(80, "=")));
                 writer.write('\n');
                 
                 String name = "Sample Company";
                 int spaces = 80 - name.length();
                 writer.write(String.join("",Collections.nCopies(spaces," ")) + name);
                 writer.write('\n');
                 
                 count=count+lines;
        	 }
        	 writer.write("Line"+ (i+1)+ "");
        	 count++;
        	 
        	 if (i == 40){
        	 
        		 writer.write("testing");
        	     continue;
        	 }
        	 
        	 for (int x=1;x<2;x++)
             {  
           	  for (int j=0;j<3;j++)
           	     {
                     writer.write("Finance . \n ", 1, 2);
                     writer.write("  ");  
           	      }
           	  
           	    writer.write("finance abcde 223565468 , 354364574,rgyeahjtnsgdcv");
           	    writer.write("Finance . ");
           	    count++;
              }
        	 
        	// writer.write("testing");
        	// writer.write("testing.", 1, 2);
        
             writer.write("\n");
        	
        	 
             //footer
        	 if(count % lines == 0) {
        	
        		 writer.write(String.join("",Collections.nCopies(65,"-")));
        		 writer.write('\n');
                 
        		 
        		 String name = "Sample Company";
                 int spaces = 80 - name.length();
                 writer.write(String.join("",Collections.nCopies(spaces," ")) + name);
                 writer.write('\n');
        		 
        		 
        		 String page = "Page";
        		 int space_Page=(80/2)-page.length();
        		 int pageNumber= i/55;
                 writer.write(String.join("",Collections.nCopies(space_Page," ")) + page + pageNumber );
        		 
                 writer.write('\n');
                 writer.write("Sample Company");
                 writer.write('\n');
        	 }
        	 
        	 
          }
          writer.close();
      } catch (IOException e) {
         // do something
      }

      System.out.println(count);

  }

private static String Str(int i) {
	// TODO Auto-generated method stub
	return null;
}
 }


  
  
  


