package finalProject.healthCare_gui;

/* 
* @author Misikir Mehari  
* CS2050 - Patient Registry Application
* Delete
* 05/04/2016
* 
* This class is used to Delete patients based on a given 
* parameter. 
* @param First Name
* @param Last Name
* @param ID
*
*/
import java.util.Optional;

import finalProject.healthCareHospital.Patient;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Delete {

	
	
	public static void delete(BorderPane bPane, ObservableList<Patient> data) {
		
		
		ComboBox<String> deleteBy = new ComboBox<String>();
		deleteBy.getItems().addAll("First name","Last Name", "ID");
		deleteBy.setValue("Delete By");
		deleteBy.setTranslateX(250);
		
		
		VBox addVbox = new VBox();
		addVbox.setPadding(new Insets(20,20,20,20));
		addVbox.setFillWidth(false);
		addVbox.setPrefWidth(150);
		addVbox.setSpacing(10);
		bPane.setCenter(addVbox);
		Label searchLable = new Label ("First Name");
		TextField  searchField = new TextField();
		searchField.setPromptText("First name");
		
		
		
		
		
		deleteBy.valueProperty().addListener(new ChangeListener<String>(){

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (deleteBy.getSelectionModel().getSelectedItem()=="First Name"){
					searchLable.setText("First Name");
				}
				else if (deleteBy.getSelectionModel().getSelectedItem()=="Last Name"){
					
					searchLable.setText("Last Name");
					searchField.setPromptText("Last Name");
				}
				else if(deleteBy.getSelectionModel().getSelectedItem()=="ID")
					{
					searchLable.setText("ID");
					searchField.setPromptText("ID");}
			}
			
			
		});
		
		
		
		
		Button delButton = new Button ("Delete");
		delButton.setOnAction(e->{
							
			// Delete By first Name
			if (deleteBy.getSelectionModel().getSelectedItem()=="First name"){
					for (int i=0;i<data.size();i++){
					
					if ((data.get(i)).getFirstName().equalsIgnoreCase(searchField.getText())){
						Alert alert = new Alert(Alert.AlertType.WARNING);
				        alert.setTitle("Delete A Patient");
				        alert.setHeaderText("Warning !");
				        alert.setContentText("Are you sure you want to delete ? "+
				        					((Patient) data.get(i)).getLastName());
				        Optional<ButtonType> result = alert.showAndWait();
				        	if (result.get() == ButtonType.OK) {
								data.remove(i);
				        	}
						}
					}
			}
			// Delete By Last Name
			else if (deleteBy.getSelectionModel().getSelectedItem()=="Last Name"){
				
				for (int i=0;i<data.size();i++){
					
					if ((data.get(i)).getLastName().equalsIgnoreCase(searchField.getText())){
						Alert alert = new Alert(Alert.AlertType.WARNING);
				        alert.setTitle("Delete A Patient");
				        alert.setHeaderText("Warning !");
				        alert.setContentText("Are you sure you want to delete ? "+
				        					((Patient) data.get(i)).getLastName());
				        Optional<ButtonType> result = alert.showAndWait();
				        	if (result.get() == ButtonType.OK) {
								data.remove(i);
				        	}
						}
				}
				
				
			}
			// Delete By ID
			else if (deleteBy.getSelectionModel().getSelectedItem()=="ID"){     			
								
				for (int i=0;i<data.size();i++){
					
					if (( data.get(i)).getID().equalsIgnoreCase(searchField.getText())){
						Alert alert = new Alert(Alert.AlertType.WARNING);
				        alert.setTitle("Delete A Patient");
				        alert.setHeaderText("Warning !");
				        alert.setContentText("Are you sure you want to delete ? "+
				        					((Patient) data.get(i)).getLastName());
				        Optional<ButtonType> result = alert.showAndWait();
				        	if (result.get() == ButtonType.OK) {
								data.remove(i);
				        	}
				        	//else 
				        		
											
					}
				}
				
				
			}
			
			
			
			
		});
		
		
		addVbox.getChildren().addAll(deleteBy,searchLable,searchField,delButton);
		

		
		
		
	}

}
