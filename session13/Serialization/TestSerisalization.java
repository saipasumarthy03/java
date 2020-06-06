package org.session13.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerisalization {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Sai");
		e.setNumber(93873737);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("maruthi");
		e1.setNumber(938737377);
		try {
			FileOutputStream fo=new FileOutputStream("employee.txt");
			ObjectOutputStream oo =new ObjectOutputStream(fo);
			oo.writeObject(e);
			oo.writeObject(e1);
			oo.close();
			fo.close();
			}catch(Exception ee)
		{
				System.out.println(ee);
		}
		
	}

}
