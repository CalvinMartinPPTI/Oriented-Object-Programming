package people;

import java.util.ArrayList;

public class Patient {
	private int id;
	private String name;
	private int age;
	private int totalSpent = 0;
	private ArrayList<String> medicalRecords = new ArrayList<String>();
	
	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalSpent() {
		return totalSpent;
	}
	public void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}
	public ArrayList<String> getMedicalRecords() {
		return medicalRecords;
	}
	public void setMedicalRecords(ArrayList<String> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public void addMedicalRecord(String record) {
        medicalRecords.add(record);
    }
	
}
