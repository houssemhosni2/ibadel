/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CreateController implements Initializable {

    @FXML
    private Button btnNewSimple;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnNewAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void new_simp(ActionEvent event) throws IOException 
    {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("CreateSimple.fxml"));
        Parent root= loader.load();
        btnNewSimple.getScene().setRoot(root);
    }

    
    @FXML
    private void new_admin(ActionEvent event) throws IOException 
    {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("CreateA.fxml"));
        Parent root= loader.load();
        btnNewAdmin.getScene().setRoot(root);
    }
    
    @FXML
    private void cancel(ActionEvent event) throws IOException 
    {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Acceuil.fxml"));
        Parent root= loader.load();
        btnCancel.getScene().setRoot(root);
    }

    
}
