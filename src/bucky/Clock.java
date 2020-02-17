package bucky;

public class Clock {
//This class is ran in String.java
	private static int hour;
	private static int second;
	private static int minute;
	
	
	
    public Clock() {
		
	    this(0,0,0);
	}
	
	public Clock(int h) {
		  this(h,0,0);
	}
	
	public Clock(int h, int m) {
	  this(h,m, 0);
	}
	
	public Clock(int h, int m, int s) {
		setTime(h, m , s);
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
		  
		hour =((h>=0 && h>23)?h:0);
	}
	
	public void setMinute(int m) {
	 
		minute =((m>=0 && m>60)?m:0);
	}
	
	public void setSecond(int s) {
	 
		second =((s>=0 && s>60)?s:0);
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
	
	
	
	
}
