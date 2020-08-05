package project;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{
	
	//RUN THIS CLASS IN ORDER TO START THE PROGRAM.
	
	public void start(Stage primaryStage) throws IOException {
		//Loads the first page of the program. 
		FXMLLoader loader=new FXMLLoader(getClass().getResource("FirstPage.fxml"));
		Parent root=(Parent) loader.load();
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
