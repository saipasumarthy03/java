package org.session8.abstractclass;

public class Cat extends Animal {
	String b;

	public Cat(String name,int age, String b) {
		super(name, age);
		this.b=b;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("cat is eating ");
		
		
		
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Cat [b=" + b + "]";
	}
	

}
