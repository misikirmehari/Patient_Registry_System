package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * Pop up
 * 05/04/2016
 * 
 * This class is used to display Notification 
 * and error message to the user if the action is Inapplicable.
 *
 */

import finalProject.healthCareHospital.Patient;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PopUp {
	

public static  void searchConfirmation(int i, ObservableList<Patient> data){
	Text searchconf = new Text();
	searchconf.setText(data.get(i).toString());
	StackPane searchpane = new StackPane();
	searchpane.getChildren().add(searchconf);
	Scene searchScene = new Scene(searchpane,400,200);
	Stage searchStage = new Stage();
	searchStage.setScene(searchScene);
	searchStage.setTitle(" Patient Found");
	
	searchStage.show();

	
}

public static void Help(){
	Text HelpText = new Text();
	HelpText.setText("For More Information please read the user manual "
			+ "in the source folder");
	StackPane aboutPane = new StackPane();
	aboutPane.getChildren().add(HelpText);
	Scene HelpScene = new Scene(aboutPane,400,200);
	Stage HelpStage = new Stage();
	HelpStage.setScene(HelpScene);
	HelpStage.setTitle("Help");
	HelpStage.getIcons().add(new Image("helpicon.jpg"));
	HelpStage.show();
}
public static  void patientNotFound(){
	Text psearchconf = new Text("Patient Not Found!");
	StackPane psearchpane = new StackPane();
	psearchpane.getChildren().add(psearchconf);
	Scene searchScene = new Scene(psearchpane,400,200);
	Stage searchStage = new Stage();
	searchStage.setScene(searchScene);
	searchStage.setTitle(" Patient Not Found");
	searchStage.show();
}
}
