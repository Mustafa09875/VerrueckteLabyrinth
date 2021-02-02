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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SpielViewController implements Initializable {

    @FXML
    private ImageView BackStartView;
    @FXML
    private AnchorPane Container;
    @FXML
    private ImageView FeldGrün;
    @FXML
    private ImageView FeldGelb;
    @FXML
    private ImageView FigurGeld;
    @FXML
    private ImageView FigurGrün;
    @FXML
    private ImageView ISpielKarte;
    @FXML
    private ImageView LSpielKarte;
    @FXML
    private ImageView TSpielKarte;
    @FXML
    private ImageView PWestOben;
    @FXML
    private ImageView POstOben;
    @FXML
    private ImageView POstUnten;
    @FXML
    private ImageView PWestUnten;
    @FXML
    private ImageView PNordLinks;
    @FXML
    private ImageView PNordRechts;
    @FXML
    private ImageView PSüdRechts;
    @FXML
    private ImageView PSüdLinks;
    @FXML
    private ImageView L11SpielKarte;
    @FXML
    private ImageView L9SpielKarte;
    @FXML
    private ImageView L3SpielKarte;
    @FXML
    private ImageView L5SpielKarte;
    @FXML
    private ImageView T5SpielKarte;
    @FXML
    private ImageView L7SpielKarte;
    @FXML
    private ImageView L6SpielKarte;
    @FXML
    private ImageView L8SpielKarte;
    @FXML
    private ImageView T6SpielKarte;
    @FXML
    private ImageView T1SpielKarte;
    @FXML
    private ImageView T3SpielKarte;
    @FXML
    private ImageView T4SpielKarte;
    @FXML
    private ImageView I2SpielKarte;
    @FXML
    private ImageView I6SpielKarte;
    @FXML
    private ImageView I5SpielKarte;
    @FXML
    private ImageView L1SpielKarte;
    @FXML
    private ImageView L2SpielKarte;
    @FXML
    private ImageView L4SpielKarte;
    @FXML
    private ImageView I3SpielKarte;
    @FXML
    private ImageView L12SpielKarte;
    @FXML
    private ImageView L10SpielKarte;
    @FXML
    private ImageView I4SpielKarte1;
    @FXML
    private Label WarningBackText;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        WarningBackText.setVisible(false);
        
    }    

    @FXML
    private void MouseEnteredBacktoStartView(MouseEvent event) {
         WarningBackText.setVisible(true);}
    
    @FXML
    private void MouseExitedBacktoStartView(MouseEvent event) {
        WarningBackText.setVisible(false);}

    @FXML
    private void BtnBackToStartView(MouseEvent event) throws IOException {
<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("StartView.fxml")); 
=======
      Parent root = FXMLLoader.load(getClass().getResource("StartView.fxml")); 
>>>>>>> de39a1e7617ed038aa6e3cc23f7f6349902734d3
      
        Scene startview = BackStartView.getScene();
      
<<<<<<< HEAD
      
        root.translateYProperty().set(-1 *startview.getHeight());
      
        
        StackPane parentContainer =  (StackPane)startview.getRoot();
        parentContainer.getChildren().add(root);
=======
      root.translateYProperty().set(-1 *startview.getHeight());
      
      StackPane parentContainer =  (StackPane)startview.getRoot();
      parentContainer.getChildren().add(root);
>>>>>>> de39a1e7617ed038aa6e3cc23f7f6349902734d3
              
        Timeline time = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(javafx.util.Duration.seconds(0.3), kv);
        time.getKeyFrames().add(kf);
        time.setOnFinished(event1 ->{ 
            parentContainer.getChildren().remove(Container);});
        time.play();
        
    }

    
    
}
