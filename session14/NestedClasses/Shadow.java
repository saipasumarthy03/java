package org.session14.NestedClasses;

public class Shadow {
	int x=20;
	public class FirstLevel{
		int x=30;
		void show(int x) {
		System.out.println("value of x which is of local variable is :"+x);
		System.out.println("value of x which is of inner class :"+this.x);
		System.out.println("value of x which is of outer clas :"+Shadow.this.x);
	}
	
	}
	
	public static void main(String[] args) {
		Shadow s=new Shadow();
		System.out.println(s.x);
		Shadow.FirstLevel fl=s.new FirstLevel();
		fl.show(50);
	}
}
