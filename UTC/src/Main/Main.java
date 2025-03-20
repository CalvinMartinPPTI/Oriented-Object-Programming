package Main; 

import hospital.Hospital; 
import hospital.Department; 
import people.Doctor; 
import people.Patient; 

import java.text.NumberFormat; 
import java.util.Locale; 

public class Main { 
    public static void main(String[] args) { 

        Hospital hospital = new Hospital("City General Hospital"); 
 
        Department cardiology = new Department("Cardiology"); 
        Department neurology = new Department("Neurology"); 

        hospital.addDepartment(cardiology); 
        hospital.addDepartment(neurology); 

        Doctor doctor1 = new Doctor(101, "Dr. Smith", "Cardiology", 1500000); 
        Doctor doctor2 = new Doctor(102, "Dr. Johnson", "Neurology", 1800000); 

        cardiology.setHeadDoctor(doctor1); 
        neurology.setHeadDoctor(doctor2); 

        Patient patient1 = new Patient(201, "Alice", 30); 
        Patient patient2 = new Patient(202, "Bob", 45); 

        doctor1.addPatient(patient1); 
        doctor2.addPatient(patient2); 

        hospital.registerPatient(patient1); 
        hospital.registerPatient(patient2); 

        hospital.processVisit(patient1, doctor1, "Routine Checkup - Normal"); 
        hospital.processVisit(patient2, doctor2, "Headache and Dizziness - Prescribed Medication"); 
        hospital.processVisit(patient1, doctor1, "Follow-up Consultation"); 

        hospital.displayHospitalInfo(); 
    } 
    

    public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    } 
} 