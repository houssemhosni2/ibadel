/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.admin;
import Services.serviceadmin;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

//import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ConnectionAController implements Initializable {

    @FXML
    private Button btnLogin;
    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField tfPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LostPass(ActionEvent event) {
    }

    @FXML
    private void GoToCreateA(ActionEvent event) throws IOException 
    {
        FXMLLoader loader= new FXMLLoader(getClass().getResource(""));
        Parent root= loader.load();
        btnLogin.getScene().setRoot(root);
    }
}
 
