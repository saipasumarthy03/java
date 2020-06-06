package org.session8.upcasting;

public  class Electronics {
	private String companyName;
	private int size;
	private int cost;
	private int modelno;

	public void turnOn() {
		System.out.println("About to start");
	}

	public void turnOff() {
		System.out.println("About to turnoff");
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	@Override
	public String toString() {
		return "Electronics [companyName=" + companyName + ", size=" + size + ", cost=" + cost + ", modelno=" + modelno
				+ "]";
	}

}
