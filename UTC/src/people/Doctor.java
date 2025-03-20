package people;

import java.util.ArrayList;

public class Doctor {
	private int id;
	private String name;
	private String speciality;
	private int fee;
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Doctor(int id, String name, String speciality, int fee) {
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.fee = fee;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public void addPatient(Patient patient1) {
		this.patients.add(patient1);
	}
	
	
}
