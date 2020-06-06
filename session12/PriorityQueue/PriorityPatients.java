package org.session12.PriorityQueue;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityPatients {
	public static void main(String[] args) {
		Queue<Patients> patient = new PriorityQueue<>(new PatientComparator() );
		
		patient.add(new Patients(1,"sai",false));
		patient.add(new Patients(2, "chandu", true));
		patient.add(new Patients(3, "mounika", false));
		patient.add(new Patients(4,"abhi",false));
		patient.add(new Patients(5, "pinky", false));
		/*
		 * System.out.println(); System.out.println("Doctor waiting for patients :");
		 * System.out.println(patient);
		 */
		
		/*
		 * while(!patient.isEmpty()) {
		 * 
		 * System.out.println(patient.poll().getName());
		 * 
		 * } System.out.println(patient);
		 */

}
}
