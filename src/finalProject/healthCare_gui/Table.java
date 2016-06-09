package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Table
 * 05/04/2016
 * 
 * This class implements the API Tableview to populate the 
 * Table
 *
 */
import java.time.LocalDate;


import finalProject.healthCareHospital.Patient;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
 
public class Table  {
 
     static final ObservableList<Patient> data =
    FXCollections.observableArrayList( 
    		 new Patient("Misikir", "Mehari", "mskrmr84@gmail.com","12345","324-232-2342",null,
 			        "1234 South Home Street","325","Denver","Colorado", "80012", "Single","Employed","ABC Inc.",
 			        "James Brown","Denver","Uncle","7203464358","Aetna","W8545645","Non Emergency","General Checkup"),
 		   new Patient("John", "Benjamin", "benjamin@gmail.com","45678","342-234-2342",null,
			        "13244 South eliat Street","A567","Denver","Colorado", "82134", "Married","Employed","DEF Inc.",
			        "Michele Benjamin","Denver","Sister","7206780358","BlueJ","A8435645","Emergency","Heart Attack"),
 		   new Patient("Joseph", "Bugati", "Joe@gmail.com","45645","904-232-2342",null,
			        "1234 North Home Street","621","Austin","Texas", "34672", "Single","Non Employed","N/A",
			        "Katherine","Denver","Step Sister","7203464358","Sigma","Z5645","Emergency","Car Accident"),
 		   new Patient("Timothy", "Mcgee", "Mcgee@gmail.com","46745","002-212-2342",null,
			        "123 South New York Ave","821","New York city","New Yor", "37692", "Single","Employed","xzy Inc.",
			        "Cinthia Bob","Denver","Ex-Wife","7203464358","Aetna","WE545645","Non Emergency","General Checkup")  		   
);
 
    
    @SuppressWarnings("unchecked")
	public static BorderPane display(ObservableList<Patient> data,BorderPane bPane) {
        TableView<Patient> table = new TableView<Patient>();

        final Label label = new Label("Patient Information Table");
        label.setFont(new Font("Arial", 18));
 
        table.setEditable(true);
 
        TableColumn<Patient, String> firstNameCol = new TableColumn<Patient,String>("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Patient, String>("firstName"));
 
        TableColumn<Patient,String> lastNameCol = new TableColumn<Patient,String>("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Patient, String>("lastName"));
 
        TableColumn <Patient,String>emailCol = new TableColumn<Patient,String>("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Patient, String>("email"));
        
        // Patient ID
        TableColumn<Patient,String> idCol = new TableColumn<Patient,String>("Patient ID");
        idCol.setMinWidth(50);
        idCol.setCellValueFactory(
                new PropertyValueFactory<Patient, String>("ID"));
        
             
     // Social Security column
        TableColumn<Patient,String> ssnCol = new TableColumn<Patient,String>("Social Security #");
        ssnCol.setMinWidth(50);
        ssnCol.setCellValueFactory(
                new PropertyValueFactory<Patient, String>("SSN"));
        
    	
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
		
                
        // Birthday Column
        TableColumn<Patient,LocalDate> bdCol = new TableColumn<Patient,LocalDate>("Birthdate");
        bdCol.setMinWidth(100);
        bdCol.setCellValueFactory(
                new PropertyValueFactory<Patient, LocalDate>("Birthdate"));
        
      //Employment Status		
      	TableColumn<Patient,String> employmentStatus = new TableColumn<Patient, String>("Employment");
      	employmentStatus.setCellValueFactory(new PropertyValueFactory<Patient, String>("employementStatus"));
      		
      //Employer		
      	TableColumn<Patient,String> employer = new TableColumn<Patient, String>("Employer");
      	employer.setMinWidth(100);
      	employer.setCellValueFactory(new PropertyValueFactory<Patient, String>("employer"));
      		
      	//Emergency Contact
      	TableColumn<Patient,String> emergencyContact = new TableColumn<Patient, String>("Emergency Contact");
      	emergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, String>("emergencyContact"));
      				
      	//Emergency Contact Address 		
      	TableColumn<Patient,String> addressEmergencyContact = new TableColumn<Patient, String>("Contact Address ");
      	addressEmergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, String>("addressEmergencyContact"));
      	
      	// Emergency contact Relation to Patient
      	TableColumn<Patient,String> relatedEmergencyContact = new TableColumn<Patient, String>("Relation to Patient");
      	relatedEmergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, String>("relatedEmercgenyContact"));
      				
      	// Emergency Contact Phone number
      	TableColumn<Patient,Integer> phoneNoEmergencyContact = new TableColumn<Patient, Integer>("Phone#");
      	phoneNoEmergencyContact.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("phoneNoEmergencyContact"));
      				
      	//Primary Insurance name
      	TableColumn<Patient,String> primaryInsurance = new TableColumn<Patient, String>("Primary Insurance");
      	primaryInsurance.setCellValueFactory(new PropertyValueFactory<Patient, String>("primaryInsurance"));
    		
    	//Primary Insurance Policy No
    	TableColumn<Patient,String> primaryInsuranceNo = new TableColumn<Patient, String>("Primary Insurance Policy #");
    	primaryInsuranceNo.setCellValueFactory(new PropertyValueFactory<Patient, String>("primaryInsuranceNo"));
    	primaryInsuranceNo.setMinWidth(100);
    		
    	// Patient Type column
           TableColumn<Patient,String> PatienttypeCol = new TableColumn<Patient,String>("Emergency Type");
           PatienttypeCol.setMinWidth(50);
           PatienttypeCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("PatientType"));
    	
 
 
        table.setItems(data);
        table.getColumns().addAll(firstNameCol,lastNameCol,bdCol,emailCol,idCol,ssnCol,Address,aptNo,city,
				state,zipCode,maritalStatus,employmentStatus,employer,emergencyContact,addressEmergencyContact,
				relatedEmergencyContact,phoneNoEmergencyContact,primaryInsurance,primaryInsuranceNo,PatienttypeCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
        bPane.setCenter(vbox);
        
       // ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        //stage.setScene(scene);
        //stage.show();
		return bPane;
    }
}
 /*
    public static class Patient {
 
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;
 
        private Patient(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }
 
        public String getFirstName() {
            return firstName.get();
        }
 
        public void setFirstName(String fName) {
            firstName.set(fName);
        }
 
        public String getLastName() {
            return lastName.get();
        }
 
        public void setLastName(String fName) {
            lastName.set(fName);
        }
 
        public String getEmail() {
            return email.get();
        }
 
        public void setEmail(String fName) {
            email.set(fName);
        }
    }
}
*/