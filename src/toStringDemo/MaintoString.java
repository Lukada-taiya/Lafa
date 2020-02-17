package toStringDemo;
import java.util.EnumSet;

public class MaintoString {

	public static void main(String[] args) {
		// Froglet frog = new Froglet(3,5, 3);
         //Frog froglet = new Frog("Greg",frog);
         
        for(EnumDemo yh: EnumDemo.values())
        	System.out.printf("%s\t%s\t%s\n", yh, yh.getDesc(), yh.getAge());
         
	
	System.out.println("\nThis the demo for range\n");
	//Finding the range in an enum. EnumSet must be imported
	
	for(EnumDemo yh: EnumSet.range(EnumDemo.rayBa, EnumDemo.felit)) 
		System.out.printf("%s\t%s\t%s\n", yh, yh.getDesc(), yh.getAge());
	
	}

}
