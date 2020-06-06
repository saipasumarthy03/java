package org.session8.abstractclass;

 public abstract  class Animal {
	 String name;
	 int age;
	 
	 public Animal(String name, int age)
	 {
		this.name=name;
		this.age=age;
		
		
	 }
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	public void sleep() {

	}

	public abstract void eats();

}
