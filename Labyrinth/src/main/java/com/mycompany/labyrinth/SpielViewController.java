/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
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
    private ImageView ISpielKarte;
    private ImageView LSpielKarte;
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
    private ImageView PNordRechts;
    @FXML
    private ImageView PSüdRechts;
    @FXML
    private ImageView PSüdLinks;
    private ImageView L11SpielKarte;
    private ImageView L9SpielKarte;
    private ImageView L3SpielKarte;
    private ImageView L5SpielKarte;
    private ImageView T5SpielKarte;
    private ImageView L7SpielKarte;
    private ImageView L6SpielKarte;
    private ImageView L8SpielKarte;
    private ImageView T6SpielKarte;
    private ImageView T1SpielKarte;
    private ImageView T3SpielKarte;
    private ImageView T4SpielKarte;
    private ImageView I2SpielKarte;
   
    private ImageView I5SpielKarte;
    private ImageView L1SpielKarte;
    private ImageView L2SpielKarte;
    private ImageView L4SpielKarte;
    private ImageView I3SpielKarte;
    private ImageView L10SpielKarte;
    @FXML
    private Label WarningBackText;
    @FXML
    private ImageView T2SpielKarte;
    private ImageView I1SpielKarte;
    private ImageView I4SpielKarte;
    @FXML
    private Button Buttonzumtesten;
    @FXML
    private ImageView ISpielKarte10;
    @FXML
    private ImageView L11SpielKarte24;
    @FXML
    private ImageView L9SpielKarte33;
    @FXML
    private ImageView L3SpielKarte11;
    @FXML
    private ImageView L5SpielKarte41;
    @FXML
    private ImageView T5SpielKarte42;
    @FXML
    private ImageView TSpielKarte20;
    @FXML
    private ImageView L7SpielKarte13;
    @FXML
    private ImageView L6SpielKarte32;
    @FXML
    private ImageView L8SpielKarte23;
    @FXML
    private ImageView T6SpielKarte14;
    @FXML
    private ImageView T1SpielKarte30;
    @FXML
    private ImageView T3SpielKarte02;
    @FXML
    private ImageView T4SpielKarte12;
    @FXML
    private ImageView I2SpielKarte31;
    @FXML
    private ImageView I1SpielKarte34;
    @FXML
    private ImageView I5SpielKarte43;
    @FXML
    private ImageView L1SpielKarte40;
    @FXML
    private ImageView LSpielKarte00;
    @FXML
    private ImageView L2SpielKarte01;
    @FXML
    private ImageView L4SpielKarte21;
    @FXML
    private ImageView I3SpielKarte22;
    @FXML
    private ImageView L12SpielKarte44;
    @FXML
    private ImageView L10SpielKarte04;
    @FXML
    private ImageView I4SpielKarte03;
    @FXML
    private ImageView PNordLinks;
    @FXML
    private ImageView RotateDown;
    @FXML
    private ImageView RotateRight;
    @FXML
    private ImageView RotateLeft;
    @FXML
    private ImageView RotationUp;
    
      private static KartenModel board [][]= new KartenModel[5][5];
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
      App.getKarten().add(TSpielKarte);
      App.getKarten().add(T1SpielKarte);
      App.getKarten().add(T2SpielKarte);
        
        
        App.getSpielfiguren().add(new SpielfigurGrün("Grün", 2, 3, false));
        
        KartenModel km = new KartenModel(true, true, true, true, TSpielKarte);      KartenModel km4 = new KartenModel(true, true, true, true, T4SpielKarte);
        KartenModel km1 = new KartenModel(true, true, true, true, T1SpielKarte);    KartenModel km5 = new KartenModel(true, true, true, true, T5SpielKarte);
        KartenModel km2 = new KartenModel(true, true, true, true, T2SpielKarte);    KartenModel km6 = new KartenModel(true, true, true, true, T6SpielKarte);
        KartenModel km3 = new KartenModel(true, true, true, true, T3SpielKarte);    
        
        KartenModel km7 = new KartenModel(true, true, true, true, LSpielKarte);   KartenModel km13 = new KartenModel(true, true, true, true, L6SpielKarte);
        KartenModel km8 = new KartenModel(true, true, true, true, L1SpielKarte);  KartenModel km14 = new KartenModel(true, true, true, true, L7SpielKarte);
        KartenModel km9 = new KartenModel(true, true, true, true, L2SpielKarte);  KartenModel km15 = new KartenModel(true, true, true, true, L8SpielKarte);
        KartenModel km10 = new KartenModel(true, true, true, true, L3SpielKarte); KartenModel km16 = new KartenModel(true, true, true, true, L9SpielKarte);
        KartenModel km11 = new KartenModel(true, true, true, true, L4SpielKarte); KartenModel km17 = new KartenModel(true, true, true, true, L10SpielKarte);
        KartenModel km12 = new KartenModel(true, true, true, true, L11SpielKarte);
        
        KartenModel km18 = new KartenModel(true, true, true, true, ISpielKarte);   KartenModel km21 = new KartenModel(true, true, true, true, I2SpielKarte);
        KartenModel km19 = new KartenModel(true, true, true, true, I2SpielKarte);  KartenModel km22 = new KartenModel(true, true, true, true, I3SpielKarte);
        KartenModel km20 = new KartenModel(true, true, true, true, I4SpielKarte);  KartenModel km23 = new KartenModel(true, true, true, true, I5SpielKarte);
       
        
        
      /**  TSpielKarte.setLayoutX(586);  TSpielKarte.setLayoutY(233);
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
        I5SpielKarte.setLayoutX(808); I5SpielKarte.setLayoutY(564);**/
        
        WarningBackText.setVisible(false);
        
    }    

   
    private void Createboard(){
        int x;
        int y;
        
        for(x=0; x<5; x++){
            for(y=0; y<5; y++){
           
              if(y==0){
               switch(x)
               {case 0: 
                case 1:
                case 2:
                case 3:
                case 4:}
              }
                   else if(y==1){
                   switch(x)
                   {case 0: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(586); board [x][y].getKarten().setLayoutY(233);
                    case 1:
                    case 2:
                    case 3:
                    case 4:}  
                    }
              
            }
        
<<<<<<< Updated upstream
        } 
    }
     
                
            @FXML
    private void FigurGelbClicked(MouseEvent event) {
       
              
    }

    @FXML
    private void FigurGrünClicked(MouseEvent event) {
          App.getSpielfiguren().add(new SpielfigurGrün("Grün", 2, 3, false));
          App.getSfgrün().setClicked(true);
    }

    @FXML
    private void AnchoKeyPressed(KeyEvent event) {
=======
        
        
        
        WarningBackText.setVisible(false);
>>>>>>> Stashed changes
        
            if(App.getSfgelb().isClicked() == true){    
                   switch (event.getCode()){
         case W:
                FigurGeld.setY(FigurGeld.getY() - 8);
                break;
            case S:
                FigurGeld.setY(FigurGeld.getY() + 8);
                break;
            case A:
                FigurGeld.setX(FigurGeld.getX() - 8);
                break;
            case D:
                FigurGeld.setX(FigurGeld.getX() + 8);
                break;
                  default : break;}
               }
            else if (App.getSfgrün().isClicked() == true){
                switch (event.getCode()){
              case W:
                FigurGrün.setY(FigurGrün.getY() - 8);
                break;
            case S:
                FigurGrün.setY(FigurGrün.getY() + 8);
                break;
            case A:
                FigurGrün.setX(FigurGrün.getX() - 8);
                break;
            case D:
                FigurGrün.setX(FigurGrün.getX() + 8);
                break;
            default : break;}
            }
    }
            
            
  
  

    @FXML
    private void StackPaneKeyPressed(KeyEvent event) {
    }
    
    @FXML
    private void btnPWestOben(MouseEvent event) {
    }

    @FXML
    private void btnPOstOben(MouseEvent event) {
    }

    @FXML
    private void btnPOstUnten(MouseEvent event) {
    }

    @FXML
    private void btnPWestUnten(MouseEvent event) {
    }

    @FXML
    private void btnPNordLinks(MouseEvent event) {
    }

    @FXML
    private void btnPNordRechts(MouseEvent event) {
    }

    @FXML
    private void btnPSüdRechts(MouseEvent event) {
    }

    @FXML
    private void btnPSüdLinks(MouseEvent event) {
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


