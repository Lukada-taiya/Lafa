package bucky;

public class Generick {

	public static void main(String[] args) {
		
      //gen();
     System.out.println( "Max: " + max('a', 'x', 'c'));
	}
	
	private static void gen() {
         String[] me = {"my", "life", "my", "choice"};
		 
		 Character[] you = { 'y', 'o', 'u', 'r'};
		 
		 printMe(me);
		 printMe(you);
		 //In the above case, it is seen that the same method accepts two different type of parameters. 
	}
	
	//Overloading a method
	/*private static void printMe(String[] h) {
		for(String c: h)
			System.out.printf("%s ", c);
		System.out.println();
	}
	
	private static void printMe(char[] h) {
		for(char c: h)
			System.out.printf("%s ", c);
		System.out.println();
	}*/
	
	//With overloading a method, a lot of problems is associated with it. So building a generic method is advisable
	private static <T> void printMe(T[] s) {
		for(T c: s)
			System.out.printf("%s ", c);
		System.out.println();
	}
	
	//Creating a generic method with a return type. this method will find the max of three datatypes
	private static <T extends Comparable> T max(T a, T b, T c) {
		//the comparable class allows two datatypes to be compared
		T max = a;
		
		// the .compareTo() gives u a +1 if b>a, -1 if b<a, and 0 if equal
		if(b.compareTo(a) > 0) 
			max = b;
		
		
		if(c.compareTo(max) > 0)
			max = c;
			
		return max;
 
	}
	

	
	
	
	
	
	
}
