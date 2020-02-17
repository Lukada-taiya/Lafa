package bucky;

public class retail_shop2 {

	public static void main(String[] args) {
		int itema=200, itemb=75, itemc=500;
        double price;
	   price=(itema*2)+(itemb)+(itemc*3);
        price=price-(.1*price);
      price=price+(.05*price);
      System.out.println(price);  
	}
	
}