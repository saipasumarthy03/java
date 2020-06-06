package org.sessionTest;

public class Month {
	private int month;
	private int max_no_days;
	private String nameOftheMonth;
	
	Month(int month,int max_no_days,String nameOftheMonth )
	{
		this.month=month;
		this.max_no_days=max_no_days;
		this.nameOftheMonth=nameOftheMonth;
	}

	public String getnameOftheMonth() {
		return nameOftheMonth;
	}

	public int getMonth() {
		return month;
	}

	public int getMax_no_days() {
		return max_no_days;
	}

}
