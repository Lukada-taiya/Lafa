package bucky;

public class learn {
	
	
	private static int isAtm = 0;
	
	public static void main(String[] args) {
		
		/*This code tests where the customer is withdrawing from
		 * if(isAtm == 0) { System.out.println("You are going to withdraw from an atm");
		 * }else if(isAtm == 1) {
		 * System.out.println("You are withdrawing from the bank"); }else {
		 * System.out.println("You are withdrawing from an agent"); }
		 */
		
		
		/*
		 * switch(isAtm) { case 0:
		 * System.out.println("You are going to withdraw from an atm"); break;
		 * 
		 * case 1: System.out.println("You are withdrawing from the bank"); break;
		 * 
		 * case 2: System.out.println("You are withdrawing from an agent"); break;
		 * 
		 * }
		 */
		
		int marks = 49;
		
		marks = marks + 1;
		marks *= 2;
		
		boolean rain = true;
				//"It is raining";
		boolean sun;
		//"It is shining";
	    boolean tired = false;
		//"I am tired";
		//boolean notTired = true;
		//"I am not tired";
		
		if(rain && tired) {
			System.out.println("Read a book");
		}else if(rain && tired){
			System.out.println("I will sleep");
		}else if(rain || !tired) {
			System.out.println("Watch television");
		}
		
		
			
	}

}
