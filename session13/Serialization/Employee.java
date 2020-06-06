package org.session13.Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class Employee implements Externalizable {
	private int id;
	private String name;
	private int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String) in.readObject();
		id=in.readInt();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	

}
