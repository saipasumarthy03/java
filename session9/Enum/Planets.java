package org.session9.Enum;

public enum Planets {
	MERCURY(false,1),
	VENUS(false,2),
	EARTH(true,3),
	MARS(false,4),
	JUPITER(false,5);
	
	private boolean liveable;
	private int number;
	
	public boolean isLiveable() {
		return liveable;
	}

	public void setLiveable(boolean liveable) {
		this.liveable = liveable;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	Planets(boolean liveable,int number)
	{
		this.liveable=liveable;
		this.number=number;
	}
	
	
	
	

	

}
