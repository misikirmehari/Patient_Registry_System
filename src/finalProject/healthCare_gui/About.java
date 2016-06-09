package finalProject.healthCare_gui;

/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * About
 * 05/04/2016
 * 
 * This class is used to display information about the 
 * application and the purpose of this project
 *
 */

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class About {
	

	
	public static void about(){
		
		Text aboutText = new Text();
		aboutText.setText(" Health care \n"
		+ "Final Project\n"
			+"Author: Misikir Mehari\n "
			+"Computer Sceince 2.\n");
		StackPane aboutPane = new StackPane();
		aboutPane.getChildren().add(aboutText);
		Scene aboutScene = new Scene(aboutPane,400,200);
		Stage aboutStage = new Stage();
		aboutStage.setScene(aboutScene);
		aboutStage.setTitle("About");
		aboutStage.getIcons().add(new Image("About.jpg"));
		aboutStage.show();
	
	}

}
