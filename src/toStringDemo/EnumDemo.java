package toStringDemo;

public enum EnumDemo {

	moses("BestM","24"),
	rayBa("MrRay","18"),
	darkr("Molar","34"),
	brian("Power", "15"),
	felit("Pasta", "94"),
	Gomet("Clove", "39");
	
	private final String desc;
	private final String age;
	
	EnumDemo(String descd, String aged) {
		desc = descd;
		age = aged;
	}
	
	public String getDesc() {
		return desc;
		
	}
	
	public String getAge() {
		return age;
		
	}
	
}
