package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Display
 * 05/04/2016
 * 
 * This class is used to show the table when 
 * the application starts. It also gets updated 
 * accordingly when either a patient is added
 * or deleted 
 *
 */
import java.time.LocalDate;
import java.time.LocalTime;

import finalProject.healthCareHospital.Patient;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Display {

	@SuppressWarnings("unchecked")
	public static void display(BorderPane bPane) {
		

		TableView<Patient> table= new TableView<Patient>();
		table.setVisible(true);
		table.setEditable(true);
		
		//FirstName Column
		TableColumn<Patient, String> firstName = new TableColumn<Patient, String>("first Name");
		firstName.setCellValueFactory(new PropertyValueFactory<Patient, String>("FirstName"));
 
		
		//LastName Column
		TableColumn<Patient, String> lastName = new TableColumn<Patient,String>("Last Name");
		lastName.setCellValueFactory(new PropertyValueFactory<Patient, String>("lastName"));
		
		//TableColumn id = new TableColumn("Id");
		TableColumn<Patient, String> email = new TableColumn<Patient,String>("Email");
		email.setCellValueFactory(new PropertyValueFactory<Patient, String>("email"));
		
		//ID Column
		TableColumn <Patient, String> id = new TableColumn<Patient, String>("ID");
		id.setCellValueFactory(new PropertyValueFactory<Patient,String>("ID"));
		
		// Social Security column
		TableColumn<Patient, String> ssn = new TableColumn<Patient,String>("Social Security");
		ssn.setCellValueFactory(new PropertyValueFactory<Patient, String>("SSN"));
			
		
		//Birthday Column
		TableColumn<Patient, LocalDate> dob = new TableColumn<Patient,LocalDate>("Birth date");
		dob.setCellValueFactory(new PropertyValueFactory<Patient, LocalDate>("Birthdate"));
		
 		
		//Address column
		TableColumn<Patient,String> Address = new TableColumn<Patient, String>("Address");
		Address.setCellValueFactory(new PropertyValueFactory<Patient, String>("Address"));
		
		//Apartnment no
		TableColumn<Patient,String> aptNo = new TableColumn<Patient, String>("Apt#");
		aptNo.setCellValueFactory(new PropertyValueFactory<Patient, String>("aptNo"));
		
		//City		
		TableColumn<Patient,String> city = new TableColumn<Patient, String>("City");
		city.setCellValueFactory(new PropertyValueFactory<Patient, String>("city"));
		
		//State		
		TableColumn<Patient,String> state = new TableColumn<Patient, String>("State");
		state.setCellValueFactory(new PropertyValueFactory<Patient, String>("state"));
		
		
		//Zipcode
		TableColumn<Patient,String> zipCode = new TableColumn<Patient, String>("ZIP");
		zipCode.setCellValueFactory(new PropertyValueFactory<Patient, String>("zipCode"));
			
		
		//Martial Status		
		TableColumn<Patient,String> maritalStatus = new TableColumn<Patient, String>("Marital Status");
		maritalStatus.setCellValueFactory(new PropertyValueFactory<Patient, String>("maritalStatus"));
		
		//Employment Status		
		TableColumn<Patient,String> employmentStatus = new TableColumn<Patient, String>("Employment");
		employmentStatus.setCellValueFactory(new PropertyValueFactory<Patient, String>("employmentStatus"));
		
		//Employer		
		TableColumn<Patient,String> employer = new TableColumn<Patient, String>("Employer");
		employer.setCellValueFactory(new PropertyValueFactory<Patient, String>("employer"));
		
		//Emergency Contact
		TableColumn<Patient,String> emergencyContact = new TableColumn<Patient, String>("Emergency Contact");
		emergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, String>("emergencyContact"));
					
		//Emergency Contact Address 		
		TableColumn<Patient,String> addressEmergencyContact = new TableColumn<Patient, String>("Contact Address ");
		addressEmergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, String>("addressEmergencyContact"));
		
		// Emergency contact Relation to Patient
		TableColumn<Patient,String> relatedEmergencyContact = new TableColumn<Patient, String>("Relation to Patient");
		relatedEmergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, String>("relatedEmergencyContact"));
				
		// Emergency Contact Phone number
		TableColumn<Patient,Integer> phoneNoEmergencyContact = new TableColumn<Patient, Integer>("Phone#");
		phoneNoEmergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("phoneNoEmergencyContact"));
				
		//Primary Insurance name
		TableColumn<Patient,String> primaryInsurance = new TableColumn<Patient, String>("Primary Insurance");
		primaryInsurance.setCellValueFactory(new PropertyValueFactory<Patient, String>("primaryInsurance"));
				
		//Primary Insurance Policy No
		TableColumn<Patient,String> primaryInsuranceNo = new TableColumn<Patient, String>("Primary Insurance Policy #");
		primaryInsuranceNo.setCellValueFactory(new PropertyValueFactory<Patient, String>("primaryInsurance"));
		
		// Patient Type column
        TableColumn<Patient,String> PatienttypeCol = new TableColumn<Patient,String>("Emergency Type");
        PatienttypeCol.setMinWidth(50);
        PatienttypeCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("PatientType"));
	
	
				
		table.getColumns().addAll(firstName,lastName,dob,email,id,ssn,dob,Address,aptNo,city,
				state,zipCode,maritalStatus,employmentStatus,employer,emergencyContact,addressEmergencyContact,
				relatedEmergencyContact,phoneNoEmergencyContact,primaryInsurance,primaryInsuranceNo,PatienttypeCol);
		VBox addVbox = new VBox();
		addVbox.setPadding(new Insets(20,20,20,20));
		addVbox.setSpacing(10);
		
		// set the table to the bpane
		bPane.setCenter(addVbox);
		addVbox.getChildren().addAll(table);
		
				
	}

}
