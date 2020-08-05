package project;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class GPSelectorController implements Initializable {
	//Declaring JavaFX attributes.
    @FXML
    private Text testingtext;
    
    @FXML
    private GridPane gridpane;
    
    @FXML
    private ToggleButton b1;

    @FXML
    private ToggleButton b2;

    @FXML
    private ToggleButton b3;

    @FXML
    private ToggleButton b4;

    @FXML
    private ToggleButton b5;

    @FXML
    private ToggleButton b6;

    @FXML
    private ToggleButton b7;

    @FXML
    private ToggleButton b8;

    @FXML
    private ToggleButton b9;
    
    @FXML
    private ToggleButton b10;

    @FXML
    private ToggleButton b12;

    @FXML
    private ToggleButton b11;

    @FXML
    private ToggleButton b14;

    @FXML
    private ToggleButton b13;

    @FXML
    private ToggleButton b15;
    
    @FXML
    private ToggleButton b16;
    
    @FXML
    private Text usernamefield;
    
    @FXML
    private Text imgfield;
    
    @FXML
    private Text dirfield;
    
    @FXML
    private Button loginButton;
    
    @FXML
    private Text picchosen;

    
    private ToggleGroup group;

	private int selected;
	
	private int CORRECT;
	
	int findButtonHERE;
	private String userP;
	private String userD;
	
	int ONE;
	int TWO;
	int THREE;
	int FOUR;
	int FIVE;
	int SIX;
	int SEVEN;
	int EIGHT;
	int NINE;
	int TEN;
	int ELEVEN;
	int TWELVE;
	int THIRTEEN;
	int FOURTEEN;
	int FIFTEEN;
	int SIXTEEN;
	

    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
	
    	this.gridpane.setHgap(10);
    	this.gridpane.setVgap(170);

    	
    	
    	
    	//Puts the buttons into a group
    	group = new ToggleGroup();
    	this.b1.setToggleGroup(group);
    	this.b2.setToggleGroup(group);
    	this.b3.setToggleGroup(group);
    	this.b4.setToggleGroup(group);
    	this.b5.setToggleGroup(group);
    	this.b6.setToggleGroup(group);
    	this.b7.setToggleGroup(group);
    	this.b8.setToggleGroup(group);
    	this.b9.setToggleGroup(group);
    	this.b10.setToggleGroup(group);
    	this.b11.setToggleGroup(group);
    	this.b12.setToggleGroup(group);
    	this.b13.setToggleGroup(group);
    	this.b14.setToggleGroup(group);
    	this.b15.setToggleGroup(group);
    	this.b16.setToggleGroup(group);
    	
    	//Puts buttons into an array
    	ToggleButton[] ButtonArray = { this.b1, this.b2, this.b3, this.b4, this.b5, this.b6, this.b7, this.b8, this.b9, this.b10, this.b11, this.b12, this.b13, this.b14, this.b15, this.b16 };
    		  	
    	//Creates random values
    	Random rand1 = new Random();
    	Random rand2 = new Random();
    	Random rand3 = new Random();
    	Random rand4 = new Random();
    	Random rand5 = new Random();
    	Random rand6 = new Random();
    	Random rand7 = new Random();
    	Random rand8 = new Random();
    	Random rand9 = new Random();
    	Random rand10 = new Random();
    	Random rand11 = new Random();
    	Random rand12 = new Random();
    	Random rand13 = new Random();
    	Random rand14 = new Random();
    	Random rand15 = new Random();
    	Random rand16 = new Random();
    	
    //Creates a random value between 1-16, then places the random button into slot 1x4 - continues for whole grid.
    	int randomNum1 = rand1.nextInt((16 - 0) + 0) + 0;  //random number 1
    	System.out.println(" FIRST CHECK 1: " + ButtonArray[randomNum1]);
    	this.gridpane.add(ButtonArray[randomNum1], 0, 0, 1, 1);  //adds random number 1 to 0,0
    	
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	int randomNum2 = rand2.nextInt((16 - 0) + 0) + 0;	
    	System.out.println(" FIRST CHECK 2: " +ButtonArray[randomNum2]);
    	while (randomNum2 == randomNum1) {
    		
    		
    		System.out.println("looping at 2");
    		Random NEW = new Random();
    		 randomNum2 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 2 formed: "+ randomNum2);

    	}
    	System.out.println(" finalcheck 2: " +ButtonArray[randomNum2]);
    	this.gridpane.add(ButtonArray[randomNum2], 1, 0, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	int randomNum3 = rand3.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 3: " +ButtonArray[randomNum3]);
    	while (randomNum3 == randomNum1 || randomNum3 == randomNum2 ) {
    		System.out.println("looping at 3");
    		Random NEW = new Random();
    		 randomNum3 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 3 formed: "+ randomNum3);
    		 
    		
    	}
    	System.out.println(" finalcheck 3: " +ButtonArray[randomNum3]);
    	this.gridpane.add(ButtonArray[randomNum3], 2, 0, 1, 1);
    	
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum4 = rand4.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 4: " +ButtonArray[randomNum4]);
    	
    	while (randomNum4 == randomNum1 || randomNum4 == randomNum2 || randomNum4 == randomNum3 ) {
    		System.out.println("looping at 4");
    		Random NEW = new Random();
    		 randomNum4 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 4 formed: "+ randomNum4);
    	}
    	
    	System.out.println(" finalcheck 4: " +ButtonArray[randomNum4]);
    	this.gridpane.add(ButtonArray[randomNum4], 3, 0, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum5 = rand5.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 5: " +ButtonArray[randomNum5]);
    	
    	while (randomNum5 == randomNum1 || randomNum5 == randomNum2 || randomNum5 == randomNum3 || randomNum5 == randomNum4  ) {
    		System.out.println("looping at 5");
    		Random NEW = new Random();
    		 randomNum5 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 4 formed: "+ randomNum4);
    	}
    	
    	System.out.println(" finalcheck 5: " +ButtonArray[randomNum5]);
    	this.gridpane.add(ButtonArray[randomNum5], 0, 1, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	
    	int randomNum6 = rand6.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 6: " +ButtonArray[randomNum6]);
    	
    	while (randomNum6 == randomNum1 || randomNum6 == randomNum2 || randomNum6 == randomNum3 || randomNum6 == randomNum4 || randomNum6 == randomNum5  ) {
    		System.out.println("looping at 6");
    		Random NEW = new Random();
    		 randomNum6 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 6 formed: "+ randomNum6);
    	}
    	
    	System.out.println(" finalcheck 6: " +ButtonArray[randomNum6]);
    	this.gridpane.add(ButtonArray[randomNum6], 1, 1, 1, 1);
    	
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	
    	
    	int randomNum7 = rand7.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 7: " +ButtonArray[randomNum7]);
    	
    	while (randomNum7 == randomNum1 || randomNum7 == randomNum2 || randomNum7 == randomNum3 || randomNum7 == randomNum4 || randomNum7 == randomNum5 || randomNum7 == randomNum6   ) {
    		System.out.println("looping at 7");
    		Random NEW = new Random();
    		 randomNum7 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 7 formed: "+ randomNum7);
    	}
    	
    	System.out.println(" finalcheck 7: " +ButtonArray[randomNum7]);
    	this.gridpane.add(ButtonArray[randomNum7], 2, 1, 1, 1);
    	
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	
    	int randomNum8 = rand8.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 8: " +ButtonArray[randomNum8]);
    	
    	while (randomNum8 == randomNum1 || randomNum8 == randomNum2 || randomNum8 == randomNum3 || randomNum8 == randomNum4 ||
    			randomNum8 == randomNum5 || randomNum8 == randomNum6  || randomNum8 == randomNum7   ) {
    		System.out.println("looping at 8");
    		Random NEW = new Random();
    		 randomNum8 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 8 formed: "+ randomNum8);
    	}
    	
    	System.out.println(" finalcheck 8: " +ButtonArray[randomNum8]);
    	this.gridpane.add(ButtonArray[randomNum8], 3, 1, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum9 = rand9.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 9: " +ButtonArray[randomNum9]);
    	
    	while (randomNum9 == randomNum1 || randomNum9 == randomNum2 || randomNum9 == randomNum3 || randomNum9 == randomNum4 ||
    			randomNum9 == randomNum5 || randomNum9 == randomNum6  || randomNum9 == randomNum7 || randomNum9 == randomNum8  ) {
    		System.out.println("looping at 9");
    		Random NEW = new Random();
    		 randomNum9 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 9 formed: "+ randomNum9);
    	}
    	
    	System.out.println(" finalcheck 9: " +ButtonArray[randomNum9]);
    	this.gridpane.add(ButtonArray[randomNum9],  0, 2, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum10 = rand10.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 10: " +ButtonArray[randomNum10]);
    	
    	while (randomNum10 == randomNum1 || randomNum10 == randomNum2 || randomNum10 == randomNum3 || randomNum10 == randomNum4 ||
    			randomNum10 == randomNum5 || randomNum10 == randomNum6  || randomNum10 == randomNum7 || randomNum10 == randomNum8 || randomNum10 == randomNum9  ) {
    		System.out.println("looping at 10");
    		Random NEW = new Random();
    		 randomNum10 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 10 formed: "+ randomNum10);
    	}
    	
    	System.out.println(" finalcheck 10: " +ButtonArray[randomNum10]);
    	this.gridpane.add(ButtonArray[randomNum10], 1, 2, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	
    	int randomNum11 = rand11.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 11: " +ButtonArray[randomNum11]);
    	
    	while (randomNum11 == randomNum1 || randomNum11 == randomNum2 || randomNum11 == randomNum3 || randomNum11 == randomNum4 ||
    			randomNum11 == randomNum5 || randomNum11 == randomNum6  || randomNum11 == randomNum7 || randomNum11 == randomNum8 || randomNum11 == randomNum9
    			|| randomNum11 == randomNum10) {
    		System.out.println("looping at 11");
    		Random NEW = new Random();
    		 randomNum11 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 11 formed: "+ randomNum11);
    	}
    	
    	System.out.println(" finalcheck 11: " +ButtonArray[randomNum11]);
    	this.gridpane.add(ButtonArray[randomNum11], 2, 2, 1, 1);
    	
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum12 = rand12.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 12: " +ButtonArray[randomNum12]);
    	
    	while (randomNum12 == randomNum1 || randomNum12 == randomNum2 || randomNum12 == randomNum3 || randomNum12 == randomNum4 ||
    			randomNum12 == randomNum5 || randomNum12 == randomNum6  || randomNum12 == randomNum7 || randomNum12 == randomNum8 || randomNum12 == randomNum9
    			|| randomNum12 == randomNum10 || randomNum12 == randomNum11) {
    		System.out.println("looping at 12");
    		Random NEW = new Random();
    		 randomNum12 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 12 formed: "+ randomNum12);
    	}
    	
    	System.out.println(" finalcheck 12: " +ButtonArray[randomNum12]);
    	this.gridpane.add(ButtonArray[randomNum12], 3, 2, 1, 1); 
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	
    	int randomNum13 = rand13.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 13: " +ButtonArray[randomNum13]);
    	
    	while (randomNum13 == randomNum1 || randomNum13 == randomNum2 || randomNum13 == randomNum3 || randomNum13 == randomNum4 ||
    			randomNum13 == randomNum5 || randomNum13 == randomNum6  || randomNum13 == randomNum7 || randomNum13 == randomNum8 || randomNum13 == randomNum9
    			|| randomNum13 == randomNum10 || randomNum13 == randomNum11 || randomNum13 == randomNum12) {
    		System.out.println("looping at 13");
    		Random NEW = new Random();
    		 randomNum13 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 13 formed: "+ randomNum13);
    	}
    	
    	System.out.println(" finalcheck 13: " +ButtonArray[randomNum13]);
    	this.gridpane.add(ButtonArray[randomNum13], 0, 3, 1, 1);
    	
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	
    	int randomNum14 = rand14.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 14: " +ButtonArray[randomNum14]);
    	
    	while (randomNum14 == randomNum1 || randomNum14 == randomNum2 || randomNum14 == randomNum3 || randomNum14 == randomNum4 ||
    			randomNum14 == randomNum5 || randomNum14 == randomNum6  || randomNum14 == randomNum7 || randomNum14 == randomNum8 || randomNum14 == randomNum9
    			|| randomNum14 == randomNum10 || randomNum14 == randomNum11 || randomNum14 == randomNum12 || randomNum14 == randomNum13) {
    		System.out.println("looping at 14");
    		Random NEW = new Random();
    		 randomNum14 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 14 formed: "+ randomNum14);
    	}
    	
    	System.out.println(" finalcheck 14: " +ButtonArray[randomNum14]);
    	this.gridpane.add(ButtonArray[randomNum14], 1, 3, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum15 = rand15.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 15: " +ButtonArray[randomNum15]);
    	
    	while (randomNum15 == randomNum1 || randomNum15 == randomNum2 || randomNum15 == randomNum3 || randomNum15 == randomNum4 ||
    			randomNum15 == randomNum5 || randomNum15 == randomNum6  || randomNum15 == randomNum7 || randomNum15 == randomNum8 || randomNum15 == randomNum9
    			|| randomNum15 == randomNum10 || randomNum15 == randomNum11 || randomNum15 == randomNum12 || randomNum15 == randomNum13 || randomNum15 == randomNum14) {
    		System.out.println("looping at 15");
    		Random NEW = new Random();
    		 randomNum15 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 15 formed: "+ randomNum15);
    	}
    	
    	System.out.println(" finalcheck 15: " +ButtonArray[randomNum15]);
    	this.gridpane.add(ButtonArray[randomNum15], 2, 3, 1, 1);
    	
    	//--------------------------------------------------------------------------------------------------------------------
    	
    	int randomNum16 = rand16.nextInt((16 - 0) + 0) + 0;
    	System.out.println(" FIRST CHECK 16: " +ButtonArray[randomNum16]);
    	
    	while (randomNum16 == randomNum1 || randomNum16 == randomNum2 || randomNum16 == randomNum3 || randomNum16 == randomNum4 ||
    			randomNum16 == randomNum5 || randomNum16 == randomNum6  || randomNum16 == randomNum7 || randomNum16 == randomNum8 || randomNum16 == randomNum9
    			|| randomNum16 == randomNum10 || randomNum16 == randomNum11 || randomNum16 == randomNum12 || randomNum16 == randomNum13 || randomNum16 == randomNum14 || randomNum16 == randomNum15) {
    		System.out.println("looping at 16");
    		Random NEW = new Random();
    		 randomNum16 = NEW.nextInt((16 - 0) + 0) + 0;
    		 System.out.println("New Random 16 formed: "+ randomNum16);
    	}
    	
    	System.out.println(" finalcheck 16: " +ButtonArray[randomNum16]);
    	this.gridpane.add(ButtonArray[randomNum16], 3, 3, 1, 1);
    	
    	System.out.println("---------------------");
    	System.out.println("FINAL RESULT ROW");
    	System.out.println(ButtonArray[randomNum1]);
    	System.out.println(ButtonArray[randomNum2]);
    	System.out.println(ButtonArray[randomNum3]);
    	System.out.println(ButtonArray[randomNum4]);
    	System.out.println(ButtonArray[randomNum5]);
    	System.out.println("---------------------");
    	
    	
    	System.out.println("Whole ButtonArray: " + Arrays.toString(ButtonArray));
    	
    	//Saves random values into the class.

    	this.ONE = randomNum1;
    	this.TWO = randomNum2;
    	this.THREE = randomNum3;
    	this.FOUR = randomNum4;
    	this.FIVE = randomNum5;
    	this.SIX = randomNum6;
    	this.SEVEN = randomNum7;
    	this.EIGHT = randomNum8;
    	this.NINE = randomNum9;
    	this.TEN = randomNum10;
    	this.ELEVEN = randomNum11;
    	this.TWELVE = randomNum12;
    	this.THIRTEEN = randomNum13;
    	this.FOURTEEN = randomNum14;
    	this.FIFTEEN = randomNum15;
    	this.SIXTEEN = randomNum16;
    	
    	
    	
    	
    }
     
  
    


	//Users selected option is saved.

    public void togglebuttonChanged() {
		   
		   if (this.group.getSelectedToggle().equals(this.b1)) {
			  this.selected = 1;
			   b1.setStyle("-fx-background-color: #ff0000; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			  b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			  b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
			   
		   }
		  
		   if (this.group.getSelectedToggle().equals(this.b2)) {
			   this.selected = 2;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #ff0000; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b3)) {
			   this.selected = 3;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #ff0000; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			  b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b4)) {
			   this.selected = 4;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #ff0000; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b5)) {
			   this.selected = 5;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			  b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #ff0000; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b6)) {
			   this.selected = 6;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			  b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #ff0000; ");
			  b7.setStyle("-fx-background-color: #2E2E2E; ");
			  b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b7)) {
			   this.selected = 7;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #ff0000; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b8)) {
			   this.selected = 8;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			  b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			  b8.setStyle("-fx-background-color: #ff0000; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b9)) {
			   this.selected = 9;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #ff0000; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b10)) {
			   this.selected = 10;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #ff0000; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b11)) {
			   this.selected = 11;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #ff0000; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b12)) {
			   this.selected = 12;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #ff0000; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b13)) {
			   this.selected = 13;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #ff0000; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b14)) {
			   this.selected = 14;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #ff0000; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b15)) {
			   this.selected = 15;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #ff0000; ");
			   b16.setStyle("-fx-background-color: #2E2E2E; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		   
		   if (this.group.getSelectedToggle().equals(this.b16)) {
			   this.selected = 16;
			   b1.setStyle("-fx-background-color: #2E2E2E; ");
			   b2.setStyle("-fx-background-color: #2E2E2E; ");
			   b3.setStyle("-fx-background-color: #2E2E2E; ");
			   b4.setStyle("-fx-background-color: #2E2E2E; ");
			   b5.setStyle("-fx-background-color: #2E2E2E; ");
			   b6.setStyle("-fx-background-color: #2E2E2E; ");
			   b7.setStyle("-fx-background-color: #2E2E2E; ");
			   b8.setStyle("-fx-background-color: #2E2E2E; ");
			   b9.setStyle("-fx-background-color: #2E2E2E; ");
			   b10.setStyle("-fx-background-color: #2E2E2E; ");
			   b11.setStyle("-fx-background-color: #2E2E2E; ");
			   b12.setStyle("-fx-background-color: #2E2E2E; ");
			   b13.setStyle("-fx-background-color: #2E2E2E; ");
			   b14.setStyle("-fx-background-color: #2E2E2E; ");
			   b15.setStyle("-fx-background-color: #2E2E2E; ");
			   b16.setStyle("-fx-background-color: #ff0000; ");
			   System.out.println(this.selected);
			   System.out.println(selected);
		   }
		      
   
	   
    }


	public void setText(String text) {
		usernamefield.setText(text);		
		
	}
	//User attempts to login.
	
	@FXML
	 void loginButtonPressed(ActionEvent event) throws IOException {

		String username = usernamefield.getText();

		Crypto crypto = new BasicCrypto();
		username = new String(crypto.encrypt(username.getBytes()));
		
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
    		Statement stmt=con.createStatement();
    		String sql="Select * from logindatabase where username like '"+username+"'";
    		ResultSet rs=stmt.executeQuery(sql);	
    		
    		if(rs.next()) {
    			//DATABASE saved information is loaded.
    			String usersPicture = rs.getString("picture");
    			String usersDirection = rs.getString("direction");
    			int usersExtra = rs.getInt("ExtraGrid");
    			System.out.println("picture from database: " + usersPicture);
    			System.out.println("direction from database: " + usersDirection);
	                                     
    			String strRandom1 = Integer.toString(this.ONE + 1); 
    	    	String strRandom2 = Integer.toString(this.TWO+ 1); 
    	    	String strRandom3 = Integer.toString(this.THREE+ 1); 
    	    	String strRandom4 = Integer.toString(this.FOUR+ 1); 
    	    	String strRandom5 = Integer.toString(this.FIVE+ 1); 
    	    	String strRandom6 = Integer.toString(this.SIX+ 1); 
    	    	String strRandom7 = Integer.toString(this.SEVEN+ 1); 
    	    	String strRandom8 = Integer.toString(this.EIGHT+ 1); 
    	    	String strRandom9 = Integer.toString(this.NINE+ 1); 
    	    	String strRandom10 = Integer.toString(this.TEN+ 1); 
    	    	String strRandom11 = Integer.toString(this.ELEVEN+ 1); 
    	    	String strRandom12 = Integer.toString(this.TWELVE+ 1); 
    	    	String strRandom13 = Integer.toString(this.THIRTEEN+ 1); 
    	    	String strRandom14 = Integer.toString(this.FOURTEEN+ 1); 
    	    	String strRandom15 = Integer.toString(this.FIFTEEN+ 1); 
    	    	String strRandom16 = Integer.toString(this.SIXTEEN+ 1); 
    	    		
    	    	System.out.println("selected pic: " + usersPicture); 
    	    	int position = 0;
    	    	int correctChoice = -2;
    	    	
    	    	
    	   //this will find the GRID segment that the USERS picture is inside.
    	            if (strRandom1.equals(usersPicture)) {
    	            	position = 1;
    	    		System.out.println("GRID 1"); }
    	            
    	            if (strRandom2.equals(usersPicture)) {
    	            	position = 2;
    	        		System.out.println("GRID 2"); }
    	            
    	            if (strRandom3.equals(usersPicture)) {
    	            	position = 3;
    	        		System.out.println("GRID 3"); }
    	            
    	            if (strRandom4.equals(usersPicture)) {
    	            	position = 4;
    	        		System.out.println("GRID 4"); }
    	            
    	            if (strRandom5.equals(usersPicture)) {
    	            	position = 5;
    	        		System.out.println("GRID 5"); }
    	            
    	            if (strRandom6.equals(usersPicture)) {
    	            	position = 6;
    	        		System.out.println("GRID 6"); }
    	            
    	            if (strRandom7.equals(usersPicture)) {
    	            	position = 7;
    	        		System.out.println("GRID 7"); }
    	            
    	            if (strRandom8.equals(usersPicture)) {
    	            	position = 8;
    	        		System.out.println("GRID 8"); }
    	            
    	            if (strRandom9.equals(usersPicture)) {
    	            	position = 9;
    	        		System.out.println("GRID 9"); }
    	            
    	            if (strRandom10.equals(usersPicture)) {
    	            	position = 10;
    	        		System.out.println("GRID 10"); }
    	            
    	            if (strRandom11.equals(usersPicture)) {
    	            	position = 11;
    	        		System.out.println("GRID 11"); }
    	            
    	            if (strRandom12.equals(usersPicture)) {
    	            	position = 12;
    	        		System.out.println("GRID 12"); }
    	            
    	            if (strRandom13.equals(usersPicture)) {
    	            	position = 13;
    	        		System.out.println("GRID 13"); }
    	            
    	            if (strRandom14.equals(usersPicture)) {
    	            	position = 14;
    	        		System.out.println("GRID 14"); }
    	            
    	            if (strRandom15.equals(usersPicture)) {
    	            	position = 15;
    	        		System.out.println("GRID 15"); }
    	            
    	            if (strRandom16.equals(usersPicture)) {
    	            	position = 16;
    	        		System.out.println("GRID 16"); }
    	              	
    	            System.out.println("Position int = " + position);
    	            //this will calculate the grid location of the correct GRID segment
    	           
    	            
    	            int findButtonHERE = 0;
    	            
    	            //This will calculate directions - findbuttonHere is the correct button to login.
    	            if (usersDirection.equals("North")) {
    	            	System.out.println("NORTH HAS MATCHED!");
    	            	findButtonHERE = position - 4 *usersExtra;
    	            	if (findButtonHERE == 0) {findButtonHERE = 16;} 
    	            	if (findButtonHERE== -1) {findButtonHERE = 15;}
    	            	if (findButtonHERE== -2) {findButtonHERE = 14;}
    	            	if (findButtonHERE == -3) {findButtonHERE = 13;} 
    	            	if (findButtonHERE == -4) {findButtonHERE = 12;}
    	            	if (findButtonHERE == -5) {findButtonHERE = 11;}
    	            	if (findButtonHERE == -6) {findButtonHERE = 10;}
    	            	if (findButtonHERE == -7) {findButtonHERE = 9;}
    	            	}
    	            //If the button goes off the screen too far to the east, this statement redirects it back.
    	            if (usersDirection.equals("East")) {
    	            	System.out.println("EAST HAS MATCHED!");
    	           	 findButtonHERE = position + 1;
    	           	if (findButtonHERE == 5) {findButtonHERE = 1;} 
    	        	if (findButtonHERE == 9) {findButtonHERE = 5;} 
    	        	if (findButtonHERE == 13) {findButtonHERE = 9;} 
    	        	if (findButtonHERE == 17) {findButtonHERE = 13;} 
    	           	
    	        }
    	            
    	            if (usersDirection.equals("South")) {
    	            	System.out.println("SOUTH HAS MATCHED!");
    	           	 findButtonHERE = position + 4*usersExtra;
    	           	if (findButtonHERE == 17) {findButtonHERE = 1;} 
    	        	if (findButtonHERE== 18) {findButtonHERE = 2;}
    	        	if (findButtonHERE== 19) {findButtonHERE = 3;}
    	        	if (findButtonHERE == 20) {findButtonHERE = 4;}
    	        	if (findButtonHERE == 21) {findButtonHERE = 5;} 
    	        	if (findButtonHERE== 22) {findButtonHERE = 6;}
    	        	if (findButtonHERE== 23) {findButtonHERE = 7;}
    	        	if (findButtonHERE == 24) {findButtonHERE = 8;}
    	          }
    	            
    	            if (usersDirection.equals("West")) {
    	            	System.out.println("WEST HAS MATCHED!");
    	           	 findButtonHERE = position - 1;
    	           	if (findButtonHERE == 0) {findButtonHERE = 4;}
    	           	if (findButtonHERE == 4) {findButtonHERE = 8;}
    	           	if (findButtonHERE == 8) {findButtonHERE = 12;}
    	           	if (findButtonHERE == 12) {findButtonHERE = 16;}
    	           	
    	            }
    	            
    	            if (usersDirection.equals("NW")) {
    	            	System.out.println("NW HAS MATCHED!");
    	           	 findButtonHERE = position - 5;
    	           	if (findButtonHERE == 0) {findButtonHERE = 16;}
	            	if (findButtonHERE== -1) {findButtonHERE = 15;}
	            	if (findButtonHERE== -2) {findButtonHERE = 14;}
	            	if (findButtonHERE == -3) {findButtonHERE = 13;}
	            	if (findButtonHERE == -4) {findButtonHERE = 12;}}
    	                 
    	            
    	            if (usersDirection.equals("SE")) {
    	            	System.out.println("SW HAS MATCHED!");
    	           	 findButtonHERE = position + 5;
    	           	if (findButtonHERE== 17) {findButtonHERE = 1;} 
    	        	if (findButtonHERE== 18) {findButtonHERE = 2;}
    	        	if (findButtonHERE== 19) {findButtonHERE = 3;}
    	        	if (findButtonHERE== 20) {findButtonHERE = 4;}
    	        	
    	          }
    	                      
    	          //Saves the correct choice value if the calculated value matches the button.  	       	        
    	System.out.print("(findButtonHERE): " + findButtonHERE);
    	if (findButtonHERE == this.ONE+1) {
    	            		 
    	        	   correctChoice  = this.ONE+1;
    	   		 
    	            	 }
    	           
    	           if (findButtonHERE == this.TWO+1) {
    	      		 
    	      		 correctChoice  = this.TWO+1;

    	      	 }
    	           
    	           if (findButtonHERE == this.THREE+1) {
    	      		 
    	      		 correctChoice  = this.THREE+1;
    		
    	      	 }
    	           
    	           if (findButtonHERE == this.FOUR+1) {
    	      		 
    	      		  correctChoice  = this.FOUR+1;
    	      		 
    	      		 
    	      	 }
    	           
    	           if (findButtonHERE == this.FIVE+1) {
    	      		 
    	      		  correctChoice  = this.FIVE+1;
    	      	
    	      	 }
    	           
    	           if (findButtonHERE == this.SIX+1) {
    	      		 
    	      		correctChoice  = this.SIX+1;
    	      		 

    	      	 }
    	           
    	           if (findButtonHERE == this.SEVEN+1) {
    	      		 
    	      		 correctChoice  = this.SEVEN+1;
    	      		 
    	     
    	      	 }
    	           
    	           if (findButtonHERE == this.EIGHT+1) {
    	      		 
    	      		correctChoice  = this.EIGHT+1;
    	      		 
    	      	
    	      	 }
    	           
    	           if (findButtonHERE == this.NINE+1) {
    	      		 
    	      		 correctChoice  = this.NINE+1;

    	      	 }
    	           
    	           if (findButtonHERE == this.TEN+1) {
    	      		 
    	      		correctChoice  = this.TEN+1;

    	      	 }
    	           
    	           if (findButtonHERE == this.ELEVEN+1) {
    	      		 
    	      		 correctChoice  = this.ELEVEN+1;
    	 
    	      	 }
    	           
    	           if (findButtonHERE == this.TWELVE+1) {
    	      		 
    	      		 correctChoice  = this.TWELVE+1;

    	      	 }
    	           
    	           if (findButtonHERE == this.THIRTEEN+1) {
    	      		 
    	      		correctChoice  = this.THIRTEEN+1;
    	 
    	      	 }
    	           
    	           if (findButtonHERE == this.FOURTEEN+1) {
    	      		 
    	      		correctChoice  = this.FOURTEEN+1;

    	      	 }
    	           
    	           if (findButtonHERE == this.FIFTEEN+1) {
    	      		 
    	      		 correctChoice  = this.FIFTEEN+1;
    	      	
    	      	 }
    	           
    	           if (findButtonHERE == this.SIXTEEN+1) {
    	      		 
    	      		correctChoice  = this.SIXTEEN+1;
    	  
    	      	 }
    	            	
    	            
    	           
    	         System.out.println("Location of correct grid: " + correctChoice );
    	            String correctButton = null;
    	            if (correctChoice == 1) {
    	            	
    	            	correctButton = strRandom1;
    	            	
    	            }
    	     //depending on what grid it will find the randomgen button used in that grid.       
    	if (correctChoice == 1) {
    	            	
    	            	correctButton = strRandom1;    	
    	            }
    	if (correctChoice == 2) {
    		
    		correctButton = strRandom2;
    		
    	}
    	if (correctChoice == 3) {
    		
    		correctButton = strRandom3;
    		
    	}
    	if (correctChoice == 4) {
    		
    		correctButton = strRandom4;
    		
    	}
    	if (correctChoice == 5) {
    		
    		correctButton = strRandom5;
    		
    	}
    	if (correctChoice == 6) {
    		
    		correctButton = strRandom6;
    		
    	}
    	if (correctChoice == 7) {
    		
    		correctButton = strRandom7;
    		
    	}
    	if (correctChoice == 8) {
    		
    		correctButton = strRandom8;
    		
    	}
    	if (correctChoice == 9) {
    		
    		correctButton = strRandom9;
    		
    	}
    	if (correctChoice == 10) {
    		
    		correctButton = strRandom10;
    		
    	}
    	if (correctChoice == 11) {
    		
    		correctButton = strRandom11;
    		
    	}
    	if (correctChoice == 12) {
    		
    		correctButton = strRandom12;
    		
    	}
    	if (correctChoice == 13) {
    		
    		correctButton = strRandom13;
    		
    	}
    	if (correctChoice == 14) {
    		
    		correctButton = strRandom14;
    		
    	}

    	if (correctChoice == 15) {
    		
    		correctButton = strRandom15;
    		
    	}

    	if (correctChoice == 16) {
    		
    		correctButton = strRandom16;
    		
    	}
    	System.out.println("The correct button in grid: " +correctChoice + ", is: " + correctButton);
    	  	

    	int i = Integer.parseInt(correctButton);

        //Saves correct choice into class.
    	this.CORRECT = i;

    	System.out.println("CORRECT BUTTON : " + this.CORRECT);
    					
                //If the user selects the correct option, successful login will occur.
    			if (selected == this.CORRECT) {
    				
    				JOptionPane.showMessageDialog(null, "CORRECT - Login Confirmed");
    				
    				
    				FXMLLoader loader =new FXMLLoader(getClass().getResource("CorrectLogin.fxml"));
    	    		Parent root=(Parent) loader.load();
    	    		CorrectController sc=loader.getController();
    	    		sc.setText(usernamefield.getText());
    	    		Stage stage=new Stage();
    	    		stage.setScene(new Scene(root));
    	    		stage.show();	
    	    		
    	    		Stage stage2 = (Stage) b1.getScene().getWindow();
  	  			  
	    		    stage2.close();
    				
    				
    				
    			}
    			//Incorrect login will close the session.
    			else {
    				
    				JOptionPane.showMessageDialog(null, "INCORRECT - Wrong Selection");
    				 Stage stage2 = (Stage) loginButton.getScene().getWindow();
    				  
    				    stage2.close();
    				    
    				    FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));
        	    		Parent root=(Parent) loader.load();
        	    		MainController sc=loader.getController();
        	    		
        	    		Stage stage=new Stage();
        	    		stage.setScene(new Scene(root));
        	    		stage.show();
    				    
    				    
    				    
    			}
    			
    	
    			
    		}
    		else {
    			
    			
    		
    			JOptionPane.showMessageDialog(null, "BUTTON INCORRECT!");
    		con.close();
    	}
    		
    	}
    	
    	
    	catch(Exception e) {System.out.print(e);
    	
    	
    	
    	}
    	
    	
    }







	
	
	
}
