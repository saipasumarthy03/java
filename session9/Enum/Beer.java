package org.session9.Enum;

public enum Beer {
	KF(100),RC(80),KO(75),RB;
	int price;
	
	 Beer(int price) {
		 this.price=price;
		
	}
	 Beer()
	 {
		 this.price=60;
	 }
	 public int getPrice()
	 {
		 return price;
	 }

}
