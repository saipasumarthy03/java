package org.session9.Enum;

import org.session5.staticdemo.main;

public class AstronomerMain {
	public static void main(String[] args) {
		Astronomer sai=new Astronomer();
		sai.setName("Sai");
		sai.setState("Ohio");
		sai.setPlanet(Planets.EARTH);
		System.out.println(sai.getPlanet());
		System.out.println(sai.getPlanet().getNumber());
		System.out.println(sai.getPlanet().isLiveable());
	
		
	}

	
}
