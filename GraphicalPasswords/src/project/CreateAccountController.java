package project;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


	public class CreateAccountController implements Initializable {
		
	
		//Declaring JavaFX attributes.
	    @FXML
	    private ToggleButton Option4;

	    @FXML
	    private ToggleButton Option3;

	    @FXML
	    private ToggleButton Option2;

	    @FXML
	    private ToggleButton Option1;

	    @FXML
	    private ToggleButton Option10;

	    @FXML
	    private ToggleButton Option11;

	    @FXML
	    private ToggleButton Option12;

	    @FXML
	    private ToggleButton Option13;

	    @FXML
	    private ToggleButton Option9;

	    @FXML
	    private ToggleButton Option8;

	    @FXML
	    private ToggleButton Option14;

	    @FXML
	    private ToggleButton Option7;

	    @FXML
	    private ToggleButton Option15;

	    @FXML
	    private ToggleButton Option6;

	    @FXML
	    private ToggleButton Option16;

	    @FXML
	    private ToggleButton Option5;
	    
	    private ToggleGroup group;
	    private ToggleGroup group2;
	    private ToggleGroup group3;
			
	    @FXML
	    private Label notify;
		
		@FXML
	    private TextField IDfield;


	    @FXML
	    private PasswordField CreatePASS;

	    @FXML
	    private TextField CreateUSER;
	    
	    @FXML
	    private TextField CreatePIN;

	    @FXML
	    private Button VideoButton;

	    @FXML
	    private TextField Direction;

	    @FXML
	    private Button purpleButton;

	    @FXML
	    private Button FinishButton;

	    @FXML
	    private TextField Picture;
	    
	    @FXML
	    private RadioButton North;
	    
	    @FXML
	    private RadioButton South;
	    
	    @FXML
	    private RadioButton East;
	    
	    @FXML
	    private RadioButton West;
	    
	    @FXML
	    private RadioButton NW;
	   
	    
	    @FXML
	    private RadioButton SE;
	    
	    @FXML
	    private TextField CreateEMAIL;
	    
	    @FXML
	    private RadioButton YesExtra;
	    
	    @FXML
	    private RadioButton NoExtra;
	    
	    @FXML
	    private Button EXIT;
	    
	    //Saved values of the user created.
	    String direction;
	    int picture = 0;
	    int Extra = 0;
	    
	    String username;
	    String password;
	    
	    
	    
	   //Selected choice by the user.
		public void initialize(URL location, ResourceBundle resources) {
			group = new ToggleGroup();
	    	this.Option1.setToggleGroup(group);
	    	this.Option2.setToggleGroup(group);
	    	this.Option3.setToggleGroup(group);
	    	this.Option4.setToggleGroup(group);
	    	this.Option5.setToggleGroup(group);
	    	this.Option6.setToggleGroup(group);
	    	this.Option7.setToggleGroup(group);
	    	this.Option8.setToggleGroup(group);
	    	this.Option9.setToggleGroup(group);
	    	this.Option10.setToggleGroup(group);
	    	this.Option11.setToggleGroup(group);
	    	this.Option12.setToggleGroup(group);
	    	this.Option13.setToggleGroup(group);
	    	this.Option14.setToggleGroup(group);
	    	this.Option15.setToggleGroup(group);
	    	this.Option16.setToggleGroup(group);
	    	
	    	
	    	group2 = new ToggleGroup();
	    	this.North.setToggleGroup(group2);
	    	this.South.setToggleGroup(group2);
	    	this.East.setToggleGroup(group2);
	    	this.West.setToggleGroup(group2);
	    	this.NW.setToggleGroup(group2);
	    	this.SE.setToggleGroup(group2);
	    	
	    	group3 = new ToggleGroup();
	    	this.YesExtra.setToggleGroup(group3);
	    	this.NoExtra.setToggleGroup(group3);
	  
	  
  	
	    	
		}
	    
	    
	    
	    
	    
	       
    //User clicks button to create the account.
    @FXML
    void bkButton(ActionEvent event) throws IOException {
	   
    	while (true) {
    	

    	String username = CreateUSER.getText();
    	String password = CreatePASS.getText().toString();
    	String email = CreateEMAIL.getText();
    	String pin = CreatePIN.getText();
    	
    	

		Crypto crypto = new BasicCrypto();
		//The users account information is encrypted and sent to the database.
		username = new String(crypto.encrypt(username.getBytes()));
		password  = new String(crypto.encrypt(password.getBytes()));
    	
    	Toggle dirCheck = group2.getSelectedToggle();
    		
    	
    	//Checks picture, user, pass, direction and extra is not empty.
    if (picture < 0 || CreateUSER.getText().isEmpty() || CreatePASS.getText().isEmpty() || CreatePIN.getText().isEmpty() || dirCheck == null || Extra <= 0) {
    		System.out.println("check text");
    		JOptionPane.showMessageDialog(null, "ERROR: Check all fields are not left empty!");
        	
    		break;
        }
  		//Checks directions are correct.
    	if (Extra == 2 && direction != "North" && direction != "South")	{ 
    		System.out.println("check dir");
    		JOptionPane.showMessageDialog(null, "ERROR: GRID+2 Movement is reserved for NORTH or SOUTH only!");
        
    		
    		break;
    	}
    	else {
    		
    		//SENT TO DATABASE.
        try {
        
        	Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
    		Statement stmt=con.createStatement();
    		String sql="INSERT INTO logindatabase (username, password, picture, direction, email, ExtraGrid, pin) VALUES ('"+username+"', '"+password+"', '"+picture+"', '"+direction+"', '"+email+"', '"+Extra+"', '"+pin+"')";
    		stmt.executeUpdate(sql);
    		
    		
    			JOptionPane.showMessageDialog(null, "Account Created");
    		
    			
    		con.close();
    		 
    		
    		Stage stage2 = (Stage) FinishButton.getScene().getWindow();
			  
		    stage2.close();
		    
		    FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));
    		Parent root=(Parent) loader.load();
    		MainController sc=loader.getController();
    		
    		Stage stage=new Stage();
    		stage.setScene(new Scene(root));
    		stage.show();
		    
		    break;
        			
        }catch(Exception e) {System.out.print(e);}
        	
    			}
    	}
        
    }
    //Loads the tutorial page.
    @FXML
    void LoadTut(ActionEvent event) throws IOException {
    	
        FXMLLoader loader =new FXMLLoader(getClass().getResource("VideoPage.fxml"));

		
		Parent root=(Parent) loader.load();
		Stage stage=new Stage();
		stage.setScene(new Scene(root));
		
		stage.show();	
		
		 Stage stage2 = (Stage) VideoButton.getScene().getWindow();
		  
		    stage2.close();
    	

    }
         //Selected option is saved and coloured in red.  	  
    public void togglebuttonChanged() {
	   
	   if (this.group.getSelectedToggle().equals(this.Option1)) {
		   this.notify.setText("ORANGE/BLACK");
		   Option1.setStyle("-fx-background-color: #ff0000; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 1;
		   
		   
		   
		   
		   
	   }
	  
	   if (this.group.getSelectedToggle().equals(this.Option2)) {
		   this.notify.setText("RED/BLACK");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #ff0000; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 2;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option3)) {
		   this.notify.setText("WHITE/BRIGHT GREEN");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #ff0000; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 3;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option4)) {
		   this.notify.setText("DARK PINK/PINK");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #ff0000; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 4;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option5)) {
		   this.notify.setText("DARK GREEN/BLACK");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #ff0000; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 5;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option6)) {
		   this.notify.setText("BLUE/BLACK");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #ff0000; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 6;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option7)) {
		   this.notify.setText("ORANGE/PURPLE");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #ff0000; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 7;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option8)) {
		   this.notify.setText("BLACK/WHITE SKIN");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #ff0000; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 8;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option9)) {
		   this.notify.setText("GREY/SWAMPY GREEN");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #ff0000; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 9;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option10)) {
		   this.notify.setText("RED/BLACK/GREEN");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #ff0000; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 10;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option11)) {
		   this.notify.setText("CYAN/DARK BLUE/RED");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #ff0000; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 11;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option12)) {
		   this.notify.setText("RED/BRIGHT GREEN");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #ff0000; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 12;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option13)) {
		   this.notify.setText("BRIGHT GREEN/BLUE");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #ff0000; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 13;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option14)) {
		   this.notify.setText("BLUE/PINK");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #ff0000; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 14;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option15)) {
		   this.notify.setText("YELLOW/BLUE");
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #ff0000; ");
		   Option16.setStyle("-fx-background-color: #2E2E2E; ");
		   picture = 15;
	   }
	   
	   if (this.group.getSelectedToggle().equals(this.Option16)) {
		   this.notify.setText("YELLOW/PURPLE");
		   picture = 16;
		   Option1.setStyle("-fx-background-color: #2E2E2E; ");
		   Option2.setStyle("-fx-background-color: #2E2E2E; ");
		   Option3.setStyle("-fx-background-color: #2E2E2E; ");
		   Option4.setStyle("-fx-background-color: #2E2E2E; ");
		   Option5.setStyle("-fx-background-color: #2E2E2E; ");
		   Option6.setStyle("-fx-background-color: #2E2E2E; ");
		   Option7.setStyle("-fx-background-color: #2E2E2E; ");
		   Option8.setStyle("-fx-background-color: #2E2E2E; ");
		   Option9.setStyle("-fx-background-color: #2E2E2E; ");
		   Option10.setStyle("-fx-background-color: #2E2E2E; ");
		   Option11.setStyle("-fx-background-color: #2E2E2E; ");
		   Option12.setStyle("-fx-background-color: #2E2E2E; ");
		   Option13.setStyle("-fx-background-color: #2E2E2E; ");
		   Option14.setStyle("-fx-background-color: #2E2E2E; ");
		   Option15.setStyle("-fx-background-color: #2E2E2E; ");
		   Option16.setStyle("-fx-background-color: #ff0000; ");
		   
	   }
 }
    
    //Selected direction by user.
    public void toggleDirectionbuttonChanged() {
		   
		   if (this.group2.getSelectedToggle().equals(this.North)) {
	      
	   direction = "North";
	    }
		   
		   if (this.group2.getSelectedToggle().equals(this.South)) {
			      
			   direction = "South";
			    }
		   
		   if (this.group2.getSelectedToggle().equals(this.West)) {
			      
			   direction = "West";
			    }
		   
		   if (this.group2.getSelectedToggle().equals(this.East)) {
			      
			   direction = "East";
			    }
		   
		   if (this.group2.getSelectedToggle().equals(this.NW)) {
			      
			   direction = "NW";
			    }
		   		
		   
		   if (this.group2.getSelectedToggle().equals(this.SE)) {
			      
			   direction = "SE";
			    }
		   
   
		   
    }
    
	//Selected extra grid+2 YES or NO
    public void ToggleExtra() {
    	
    	if (this.group3.getSelectedToggle().equals(this.YesExtra)) {
		      
			   Extra = 2;
			   System.out.println(Extra);
			    }
    	
    	if (this.group3.getSelectedToggle().equals(this.NoExtra)) {
		      
			   Extra = 1;
			   System.out.println(Extra);
			    }
    	
    }
    
    @FXML
    void EXIT(ActionEvent event) throws IOException {
FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));

		
		Parent root=(Parent) loader.load();
		
		Stage stage=new Stage();
		stage.setScene(new Scene(root));
		
		stage.show();	
    	
		 Stage stage2 = (Stage) FinishButton.getScene().getWindow();
		  
		    stage2.close();

    }

            
}
