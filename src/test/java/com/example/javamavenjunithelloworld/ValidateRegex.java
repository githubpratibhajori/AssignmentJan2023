package com.example.javamavenjunithelloworld;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidateRegex {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@SuppressWarnings("resource")
	@Test
	void test() {
		String input = "'Sample Company' *";
	
        try {
        	
        /*	Path path = Paths.get("C://Users//Pratibha//Assignment//TxtFileoperations//Test File Finance.txt");
        	Scanner scanner = new Scanner(path);
            System.out.println("Read text file using Scanner");
            //read line by line
            while(scanner.hasNextLine()){
                //process each line
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            Scanner sc=new Scanner(System.in);  
            while (true) {    
                System.out.println("Enter regex pattern:");  
                Pattern pattern = Pattern.compile(sc.nextLine());    
                System.out.println("Enter text:");  
                Matcher matcher = pattern.matcher(sc.nextLine());    
                boolean found = false;    
                while (matcher.find()) {    
                    System.out.println("I found the text "+matcher.group()+" starting at index "+    
                     matcher.start()+" and ending at index "+matcher.end());    
                    found = true;    
                }    
                if(!found){    
                    System.out.println("No match found.");    
                }    
            */
            FileInputStream fstream = new FileInputStream("C:\\Users\\Pratibha\\Assignment\\TxtFileoperations\\Test File Finance.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
        
            System.out.println("Inside try");
            String strLine;
            while ((strLine = br.readLine())!= null) {
            	
                if (Pattern.matches(input, strLine)) {
                   //System.out.println("Inside if");
                    Pattern p = Pattern.compile("'(.*?)'");
                    Matcher m = p.matcher(strLine);
                    
                    while (m.find()) {
                        String b = m.group(1);
                        String c = b.toString() + ".*";
                        System.out.println(b);
                        if (Pattern.matches(c, strLine)) {
                            Pattern pat = Pattern.compile("<(.*?)>");
                            Matcher mat = pat.matcher(strLine);
                            while (mat.find()) {
                                System.out.println(m.group(1));
                                System.out.println("printing group 1");

                            }
                        } else {
                            System.out.println("Not found");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
		
	}

	}


