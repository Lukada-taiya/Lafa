package bucky;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileCreate {

	File x;
	Formatter t;
	Scanner scan;
	
	public FileCreate() {
		 x = new File("pete.txt");
		 
		 if(x.exists())
		      return;
		 else {
			 try {
				 t = new Formatter(x.getPath());
				  
			 }catch(Exception e) {
				 System.out.println("Error!!");
			 }
		 }
			 
	 }
	
	public void openFile() {
		try {
			scan = new Scanner(new File(x.getPath()));
			
		}catch(Exception e) {
		    System.out.println("File not Found!");
	 	}
	
	}
	
	public void readFile() {
		while(scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			String c = scan.next();
			
			System.out.printf("%s %s %s\n", a, b , c);
		}
 	
	}
	
	public void closeFile() {
		scan.close();
	}
			 
		 
	}
	
	

