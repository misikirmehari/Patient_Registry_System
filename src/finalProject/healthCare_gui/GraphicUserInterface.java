package finalProject.healthCare_gui;

/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * GraphicalUserInterface
 * 05/04/2016
 * 
 * This class is the launcher. You execute the program using this class.
 * Displays all information through the GUI and allows user to interact with the application.
 * Saves all information appropriately and when specified by user.
 *
 *
 */

import javafx.application.Application;
import javafx.stage.Stage;


public class GraphicUserInterface extends Application{	
	
	
		@Override
		public void start(Stage primaryStage) throws Exception {
			SplashPage.Splash(primaryStage);
	}
	public static void main (String [] args){
			launch(args);	
		}
	}