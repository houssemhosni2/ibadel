/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibadel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Ibadel extends Application {
    
     public static Stage stg;
    @Override
    public void start(Stage primaryStage) 
    {
        try {
           Ibadel.stg = primaryStage;
            FXMLLoader loader= new FXMLLoader(getClass().getResource("../GUI/Acceuil.fxml"));
            Parent root= loader.load();
            Scene scene= new Scene(root);
            primaryStage.setTitle("Ibadel");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Ibadel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

 
    
   public static void main(String[] args) {
       
        launch(args);  
     
         
      
    }
   
        
}