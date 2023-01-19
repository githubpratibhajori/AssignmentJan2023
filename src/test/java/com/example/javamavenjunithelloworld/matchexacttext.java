package com.example.javamavenjunithelloworld;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class matchexacttext {

	@Test
	void test() throws IOException {
		File f1=new File("C:\\Users\\Pratibha\\Assignment\\TxtFileoperations\\Test File Finance.txt"); //Creation of File Descriptor for input file
	      String[] words=null; 
	      FileReader fr = new FileReader(f1);  
	      BufferedReader br = new BufferedReader(fr); 
	      String s,actualWord = null;     
	      String input="in";   
	      int count=0;   
	      while((s=br.readLine())!=null)   
	      {
	         words=s.split(" ");  
	          for (String word : words) 
	          {
	                 if (word.equals(input))   
	                 {
	                   count++;  
	                    actualWord=word;
	                 }
	          }
	      }
	      
	     assertEquals(input,actualWord);
         if(count!=0)  
	      {
	         System.out.println("The given word is present for "+count+ " Times in the file");
	      }
	      else
	      {
	         System.out.println("The given word is not present in the file");
	      }
	      
	         try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	}

