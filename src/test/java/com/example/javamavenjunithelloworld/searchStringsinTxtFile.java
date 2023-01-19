package com.example.javamavenjunithelloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class searchStringsinTxtFile {
	@Test
	public void test() throws IOException {
	
		      File f1=new File("C://Users//Pratibha//Assignment//TxtFileoperations//Test File Finance.txt");
		      	
		      String[] words=null;  
		      FileReader fr = new FileReader(f1);  
		      BufferedReader br = new BufferedReader(fr); 
		      String s,actualWord=null;     
		      String expText="finance";   
		      int count=0;   
		      while((s=br.readLine())!=null)   
		      {
		         words=s.split(" "); 
		          for (String word : words) 
		          {
		                 if (word.equals(expText))   
		                 {
		                   count++;    
		                 }
		          }
		      }
		      assertEquals(expText,actualWord);
		      if(count!=0)  
		      {
		         System.out.println("The given word is present for "+ count+ " Times in the file");
		      }
		      else
		      {
		         System.out.println("The given word is not present in the file");
		      }
		      
		         fr.close();
		   }	
	}


