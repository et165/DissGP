package project;

import java.io.File;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VideoController {
//Declaring javafx attributes
	  @FXML
	    private ImageView EIGHT;

	    @FXML
	    private ImageView SIX;

	    @FXML
	    private ImageView ONE;

	    @FXML
	    private ImageView FOUR;

	    @FXML
	    private Button NEXT6;

	    @FXML
	    private Button QUIT;

	    @FXML
	    private Button NEXT5;

	    @FXML
	    private Button NEXT4;

	    @FXML
	    private Button NEXT3;

	    @FXML
	    private Button NEXT9;

	    @FXML
	    private ImageView TWO;

	    @FXML
	    private Button NEXT8;

	    @FXML
	    private Button NEXT7;

	    @FXML
	    private ImageView FIVE;

	    @FXML
	    private Button NEXT2;

	    @FXML
	    private Button NEXT1;

	    @FXML
	    private ImageView NINE;

	    @FXML
	    private ImageView THREE;

	    @FXML
	    private ImageView SEVEN;
	    
	    @FXML
	    private GridPane griddypane;
	   
    //Closing the tutorial page.
    @FXML
    void CLICKQUIT(ActionEvent event) {
    	try {
		 Stage stage2 = (Stage) QUIT.getScene().getWindow();
		  
		    stage2.close();
		    
		FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));
   		Parent root=(Parent) loader.load();
   		MainController sc=loader.getController();
   		
   		Stage stage=new Stage();
   		stage.setScene(new Scene(root));
   		stage.show();
    	}
    	
catch(Exception e) {System.out.print(e);
    	
    	
    	
    	}
		    
    	
    }

    
    //Segment of code which adds images to the slide-show and removes the other images so user can navigate correctly.
        @FXML
        void next1(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(ONE, 0, 0, 1, 1); 
        	
        	
        	
        }

      

        @FXML
        void next2(ActionEvent event) {
        	this.griddypane.getChildren().remove(ONE);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(TWO, 0, 0, 1, 1);
        	
        }

        @FXML
        void next3(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(THREE, 0, 0, 1, 1);
        	
        }

        @FXML
        void next4(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(FOUR, 0, 0, 1, 1);
        	
        }

        @FXML
        void next5(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(FIVE, 0, 0, 1, 1);
        	
        }

        @FXML
        void next6(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(SIX, 0, 0, 1, 1);
        	
        }

        @FXML
        void next7(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(SEVEN, 0, 0, 1, 1);
        	
        }

        @FXML
        void next8(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.getChildren().remove(NINE); 
        	this.griddypane.add(EIGHT, 0, 0, 1, 1);
        	
        }

        @FXML
        void next9(ActionEvent event) {
        	this.griddypane.getChildren().remove(TWO);
        	this.griddypane.getChildren().remove(THREE); 
        	this.griddypane.getChildren().remove(FOUR); 
        	this.griddypane.getChildren().remove(FIVE); 
        	this.griddypane.getChildren().remove(SIX); 
        	this.griddypane.getChildren().remove(SEVEN); 
        	this.griddypane.getChildren().remove(EIGHT); 
        	this.griddypane.getChildren().remove(ONE); 
        	this.griddypane.add(NINE, 0, 0, 1, 1);
        	
        }

    
    

}
   


