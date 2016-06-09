package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * SplashPage
 * 05/04/2016
 * 
 * This class is used to display the first page and 
 * progress Bar and calls the HomePage class.
 *
 */

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SplashPage  {
	
	
	
	public static void Splash(Stage primaryStage){
		
		Image image = new Image("healthcare.jpg");
		ImageView iv = new ImageView(image);
		iv.setScaleX(0.5);
		iv.setScaleY(0.5);
		ProgressBar pBar = new ProgressBar(1);
		pBar.setPrefSize(300, 30);
		pBar.setStyle("-fx-accent: maroon;");
		
		
		Timeline timeLine = new Timeline(new KeyFrame (Duration.ZERO,new KeyValue(pBar.progressProperty(),0)), 
										new KeyFrame(Duration.seconds(8),new KeyValue(pBar.progressProperty(),1)));
	    Text load = new Text("Loading...");
	    load.setFont(Font.font("Ariel",FontWeight.BOLD,12));
		
		
		
		timeLine.play();
		timeLine.setOnFinished(e-> {
			
			HomePage.homePage(primaryStage);});
		
		StackPane root = new StackPane();
		root.getChildren().addAll(iv,pBar,load);
		Scene scene = new Scene (root,400,200);
		primaryStage.setTitle("Health Care Solutions");
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(new Image("icon.png"));
		primaryStage.show();
		
		
	}

	

}
