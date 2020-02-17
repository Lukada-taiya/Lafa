package toStringDemo;

public class Froglet {
      private int year, month, day;
      
      
      public Froglet(int day, int month, int year) {
    	  this.day = day;
    	  this.month = month;
    	  this.year = year;
    	  // The this keyword is used to refer to the class object, in this case froglet
    	  
    	  System.out.printf("We successfully constructed a birthdate %s\n", this);
      }
      
      public String toString() {
    	  return String.format("%d/%d/%d", day, month, year);
      }
      
      //Whenever you use the this keyword or call an object where a string is expected, it automatically looks for the toString method
      //and prints it out. So the toString method is defined as the string representation of an object.
      
}
