package project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CorrectController {
	
    @FXML
    private Text usernameplace;


	public void setText(String text) {
		usernameplace.setText(text);
		
	}
//User wishes to close the correct login page - an email is sent to their saved email notifiying them they have logged in with the time.
    @FXML
    private Button QuitButton;

    @FXML
    void QuitButtonPressed(ActionEvent event) {	

    	String username = usernameplace.getText();

		Crypto crypto = new BasicCrypto();
		username = new String(crypto.encrypt(username.getBytes()));
		
		try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/teddybase","teddy115","z9_cHiH8KdJHAPu");
    		Statement stmt=con.createStatement();
    		String sql="Select * from logindatabase where username like '"+username+"'";
    		ResultSet rs=stmt.executeQuery(sql);	
    		
    		if(rs.next()) {
	    			
	    			String usersemail = rs.getString("email");
	    			
	    			System.out.println("Email has been sent to: " + usersemail);
	    			
	    			
	    			
	    			CorrectController.sendMail(usersemail);
	    			
	    			
	    			FXMLLoader loader =new FXMLLoader(getClass().getResource("FirstPage.fxml"));

	    			
	    			Parent root=(Parent) loader.load();
	    			
	    			Stage stage=new Stage();
	    			stage.setScene(new Scene(root));
	    			
	    			stage.show();	
	    	    	
	    			 
	    			Stage stage2 = (Stage) QuitButton.getScene().getWindow();
	  			  
	    		    stage2.close();
	    		    
	    		    
	    		    
			   }
			   
			   else {
			    	JOptionPane.showMessageDialog(null, "Error sending mail and quitting.");
			    }
		
			    	        			
	   }catch(Exception e) {System.out.print(e);}
		  	
			    		
			    	        	}
	
//Function will connect to the gmail smtp and use the email below to send the message.
    public static void sendMail(String recepient) throws Exception {
	
	System.out.println("Message sent successfully.");
	Properties properties = new Properties();
	
	properties.put("mail.smtp.auth", "true");
	properties.put("mail.smtp.starttls.enable", "true");
	properties.put("mail.smtp.host", "smtp.gmail.com");
	properties.put("mail.smtp.port", "25");
	
	String myAccountEmail = "teddynecro1156@gmail.com";
	String password = "Yellow1156!";
	
	Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(myAccountEmail,password);
		}	
	});
	
	
	Message message = prepareMessage(session, myAccountEmail, recepient);
    Transport.send(message);
    System.out.println("Message sent successfully");
	
	
}
    
    //Contains the message being sent
   private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
	   
	   try {
		   
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		   
	   Message message = new MimeMessage(session);
	   message.setFrom(new InternetAddress(myAccountEmail));
	   message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
	   message.setSubject("Email Comfirmation that you have logged in correctly!");
	String htmlCode = "You have logged into your account on graphical passwords at: "+date +".";
	message.setContent(htmlCode, "text/html");
	   return message;
	   
	   }
	   
	   catch(Exception ex) {
		   Logger.getLogger(CorrectController.class.getName()).log(Level.SEVERE, null, ex);
		   
	   }
	   return null;
	   
   }
    	  
    

}
