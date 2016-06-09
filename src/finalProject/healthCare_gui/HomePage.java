package finalProject.healthCare_gui;
/**
 * 
 * @author Misikir Mehari  
 * CS2050 - Patient Registry Application
 * HomePage
 * 05/04/2016
 * 
 * This class is used as the Main page of the application 
 * and all of the application components are triggered 
 * from this class.
 *
 */


import finalProject.healthCareHospital.Patient;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HomePage {
	


    static  ObservableList<Patient> data =
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
  

	@SuppressWarnings({ "resource", "unchecked" })
	public static void homePage(Stage primaryStage){
		
		
		Separator sp = new Separator();
        BorderPane bPane = new BorderPane();

		MenuBar menuBar = new MenuBar();
		menuBar.setBackground(new Background(new BackgroundFill(Color.rgb(255, 163, 163), null, null)));
		
		Menu file ;
        MenuItem exportMenuItem ;
        MenuItem exitMenuItem ;

       
     
               
               file = new Menu("File");
               file.setDisable(false);
               exportMenuItem = new MenuItem("Export");
               exportMenuItem.setOnAction(e->{try {
				Export.writeExcel(data);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}});
               
               exitMenuItem = new MenuItem("Exit");
               exitMenuItem.setOnAction(e->System.exit(0));
               file.getItems().addAll(exportMenuItem,exitMenuItem);
               
               // Edits the patient information
               Menu edit = new Menu ("Edit");
               MenuItem addMenuItem = new MenuItem("Add");
               addMenuItem.setOnAction(e->{Add.add(bPane,data);});
               MenuItem deleteMenuItem = new MenuItem("Delete");
               deleteMenuItem.setOnAction(e->{Delete.delete(bPane,data);});
               MenuItem searchMenuItem = new MenuItem("Search");
               searchMenuItem.setOnAction(e->{Search.search(bPane,data);});
               edit.getItems().addAll(addMenuItem,deleteMenuItem,searchMenuItem);
               
               // Information bar
               Menu help = new Menu("Help");
               MenuItem aboutMenuItem = new MenuItem("About");
               aboutMenuItem.setOnAction(e->{About.about();});
               MenuItem helpMenuItem = new MenuItem("Help");
               helpMenuItem.setOnAction(e->{PopUp.Help();});
           
               
               
               help.getItems().addAll(aboutMenuItem,helpMenuItem);
               bPane.setTop(menuBar);
              
		
		TreeView<String> Tree = new TreeView<String>();
        TreeItem<String> home = new TreeItem<String>();
        TreeItem<String> creatTreeItem =new TreeItem<>("Add Patient");

        TreeItem<String> deleteTreeItem =new TreeItem<String>("Delete Patient");
        TreeItem<String> searchTreeItem = new TreeItem<String> ("Search Patient");
        TreeItem<String> openTreeItem = new TreeItem<String> ("Home");
        TreeItem<String> editTreeItem = new TreeItem<String> ("Edit Patient");
        home.setExpanded(true);
        
        home.getChildren().addAll(openTreeItem,creatTreeItem,deleteTreeItem,searchTreeItem,editTreeItem);
        Tree.setRoot(home);
        
        
        
        menuBar.getMenus().addAll(file,edit,help);
        Tree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem>() {
        

    

        @Override
        public void changed(ObservableValue<? extends TreeItem> observable, TreeItem oldValue, TreeItem newValue) {
            
            if (Tree.getSelectionModel().getSelectedItem().equals(creatTreeItem))
            {
                
                 Add.add(bPane,data);
            }
        
            else if (Tree.getSelectionModel().getSelectedItem().equals(editTreeItem)){
                Edit.edit(data);

            }
            else if (Tree.getSelectionModel().getSelectedItem().equals(openTreeItem)){
                
                Table.display(data,bPane);

            }
            
            else if (Tree.getSelectionModel().getSelectedItem().equals(deleteTreeItem)){
                
                
                Delete.delete(bPane,data);

            }
            else if (Tree.getSelectionModel().getSelectedItem().equals(searchTreeItem)){
                
                Search.search(bPane,data);
            }
            
            
        }

        
        
    });
        
        
        bPane.setLeft(Tree);
        Table.display(data, bPane);
        
   	
	Scene welcomeScene = new Scene(bPane,1900,1000);
	primaryStage.setScene(welcomeScene);
	primaryStage.setX(0);
	primaryStage.setY(0);
	primaryStage.show();
	

	
	
}

}
