/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.simple;
import Services.servicesimple;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author HP
 */
public class ConnectionUController implements Initializable {

    @FXML
    private TextField TextUsername;
    @FXML
    private Hyperlink CreateNew;
    @FXML
    private PasswordField TextPassword;
    @FXML
    private Button btnLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



@FXML 
    private void loginU(ActionEvent event)throws ClassNotFoundException, SQLException, IOException {
        boolean test=true ; 
      //  System.out.println("non");
      String ch =TextUsername.getText(); 
       String ch1= TextPassword.getText(); 
      
      // System.out.println("ch="+ch +"ch1="+ch1);
      
        if(    (ch.isEmpty()==true || ch1.isEmpty()==true ))
              //(ch == null || ch.equals("") || ch1 == null || ch1.equals("") ))
             
             {   test=false ; 
                 JOptionPane.showMessageDialog(null, "Les champs sont vides veuillez remplir tous les champs", "Echec", JOptionPane.ERROR_MESSAGE);}
               
      
      try { 
           
          servicesimple s= new servicesimple();  
            boolean ok =s.login(ch, ch1) ; 
            
           if (ok==true && test==true){
              //  System.out.println("oui");
         

         Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("GestionU.fxml")));
        stage.setScene(scene);
        stage.show();
                    
   
           }else {
               JOptionPane.showMessageDialog(null, "Vous n'êtes pas inscrit veuillez faire un compte ou verifier vos coordonnées ! ", "COMPTE INEXISTANT", JOptionPane.INFORMATION_MESSAGE) ; 
          }
            
     } catch (HeadlessException | IOException e) {
           e.printStackTrace();
        }
           
    }}

