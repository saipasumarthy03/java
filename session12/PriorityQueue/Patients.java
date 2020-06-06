package org.session12.PriorityQueue;

public class Patients {
	private int id;
	private String name;
	private boolean emergencycase;
	public Patients(int id,String name,boolean emergencycase)
	{
		this.id=id;
		this.name=name;
		this.emergencycase=emergencycase;
	}
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
	public boolean isEmergencycase() {
		return emergencycase;
	}
	public void setEmergencycase(boolean emergencycase) {
		this.emergencycase = emergencycase;
	}
	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", emergencycase=" + emergencycase + "]";
	}
	
	
	

}
