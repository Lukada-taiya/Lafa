package toStringDemo;

public class Frog {
    private String name;
    Froglet birthday;
	
    public Frog(String name, Froglet birthday) {
    	this.name = name;
    	this.birthday = birthday;
    	
    	System.out.printf("Congrats!! %s, your birthday is %s", name, birthday);
    }
	
	
	
	
}
