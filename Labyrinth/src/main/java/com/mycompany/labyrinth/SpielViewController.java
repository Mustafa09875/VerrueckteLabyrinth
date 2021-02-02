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
    private Label WarningBackText;
    @FXML
    private ImageView T2SpielKarte;
    @FXML
    private ImageView I1SpielKarte;
    @FXML
    private ImageView I4SpielKarte;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TSpielKarte.setLayoutX(586);  TSpielKarte.setLayoutY(233);
        T1SpielKarte.setLayoutX(697); T1SpielKarte.setLayoutY(233);
        T2SpielKarte.setLayoutX(252); T2SpielKarte.setLayoutY(456);
        T3SpielKarte.setLayoutX(364); T3SpielKarte.setLayoutY(455);
        T4SpielKarte.setLayoutX(475); T4SpielKarte.setLayoutY(455);
        T5SpielKarte.setLayoutX(808); T5SpielKarte.setLayoutY(455);
        T6SpielKarte.setLayoutX(475); T6SpielKarte.setLayoutY(677);
        
        LSpielKarte.setLayoutX(364); LSpielKarte.setLayoutY(233);
        L1SpielKarte.setLayoutX(808); L1SpielKarte.setLayoutY(233);
        L2SpielKarte.setLayoutX(364); L2SpielKarte.setLayoutY(344);
        L3SpielKarte.setLayoutX(475); L3SpielKarte.setLayoutY(344);
        L4SpielKarte.setLayoutX(586); L4SpielKarte.setLayoutY(344);
        L5SpielKarte.setLayoutX(808); L5SpielKarte.setLayoutY(344);
        L6SpielKarte.setLayoutX(697); L6SpielKarte.setLayoutY(455);
        L7SpielKarte.setLayoutX(475); L7SpielKarte.setLayoutY(564);
        L8SpielKarte.setLayoutX(586); L8SpielKarte.setLayoutY(564);
        L9SpielKarte.setLayoutX(697); L9SpielKarte.setLayoutY(564);
        L10SpielKarte.setLayoutX(364); L10SpielKarte.setLayoutY(677);
        L11SpielKarte.setLayoutX(586); L11SpielKarte.setLayoutY(677);
        
        
        ISpielKarte.setLayoutX(475); ISpielKarte.setLayoutY(233);
        I1SpielKarte.setLayoutX(697); I1SpielKarte.setLayoutY(677);
        I2SpielKarte.setLayoutX(697); I2SpielKarte.setLayoutY(344);
        I3SpielKarte.setLayoutX(586); I3SpielKarte.setLayoutY(455);
        I4SpielKarte.setLayoutX(364); I4SpielKarte.setLayoutY(565);
        I5SpielKarte.setLayoutX(808); I5SpielKarte.setLayoutY(564);
        
        
        
        
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


      Parent root = FXMLLoader.load(getClass().getResource("StartView.fxml")); 

      
        Scene startview = BackStartView.getScene();
      

      
        root.translateYProperty().set(-1 *startview.getHeight());
      
        
        StackPane parentContainer =  (StackPane)startview.getRoot();
        parentContainer.getChildren().add(root);

      root.translateYProperty().set(-1 *startview.getHeight());
      
        Timeline time = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(javafx.util.Duration.seconds(0.3), kv);
        time.getKeyFrames().add(kf);
        time.setOnFinished(event1 ->{ 
            parentContainer.getChildren().remove(Container);});
        time.play();
        
    }

    
    
}
