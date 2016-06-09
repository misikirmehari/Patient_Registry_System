package finalProject.healthCare_gui;
/**
 * 
* @author Misikir Mehari  
* CS2050 - Patient Registry Application
* ADD
* 05/04/2016
* 
* This class is used to ADD patient records to the stack and also update the 
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
	 @param visitReason
*
*/

import java.time.LocalDate;
import java.util.Random;

import finalProject.healthCareHospital.Patient;
import finalProject.healthCareHospital.StackData;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Add {

	static StackData Dataitem = new StackData(100);
	
	public static void add(BorderPane bPane,ObservableList<Patient> data){
				
		
		// Label for Patient type
		Text patienttypeLabel = new Text ("PATIENT TYPE");
		patienttypeLabel.setFont(Font.font("Ariel",FontWeight.BOLD,12));
		
		// Label for the patient Information
		Text patientLabel = new Text ("PATIENT INFORMATION");
		patientLabel.setFont(Font.font("Ariel",FontWeight.BOLD,12));
	
		// Label for the Emergency Contact Information
		Text EmergencyContactLabel = new Text ("EMERGENCY CONTACT INFORMATION");
		EmergencyContactLabel.setFont(Font.font("Ariel",FontWeight.BOLD,12));
		
		// Label for the Insurance Information
		Text InsuranceLabel = new Text ("INSURANCE INFORMATION");
		InsuranceLabel.setFont(Font.font("Ariel",FontWeight.BOLD,12));
		
				
				
		//Label and text field for the Input for the user	
		Label firstNameLabel = new Label("First Name");
		TextField firstNameTextField = new TextField();
				
		
		Label lastNameLabel = new Label("last Name");
		TextField lastNameTextField = new TextField();
		
				
		Label emailLabel = new Label("Email");
		TextField EmailField = new TextField();

		Label ssnLabel = new Label("SSN");
		PasswordField ssnField = new PasswordField();
		
		
		Label birthdateLabel = new Label ("Birth Date");
				
			
		Label AddressLabel = new Label("Address");
		TextField AddressField = new TextField();
		
		Label aptNoLabel = new Label("APT#");
		TextField aptNoFiled = new TextField();
		
		Label cityLabel = new Label("City");
		TextField cityField = new TextField();
		
		Label stateLabel = new Label("State");
		TextField stateField = new TextField();
		
		Label zipLabel = new Label("Zip");
		TextField zipField = new TextField();
		
		Label maritalLabel = new Label("Martial Staus");
		TextField maritalField = new TextField();
		
		Label employmentSLabel = new Label("Employment Status");
		TextField employmentField = new TextField();
		
		Label employerLabel = new Label("Employer");
		TextField employerField = new TextField();
				
		Label emergencyContactLabel = new Label("Emergency Contact");
		TextField emergencyContactField = new TextField();
		
		Label addressEmergencyCLabel = new Label("Contact Address");
		TextField addressEmergencyCField = new TextField();
		
		Label relatedEmergencyLabel = new Label("Relation to patient");
		TextField relatedField = new TextField();
		
		Label emergencyCPhoneLabel = new Label("Phone");
		TextField emergencyCphoneField = new TextField();
		
		Label primaryInsuranceLabel = new Label("Primary Insurance");
		TextField primaryInsuranceField = new TextField();
		
		Label primaryInsuranceNoLabel = new Label("Policy #");
		TextField primaryInsuranceNoField = new TextField();
		
		Text ReasonForVisitLabel = new Text ("REASON FOR VISIT");
		ReasonForVisitLabel.setFont(Font.font("Ariel",FontWeight.BOLD,12));
		TextArea ReasonForVisitField = new TextArea();		
		ReasonForVisitField.setMaxWidth(400);
		
		
		GridPane gp = new GridPane();
		ToggleGroup group = new ToggleGroup();
		RadioButton emmRad = new RadioButton();
		emmRad.setText("Emergency");
		emmRad.setSelected(true);
		emmRad.setToggleGroup(group);
		RadioButton nonRad =  new RadioButton();
		nonRad.setText("NonEmergency");
		nonRad.setToggleGroup(group);
		
		
		
	
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10,10,10,10));
		
		HBox hbox = new HBox(50);
		hbox.setPadding(new Insets(20,20,20,20));
		Button clearButton = new Button ("Clear");
		clearButton.setTooltip(new Tooltip("clear the text field"));
		DatePicker datePicker = new DatePicker();
		
		/** When the save button is clicked a new patient is created with the parameters defined 
		// in the respective classes
		*/
		Button saveButton = new Button("Save"); 
		saveButton.setOnMouseClicked(e->{
		LocalDate bDate = datePicker.getValue();
		if (group.getSelectedToggle().equals(emmRad)){
			Dataitem.push(data.add(new Patient(firstNameTextField.getText(),lastNameTextField.getText(),
					EmailField.getText(),idGenerator(),ssnField.getText(), bDate,AddressField.getText(),
					aptNoFiled.getText(), cityField.getText(), stateField.getText(),zipField.getText(),
					maritalField.getText(),employmentField.getText(),employerField.getText(),
					emergencyContactField.getText(),addressEmergencyCField.getText(),relatedField.getText(),
					emergencyCphoneField.getText(),primaryInsuranceField.getText(),primaryInsuranceNoField.getText(),"Emergency",
					ReasonForVisitField.getText())));
		
		}
		else if (group.getSelectedToggle().equals(nonRad)){
			Dataitem.push(data.add(new Patient(firstNameTextField.getText(),lastNameTextField.getText(),
					EmailField.getText(),idGenerator(),ssnField.getText(), bDate,AddressField.getText(),
					aptNoFiled.getText(), cityField.getText(), stateField.getText(),zipField.getText(),
					maritalField.getText(),employmentField.getText(),employerField.getText(),
					emergencyContactField.getText(),addressEmergencyCField.getText(),relatedField.getText(),
					emergencyCphoneField.getText(),primaryInsuranceField.getText(),primaryInsuranceNoField.getText(),"Non Emergency",
					ReasonForVisitField.getText())));
		}
			
		// Reinitialize the input fields after a data has been saved
			firstNameTextField.clear();
			lastNameTextField.clear();
			EmailField.clear();
			ssnField.clear();
			lastNameTextField.clear();
			EmailField.clear();
			ssnField.clear();
			AddressField.clear();
			aptNoFiled.clear();
			cityField.clear();
			stateField.clear();
			zipField.clear();
			maritalField.clear();
			employmentField.clear();
			employerField.clear();
			emergencyContactField.clear();
			addressEmergencyCField.getText();
			relatedField.clear();
			emergencyCphoneField.clear();
			primaryInsuranceField.clear();
			primaryInsuranceNoField.clear();
			
			 

		});
		

		// Put the componenets in a horizontal style
		HBox level1 = new HBox(10);
		level1.getChildren().addAll(firstNameLabel,firstNameTextField,lastNameLabel,
				lastNameTextField);
		
		HBox level2 = new HBox(10);
		level2.getChildren().addAll(emailLabel,EmailField,ssnLabel,ssnField,birthdateLabel,datePicker);
		
		HBox level3 = new HBox(10);
		level3.getChildren().addAll(AddressLabel,AddressField,aptNoLabel,aptNoFiled);
		
		HBox level4 = new HBox(10);
		level4.getChildren().addAll(cityLabel,cityField,stateLabel,stateField,zipLabel,zipField);
		
		HBox level5 = new HBox(10);
		level5.getChildren().addAll(maritalLabel,maritalField,employmentSLabel,employmentField,employerLabel,employerField);
		
		
		HBox level6 = new HBox(10);
		level6.getChildren().addAll( emergencyContactLabel,emergencyContactField,addressEmergencyCLabel,addressEmergencyCField);
		
		HBox level7 = new HBox(10);
		level7.getChildren().addAll( relatedEmergencyLabel,relatedField,emergencyCPhoneLabel,emergencyCphoneField);
		

		HBox level8 = new HBox(10);
		level8.getChildren().addAll( primaryInsuranceLabel,primaryInsuranceField,primaryInsuranceNoLabel,primaryInsuranceNoField);
		
	
		
		hbox.getChildren().addAll(saveButton,clearButton);
		
		vbox.getChildren().addAll(patienttypeLabel,emmRad,nonRad,patientLabel,level1,level2,level3,level4,level5,
				EmergencyContactLabel,level6,level7,InsuranceLabel,level8,ReasonForVisitLabel,ReasonForVisitField,hbox);

		Pane pane = new Pane();
		bPane.setCenter(vbox);
		
		
	
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
