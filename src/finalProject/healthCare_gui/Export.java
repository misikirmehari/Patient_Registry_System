package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Export
 * 05/04/2016
 * 
 *This class reads the List from a table and saves it to an output 
 *csv file 
 *
 */
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import finalProject.healthCareHospital.Patient;
import javafx.collections.ObservableList;

public class Export{

public static void writeExcel(ObservableList<Patient> data) throws Exception {
    Writer writer = null;
    try {
        File file = new File("C:/Users/Misikir/Documents/HealthCare/src/Data.csv");
        writer = new BufferedWriter (new FileWriter(file));
       
		for (Patient person : data) {

            String text = person.getFirstName() + "," + person.getLastName() + "," + person.getEmail() + "," 
            		+ person.getAddress()+ "," + person.getAptNo()+ ","+ person.getCity()+ "," + person.getState()
            		+ ","+person.getZipCode()+ ","+person.getMaritalStatus()+ ","+person.getEmployementStatus()+ ","+
            		person.getEmployer()+ ","+person.getAddressEmergencyContact()+ ","+person.getAddressEmergencyContact()
            		+ ","+person.getRelatedEmercgenyContact()+ ","+person.getPhoneNoEmergencyContact()+ ","+person.getPrimaryInsurance()
            		+ ","+person.getPrimaryInsuranceNo()+ ","+person.getPatientType()+ "," +person.getVisitReason()+"\n";



            writer.write(text);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        System.out.println("Something went worng");
    }
    finally {

        writer.flush();
         writer.close();
    } 
}
}