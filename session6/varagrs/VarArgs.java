package org.session6.varagrs;

public class VarArgs {
	public static int sum(int x, int y)
	{
		return x+y;
	}
	public static int sum(int...numbers)
	{
		int sum=0;
	 for(int i=0; i<=numbers.length;i++)
		{
			sum=sum+i;
			System.out.println(sum);
		}
		return sum;
	}
	public static int sum(String y,int...numbers)
	{
		int sum=0;
		 for(int i=0; i<=numbers.length;i++)
			{
				sum=sum+i;
				System.out.println(sum);
			}
			return sum;
	}
public static void main(String[] args) {
	
	//System.out.println(sum(1,23));
	System.out.println(sum(1,2,3,4,5,6));
	System.out.println(sum("hi",1,2,3));
	
	
}
}
