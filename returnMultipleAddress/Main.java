package org.returnMultipleAddress;

public class Main {
    
	public static void main(String[] args) {
		Student sai=new Student();
		Address[] saiaddress=new Address[2];
		saiaddress[0]=new Address();
		saiaddress[0].setCity("dayton");
		saiaddress[0].setCountry("USA");
		saiaddress[0].setState("ohio");
		saiaddress[0].setType("Primary");
		
		saiaddress[1]=new Address();
		saiaddress[1].setCity("Kentucky");
		saiaddress[1].setCountry("USA");
		saiaddress[1].setState("Frankfort");
		saiaddress[1].setType("Secondary");
		
		sai.setAddress(saiaddress);
		Address[] ad=sai.getAddress();
		for(int i=0;i<ad.length;i++ )
		{
			Address ad2=saiaddress[i];
			if(ad2.getType().equals("Secondary"))
			{
				/*System.out.println(ad2.getCity());
				System.out.println(ad2.getCountry());
				System.out.println(ad2.getState());*/
				System.out.println(ad2.getCompleteAddress());
			}
				
				
			
		}
		
		
		
		
		
		
		
		
	}

}
