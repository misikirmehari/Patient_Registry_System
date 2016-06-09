package finalProject.healthCare_gui;
/**
  * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Edit
 * 05/04/2016
 * 
 * This class is used to Edit patient records and update the 
 * Table in the home page. 
 * 
 *  @param fName
	 @param lName
	 @param email
	 @param id
	 @param ssn
	 @param birthDate
	 @param Address
	 @param aptNo
	 @param city
	 @param state
	 @param zipCode
	 @param maritalStatus
	 @param employmentStatus
	 @param employer
	 @param emergencyContact
	 @param addressEmergencyContact
	 @param relatedEmergencyContact
	 @param phoneNoEmergencyContact
	 @param primaryInsurance
	 @param primaryInsuranceNo
	 @param secondaryInsurance
	 @param secondaryinsuranceNo
	 @param PatientType
 *
 */
import java.time.LocalDate;
import java.util.Random;

import finalProject.healthCareHospital.Patient;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class Edit  {
 
    private static TableView<Patient> table = new TableView<Patient>();
    
    final static HBox hb = new HBox();
 
 
    
    @SuppressWarnings("unchecked")
	public static void edit(ObservableList<Patient> data) {
    	Stage stage = new  Stage();
        Scene scene = new Scene(new Group());
     
        stage.setTitle("Edit Patient");
        stage.setWidth(1600);
        stage.setHeight(900);
 
        final Label label = new Label("Patient Information Table ");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn <Patient,String>firstNameCol = new TableColumn<Patient, String>("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
            new PropertyValueFactory<Patient, String>("firstName"));
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Patient, String>>() {
                @Override
                public void handle(CellEditEvent<Patient, String> t) {
                    ((Patient) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setFirstName(t.getNewValue());
                }
            }
        );
 
 
        TableColumn<Patient,String> lastNameCol = new TableColumn<Patient,String>("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
            new PropertyValueFactory<Patient, String>("lastName"));
        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Patient, String>>() {
                @Override
                public void handle(CellEditEvent<Patient, String> t) {
                    ((Patient) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setLastName(t.getNewValue());
                }
            }
        );
 
        TableColumn<Patient, String> emailCol = new TableColumn<Patient,String>("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
            new PropertyValueFactory<Patient, String>("email"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Patient, String>>() {
                @Override
                public void handle(CellEditEvent<Patient, String> t) {
                    ((Patient) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setEmail(t.getNewValue());
                }
            }
        );
        TableColumn<Patient, String> idCol = new TableColumn<Patient,String>("ID");
        idCol.setMinWidth(200);
        idCol.setCellValueFactory(
            new PropertyValueFactory<Patient, String>("ID"));
        idCol.setCellFactory(TextFieldTableCell.forTableColumn());
        idCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Patient, String>>() {
                @Override
                public void handle(CellEditEvent<Patient, String> t) {
                    ((Patient) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setEmail(t.getNewValue());
                }
            }
        );
        
        TableColumn<Patient, String> ssnCol = new TableColumn<Patient,String>("SSN");
       ssnCol.setEditable(false);
        ssnCol.setMinWidth(200);
        ssnCol.setCellValueFactory(
            new PropertyValueFactory<Patient, String>("SSN"));
        ssnCol.setCellFactory(TextFieldTableCell.forTableColumn());
        ssnCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Patient, String>>() {
                @Override
                public void handle(CellEditEvent<Patient, String> t) {
                    ((Patient) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setSSN(t.getNewValue());
                }
            }
        );
        
        TableColumn<Patient,LocalDate> bdCol = new TableColumn<Patient,LocalDate>("Birthdate");
         bdCol.setMinWidth(200);
        bdCol.setCellValueFactory(
                new PropertyValueFactory<Patient, LocalDate>("Birthdate"));
        

		//Address column
		TableColumn<Patient,String> Address = new TableColumn<Patient, String>("Address");
		Address.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("Address"));
	        Address.setCellFactory(TextFieldTableCell.forTableColumn());
	        Address.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setAddress(t.getNewValue());
	                }
	            }
	           );
		
		//Apartment no
		TableColumn<Patient,String> aptNo = new TableColumn<Patient, String>("Apt#");
		aptNo.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("aptNO"));
	        aptNo.setCellFactory(TextFieldTableCell.forTableColumn());
	        aptNo.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setAptNo(t.getNewValue());
	                }
	            }
	           );
		
		//City		
		TableColumn<Patient,String> city = new TableColumn<Patient, String>("City");
		city.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("city"));
	        city.setCellFactory(TextFieldTableCell.forTableColumn());
	        city.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setAptNo(t.getNewValue());
	                }
	            }
	           );
	        
		
		//State		
		TableColumn<Patient,String> state = new TableColumn<Patient, String>("State");
		state.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("state"));
	        state.setCellFactory(TextFieldTableCell.forTableColumn());
	        state.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setState(t.getNewValue());
	                }
	            }
	           );
		
		
		//Zipcode
		TableColumn<Patient,String> zipCode = new TableColumn<Patient, String>("ZIP");
		zipCode.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("zipCode"));
	        zipCode.setCellFactory(TextFieldTableCell.forTableColumn());
	        zipCode.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setAptNo(t.getNewValue());
	                }
	            }
	           );
			
		
		//Martial Status		
		TableColumn<Patient,String> maritalStatus = new TableColumn<Patient, String>("Marital Status");
		maritalStatus.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("maritalStatus"));
	        maritalStatus.setCellFactory(TextFieldTableCell.forTableColumn());
	        maritalStatus.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setMaritalStatus(t.getNewValue());
	                }
	            }
	           );
		
		//Employment Status		
		TableColumn<Patient,String> employmentStatus = new TableColumn<Patient, String>("Employment");
		employmentStatus.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("employmentStatus"));
	        employmentStatus.setCellFactory(TextFieldTableCell.forTableColumn());
	        employmentStatus.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setEmployementStatus(t.getNewValue());
	                }
	            }
	           );
        
        //Employer
        TableColumn<Patient,String> employer = new TableColumn<Patient, String>("Employer");
    	employer.setMinWidth(100);
        employer.setCellValueFactory(
            new PropertyValueFactory<Patient, String>("employer"));
        employer.setCellFactory(TextFieldTableCell.forTableColumn());
        employer.setOnEditCommit(
            new EventHandler<CellEditEvent<Patient, String>>() {
                @Override
                public void handle(CellEditEvent<Patient, String> t) {
                    ((Patient) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setEmployer(t.getNewValue());
                }
            }
           );
      
        //Emergency Contact
      	TableColumn<Patient,String> emergencyContact = new TableColumn<Patient, String>("Emergency Contact");
      	emergencyContact.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("emergencyContact"));
	        emergencyContact.setCellFactory(TextFieldTableCell.forTableColumn());
	        emergencyContact.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setEmergencyContact(t.getNewValue());
	                }
	            }
	           );
      				
      	//Emergency Contact Address 		
      	TableColumn<Patient,String> addressEmergencyContact = new TableColumn<Patient, String>("Contact Address ");
      	addressEmergencyContact.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("addressEmergencyContact"));
	        addressEmergencyContact.setCellFactory(TextFieldTableCell.forTableColumn());
	        addressEmergencyContact.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setAddressEmergencyContact(t.getNewValue());
	                }
	            }
	           );
      	// Emergency contact Relation to Patient
      	TableColumn<Patient,String> relatedEmergencyContact = new TableColumn<Patient, String>("Relation to Patient");
      	relatedEmergencyContact.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("relatedEmercgenyContact"));
	        relatedEmergencyContact.setCellFactory(TextFieldTableCell.forTableColumn());
	        relatedEmergencyContact.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setRelatedEmercgenyContact(t.getNewValue());
	                }
	            }
	           );
      				
      	// Emergency Contact Phone number
      	TableColumn<Patient,String> phoneNoEmergencyContact = new TableColumn<Patient, String>("Phone#");
      	phoneNoEmergencyContact.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("phoneNoEmergencyContact"));
      	phoneNoEmergencyContact.setCellFactory(TextFieldTableCell.forTableColumn());
      	phoneNoEmergencyContact.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setPhoneNoEmergencyContact(t.getNewValue());
	                }
	            }
	           );
      				
      	//Primary Insurance name
      	TableColumn<Patient,String> primaryInsurance = new TableColumn<Patient, String>("Primary Insurance");
      	primaryInsurance.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("primaryInsurance"));
      	primaryInsurance.setCellFactory(TextFieldTableCell.forTableColumn());
      	primaryInsurance.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setPrimaryInsurance(t.getNewValue());
	                }
	            }
	           );
    		
    	//Primary Insurance Policy No
    	TableColumn<Patient,String> primaryInsuranceNo = new TableColumn<Patient, String>("Primary Insurance Policy #");
    	primaryInsuranceNo.setCellValueFactory(
	            new PropertyValueFactory<Patient, String>("primaryInsuranceNo"));
    	primaryInsuranceNo.setCellFactory(TextFieldTableCell.forTableColumn());
    	primaryInsuranceNo.setOnEditCommit(
	            new EventHandler<CellEditEvent<Patient, String>>() {
	                @Override
	                public void handle(CellEditEvent<Patient, String> t) {
	                    ((Patient) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setPrimaryInsuranceNo(t.getNewValue());
	                }
	            }
	           );
    		
    		
    	// Patient Type column
           TableColumn<Patient,String> PatienttypeCol = new TableColumn<Patient,String>("Emergency Type");
           PatienttypeCol.setCellValueFactory(
   	            new PropertyValueFactory<Patient, String>("PatientType"));
           PatienttypeCol.setCellFactory(TextFieldTableCell.forTableColumn());
           PatienttypeCol.setOnEditCommit(
   	            new EventHandler<CellEditEvent<Patient, String>>() {
   	                @Override
   	                public void handle(CellEditEvent<Patient, String> t) {
   	                    ((Patient) t.getTableView().getItems().get(
   	                        t.getTablePosition().getRow())
   	                        ).setPatientType(t.getNewValue());
   	                }
   	            }
   	           );
       		
 
           
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol,idCol,ssnCol,bdCol,Address,aptNo,city,
				state,zipCode,maritalStatus,employmentStatus,employer,emergencyContact,addressEmergencyContact,
				relatedEmergencyContact,phoneNoEmergencyContact,primaryInsurance,primaryInsuranceNo,PatienttypeCol);
 
        final Button cancelButton = new Button("Exit");
        cancelButton.setOnAction(e->{stage.close();});
        hb.getChildren().addAll(cancelButton);
        hb.setSpacing(3);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
       
        stage.setScene(scene);
        stage.show();
    }
	
	/** THis Method Generates Random numbers using math.random
	 * and assigns it to a patient object	
	*/
	
	static String idGenerator(){
		
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'A');
		int id = (int)(Math.random()*100000);
		return  id+c+"";
 
	}
}
