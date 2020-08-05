package project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PasswordResetController {

    @FXML
    private TextField passwordTEXT;

    @FXML
    private TextField usernameTEXT;
    
    @FXML
    private TextField PinTEXT;

    @FXML
    private Button DoneButton;

    @FXML
    private Button EXIT;
    
    
    @FXML
    void DoneButtonPressed(ActionEvent event) throws IOException {

//Checks login information.
    	String username = usernameTEXT.getText();
    	String password = passwordTEXT.getText().toString();
    	String pin = PinTEXT.getText();
    	
		Crypto crypto = new BasicCrypto();	
		username = new String(crypto.encrypt(username.getBytes()));	
		password  = new String(crypto.encrypt(password.getBytes()));
    	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
    		Statement stmt=con.createStatement();
    		String sql="Select * from logindatabase where username= '"+username+"' and password='"+password+"' and pin='"+pin+"'";
    		ResultSet rs=stmt.executeQuery(sql);
    		if(rs.next()) {
    			JOptionPane.showMessageDialog(null, "Login Successful...");
    			
    	  //If login is correct, will load the reset password page.
    			FXMLLoader loader =new FXMLLoader(getClass().getResource("RedoImg.fxml"));
	    		Parent root=(Parent) loader.load();
	    		RedoImgController sc=loader.getController();
	    		sc.setText(username);
	    		Stage stage=new Stage();
	    		stage.setScene(new Scene(root));
	    		stage.show();	
 
    	    		
    	    		Stage stage2 = (Stage) DoneButton.getScene().getWindow();
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
    
    @FXML
    void EXIT(ActionEvent event) throws IOException {
FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));

		
		Parent root=(Parent) loader.load();
		
		Stage stage=new Stage();
		stage.setScene(new Scene(root));
		
		stage.show();	
    	
		 Stage stage2 = (Stage) EXIT.getScene().getWindow();
		  
		    stage2.close();

    }
    
}

