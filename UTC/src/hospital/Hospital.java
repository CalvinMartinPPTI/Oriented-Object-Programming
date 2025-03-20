package hospital;

import java.util.ArrayList;

import Main.Main;
import people.Doctor;
import people.Patient;

public class Hospital {
	private String name;
	private ArrayList<Department> departments = new ArrayList<Department>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private int income = 0;
	
	public Hospital(String name) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departements) {
		this.departments = departements;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public void addDepartment(Department departments) {
		this.departments.add(departments);
		
	}

	public void processVisit(Patient patient1, Doctor doctor1, String note) {
		String record = "Visited " + doctor1.getName() + " for " + note + " (Cost: " + Main.formatIDR(doctor1.getFee()) +") ";
		patient1.addMedicalRecord(record);
		patient1.setTotalSpent(patient1.getTotalSpent()+doctor1.getFee());
		income += doctor1.getFee();
	}

	public void registerPatient(Patient patient1) {
		this.patients.add(patient1);
	}

	public void displayHospitalInfo() {
		System.out.println("Hospital: " + name);
		
		System.out.println("\nDepartements: ");
			
			for (Department department : departments) {
				System.out.println("- " + department.getName() + " (Head Doctor: " + department.getHeadDoctor() + ")"); 
			}
			
			System.out.println("\nDoctors: ");
			for (Department department : departments) {
				System.out.println("- " + department.getHeadDoctor().getName() + " (Head Doctor: " + department.getHeadDoctor().getSpeciality() + ", Fee: " + Main.formatIDR(department.getHeadDoctor().getFee()) + ")"); 
					System.out.println("  Patients: ");
					for(Patient p : department.getHeadDoctor().getPatients()){
						System.out.println("   -" + p.getName() + "(Age: " + p.getAge() + ")");
				}
			}
			System.out.println("\nPatients: ");
			for (Patient p : patients) {
				System.out.println("  - " + p.getName() + " (ID: " + p.getId() + ", Age: " + p.getAge() + ")");
				System.out.println("   Medical Records: ");
				for (String s : p.getMedicalRecords()) {
					System.out.println("    - " + s);
				}
				System.out.println("   Total Spent: " + Main.formatIDR(p.getTotalSpent()));
				System.out.println("");
			}
			System.out.println("Total Hospital Income: " + Main.formatIDR(income));
			
	}
	
	
}
