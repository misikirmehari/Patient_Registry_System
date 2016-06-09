package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Search
 * 05/04/2016
 * 
 * This class is used to search patients based on a given 
 * parameter. 
 * @param First Name
 * @param Last Name
 * @param ID
 *
 */

import finalProject.healthCareHospital.Patient;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Search {

	static int flag = 0;
	
	public static void search(BorderPane bPane, ObservableList<Patient> data) {
		
		HBox hbox = new HBox();
		ComboBox<String> searchBy = new ComboBox<String>();
		Label searchByLabel = new Label("Search By");
		searchByLabel.setTranslateX(225);
		searchByLabel.setFont(new Font("Ariel",15));
		hbox.getChildren().addAll(searchByLabel,searchBy);
		searchBy.getItems().addAll("First Name","Last Name", "ID");
		searchBy.setValue("Select");
		searchBy.setTranslateX(250);
		
		
		VBox addVbox = new VBox();
		addVbox.setPadding(new Insets(20,20,20,20));
		addVbox.setFillWidth(false);
		addVbox.setPrefWidth(150);
		addVbox.setSpacing(10);
		bPane.setCenter(addVbox);
		Label searchLable = new Label ("First Name");
		TextField  searchField = new TextField();
		searchField.setPromptText("First name");
		
		
		
		
		
		searchBy.valueProperty().addListener(new ChangeListener<String>(){

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (searchBy.getSelectionModel().getSelectedItem()=="First Name"){
					searchLable.setText("First Name");
				}
				else if (searchBy.getSelectionModel().getSelectedItem()=="Last Name"){
					
					searchLable.setText("Last Name");
					searchField.setPromptText("Last Name");
				}
				else 
					{searchLable.setText("Id");
					searchField.setPromptText("ID");}
			}
			
			
		});
		
		
		
		
		Button saveButton = new Button ("Search");
		saveButton.setOnAction(e->{
			
			
			// Search by first name
			if (searchBy.getSelectionModel().getSelectedItem()=="First Name"){
				flag=0;
				for (int i=0;i<data.size();i++){
					
					
					if (((Patient) data.get(i)).getFirstName().equalsIgnoreCase(searchField.getText())){
						
					PopUp.searchConfirmation(i,data);
					}
					else
					{
						flag ++;
						
					}
										
				}
				if(flag == data.size()){
					
					PopUp.patientNotFound();
					
					
				}
					
					
				}
				
				
			else if (searchBy.getSelectionModel().getSelectedItem()=="Last Name"){
				flag = 0;
				for (int i=0;i<data.size();i++){
					
			
					if (((Patient) data.get(i)).getLastName().equalsIgnoreCase(searchField.getText())){
						
						PopUp.searchConfirmation(i,data);
						
					}
					else
					{
						flag ++;
						
					}
										
				}
				if(flag == data.size()){
					PopUp.patientNotFound();
				}
				
				
			}
			else if(searchBy.getSelectionModel().getSelectedItem()=="ID"){
							
				flag = 0;
				for (int i=0;i<data.size();i++){
					
				
					if (((Patient) data.get(i)).getID().equalsIgnoreCase(searchField.getText())){
						System.out.println(data.get(i).getID());
						PopUp.searchConfirmation(i,data);
						
					}
					else
					{
						flag ++;
						
					}
										
				}
				if(flag == data.size()){
					PopUp.patientNotFound();
				}
				
				
			}
			
			else {
				Alert alert = new Alert(Alert.AlertType.ERROR);
	        alert.setTitle("Error");
	        alert.setHeaderText("Search Parameter not selected");
	        alert.setContentText("Make a selection");
	        alert.show();
	     		
			
			}
			
		});
		
		
		addVbox.getChildren().addAll(hbox,searchLable,searchField,saveButton);
		

		
		
		
	}


	

}
