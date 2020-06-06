package org.session12.PriorityQueue;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patients> {

	@Override
	public int compare(Patients patient1, Patients patient2) {
		System.out.println("Patient 1:" + patient1.getName());
		System.out.println("Patient 2:" + patient2.getName());
		return (patient1.isEmergencycase() == patient2.isEmergencycase())
				? (Integer.valueOf(patient1.getId()).compareTo(Integer.valueOf(patient2.getId())))
				: (patient1.isEmergencycase() ? -1 : 1);

	}

}
