package project;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RedoImgController implements Initializable{
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
    private Button doneButton;

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
    
    @FXML
    private Label DIRECTION;

    @FXML
    private Label USER;

    @FXML
    private Label PASS;
    
    
    @FXML
    private Text usernamefield;
    
    private ToggleGroup group;
    private int picture;
    
    //Displays the users information.
    @FXML
    void INFOBUTTON(ActionEvent event) {

    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
    		Statement stmt=con.createStatement();
    		String sql="Select * from logindatabase where username like '"+usernameholder.getText()+"'";
    		ResultSet rs=stmt.executeQuery(sql);	
    		
    		if(rs.next()) {
    			
    			String usersUsername = rs.getString("username");
    			String usersPassword = rs.getString("password");
    			String usersDirection = rs.getString("direction");
    		
    			Crypto crypto = new BasicCrypto();
    			String DecUser = new String(crypto.decrypt(usersUsername.getBytes()));
    			String DecPass = new String(crypto.decrypt(usersPassword.getBytes()));
    			
    			 this.USER.setText(DecUser);
    			 this.PASS.setText(DecPass);
    			 this.DIRECTION.setText(usersDirection);
    		
    		}
    	
    	
    	
    	
    	
    }
catch(Exception e) {System.out.print(e);
	
    	}
    	
    }
    
 //Selects users choice.
    public void togglebuttonChanged() {
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option1)) {
 		   
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
 		  this.picture = 1;
 		   
 	   }
 	  
 	   if (this.group.getSelectedToggle().equals(this.Option2)) {
 		  
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
 		  this.picture = 2;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option3)) {
 		   
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
 		  this.picture = 3;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option4)) {
 		
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
 		  this.picture = 4;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option5)) {
 		   
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
 		  this.picture= 5;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option6)) {
 		   
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
 		  this.picture = 6;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option7)) {
 		  
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
 		  this.picture = 7;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option8)) {
 		
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
 		  this.picture= 8;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option9)) {
 		 
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
 		  this.picture = 9;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option10)) {
 		   
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
 		  this.picture= 10;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option11)) {
 		
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
 		  this.picture = 11;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option12)) {
 		   
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
 		  this.picture = 12;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option13)) {
 		  
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
 		  this.picture = 13;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option14)) {
 		   
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
 		  this.picture= 14;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option15)) {
 		   
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
 		  this.picture = 15;
 	   }
 	   
 	   if (this.group.getSelectedToggle().equals(this.Option16)) {
 		  
 		   this.picture = 16;
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
    
    @FXML
    private Label usernameholder;

  	public void setText(String text) {
  		usernameholder.setText(text);
  		
  	}
    
    
  //User has selected a picture and wishes to change it.
    @FXML
    void DoneButtonPressed(ActionEvent event) {
    	
    	
    	
    	 try {
    	        //Changes the users image via the database
   Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
   Statement stmt=con.createStatement();
   String sql="UPDATE logindatabase SET picture='"+this.picture+"' WHERE username= '"+usernameholder.getText()+"'";
   stmt.executeUpdate(sql);
    	    		
   JOptionPane.showMessageDialog(null, "Image Changed!");
    	    		
    	    			
   FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));

	
	Parent root=(Parent) loader.load();
	
	Stage stage=new Stage();
	stage.setScene(new Scene(root));
	
	stage.show();	
    	    		 
    	    		
    	    		Stage stage2 = (Stage) doneButton.getScene().getWindow();
    				  
    			    stage2.close();
    	        			
    	        }catch(Exception e) {System.out.print(e);}
    	        	
    		
    	        	}
    
    //Toggle group of the buttons.
    @Override
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
    	
    	
   
 

	}


}
