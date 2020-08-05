package project;

import java.io.IOException;

import java.sql.*;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController {
	//Declaring JavaFX attributes.
	 @FXML
	    private TextField text1;

	    @FXML
	    private Label WELCOME;

	    @FXML
	    private Button rulesbtn;

	    @FXML
	    private Label lable1;

	    @FXML
	    private Label lable2;

	    @FXML
	    private Button donebtn;
	    
	    @FXML
	    private PasswordField pass;
	    
	    @FXML
	    private Button passwordRecovBtn;

	//User clicks the finish button and attempts to login.    
    @FXML
    void DoneButtonPressed(ActionEvent event) throws IOException {

    	//Users input is saved into string arguments.
    	String username = text1.getText();
    	String password = pass.getText().toString();
        //Encryption occurs to protec the users information in the database.
		Crypto crypto = new BasicCrypto();
		username = new String(crypto.encrypt(username.getBytes()));
		password  = new String(crypto.encrypt(password.getBytes()));
    	 	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
    		Statement stmt=con.createStatement();
    		String sql="Select * from logindatabase where username= '"+username+"' and password='"+password+"'";
    		ResultSet rs=stmt.executeQuery(sql);
    		//Database checks if the username and password exists within the database.
    		if(rs.next()) {
    			JOptionPane.showMessageDialog(null, "Login Successful...");
    			//If the login is correct, the Graphical page will load and send the users information.
    	  
    	    	FXMLLoader loader =new FXMLLoader(getClass().getResource("GPselector.fxml"));
    	    		Parent root=(Parent) loader.load();
    	    		GPSelectorController sc=loader.getController();
    	    		sc.setText(text1.getText());

    	    		Stage stage=new Stage();
    	    		stage.setScene(new Scene(root));
    	    		stage.show();	
 
    	    		
    	    		Stage stage2 = (Stage) donebtn.getScene().getWindow();
				    stage2.close();
    			
    		}
    		  else {

    			JOptionPane.showMessageDialog(null, "INCORRECT LOGIN");
    		con.close();
    	}
    		
    	}
    	
	catch(Exception e) {System.out.print(e);
    	
    	
    	
    	}
    	
    	
    }
     //User has selected to create an account.
    @FXML
    void RulesLeftClick(ActionEvent event) throws IOException {

    	FXMLLoader loader =new FXMLLoader(getClass().getResource("CreateAccountPage.fxml"));

		
		Parent root=(Parent) loader.load();
		
		Stage stage=new Stage();
		stage.setScene(new Scene(root));
		
		stage.show();	
    	
		 Stage stage2 = (Stage) rulesbtn.getScene().getWindow();
		  
		    stage2.close();
    	
    	
    }
    //User wishes to reset their password.
    @FXML
    void RulesRightClick(ActionEvent event) throws IOException {

    	FXMLLoader loader =new FXMLLoader(getClass().getResource("PasswordPage.fxml"));

		
		Parent root=(Parent) loader.load();
		
		Stage stage=new Stage();
		stage.setScene(new Scene(root));
		
		stage.show();	
    	
		Stage stage2 = (Stage) rulesbtn.getScene().getWindow();
		  
	    stage2.close();
    	
    	
    }
    
    
    
    

}

