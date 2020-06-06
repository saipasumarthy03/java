package org.session13.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("employee.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Employee e= (Employee) oi.readObject();
			System.out.println(e);
			Employee e1=(Employee) oi.readObject();
			System.out.println(e1);	
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
