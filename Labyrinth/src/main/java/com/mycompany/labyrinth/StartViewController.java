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


     /**   public static void getRandomCard(){
       int grad = 0;
       * 
       //Ich erstelle eine Random methode vom Typ int und mein nextInt Gibt den nächsten zufälligen, gleich 
        //verteilten Integer zurück. Alle möglichen int-Werte aus meiner Arraylist getKartenKlasse.size, sowohl 
        //positive als auch negative, sind in dem Bereich der Werte, die zurückgegeben werden.
        
        * int t = randomzahl.nextInt(26);
        
         //Mit der Random Methode wird eine Zufällige Zahl zwischen 0 und 1 ausgesucht, ist die
        //zahl 0, dann wird die Karte um 90 Grad gedreht, ist die 2, dann...
         
        int nummer = randomzahl.nextInt(3);
       switch(nummer){
              case 0: grad = 90; break;
              case 1: grad = 180; break;
              case 2: grad = 270; break;
              case 3: grad = 360; break;
        }
        if(App.getKartenKlasse().isEmpty()){
            App.setSpielkarten(App.getKartenKlasse().get(t));
        }else
          App.setRandomkarte(App.getKartenKlasse().get(t));
          App.getRandomkarte().getKarten().setRotate(grad);
          App.getKartenKlasse().remove(t);

        } 
           **/
    
    @FXML
    private void SpielStartenBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SpielView.fxml")); 
      
        Scene spielview = SpielStart.getScene();
      
      
        root.translateYProperty().set(spielview.getHeight());
      
      
        StackPane parentContainer =  (StackPane)spielview.getRoot();
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
    
