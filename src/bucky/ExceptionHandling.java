package bucky;

import java.util.Scanner;

public class ExceptionHandling {
        //How to handle errors to handle errors
	
    private Scanner in;
	private int num1, num2;
	private int x = 0;
	  
	public ExceptionHandling(){
		
		do{
		try {
		  in = new Scanner(System.in);
	      System.out.print("Enter first number: ");
	      num1 = in.nextInt();
	      
	      System.out.print("Enter second number: ");
	      num2 = in.nextInt();
	      
	      int sum = num1/num2;
	      System.out.println(sum);
	      x=1;
	    
		}catch(Exception e) {
			System.out.println("You can't do that Hoss!!");
		}
		}while(x==0);
}
}