/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class StartViewController implements Initializable {

    @FXML
    private Button SpielStart;
    @FXML
    private StackPane ParentContainer;
    @FXML
    private AnchorPane Container;

    
    
    //dsffffffffffff
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
    @FXML
    private void SpielStartenBtn(ActionEvent event) throws IOException {
        /**
         * hier lesen wir als erstes unser fxml File ein. Die Datei laden wir 
         * über die Methode getResource der Klasse, welche den ClassLoader nutzt um die Resource innerhalb des ClassPath zu finden.
         */
        Parent root = FXMLLoader.load(getClass().getResource("SpielView.fxml")); 
      
        
        Scene spielstart = SpielStart.getScene();
      
      
        root.translateYProperty().set(spielstart.getHeight());
      
      
        StackPane parentContainer =  (StackPane)spielstart.getRoot();
        parentContainer.getChildren().add(root);
      
        Timeline time = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(javafx.util.Duration.seconds(0.3), kv);
        time.getKeyFrames().add(kf);
        time.setOnFinished(event1 ->{ 
            ParentContainer.getChildren().remove(Container);
        });
        
        time.play();
    }
}
    
