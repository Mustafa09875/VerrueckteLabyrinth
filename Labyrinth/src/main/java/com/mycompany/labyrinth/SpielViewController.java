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
    @FXML
    private Label WarningBackText;
    @FXML
    private Button Buttonzumtesten;
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
    
    
   private static KartenModel board [][]= new KartenModel[4][4];
    
    
    
    @FXML
    private ImageView ISpielKarte10;
    @FXML
    private ImageView L7SpielKarte33;
    @FXML
    private ImageView I1SpielKarte11;
    @FXML
    private ImageView L4SpielKarte41;
    @FXML
    private ImageView I4SpielKarte42;
    @FXML
    private ImageView TSpielKarte20;
    @FXML
    private ImageView L6SpielKarte13;
    @FXML
    private ImageView L5SpielKarte32;
    @FXML
    private ImageView T1SpielKarte30;
    @FXML
    private ImageView I2SpielKarte31;
    @FXML
    private ImageView I7SpielKarte34;
    @FXML
    private ImageView I6SpielKarte43;
    @FXML
    private ImageView L1SpielKarte40;
    @FXML
    private ImageView LSpielKarte00;
    @FXML
    private ImageView L2SpielKarte01;
    @FXML
    private ImageView L3SpielKarte21;
    @FXML
    private ImageView I3SpielKarte22;
    @FXML
    private ImageView I5SpielKarte03;
    @FXML
    private ImageView T2SpielKarte;
    @FXML
    private ImageView L9SpielKarte24;
    @FXML
    private ImageView T4SpielKarte23;
    @FXML
    private ImageView t5SpielKarte14;
    @FXML
    private ImageView T2SpielKarte02;
    @FXML
    private ImageView T3SpielKarte12;
    @FXML
    private ImageView L10SpielKarte44;
    @FXML
    private ImageView L8SpielKarte04;
  
  
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Boarderstellen();
        
        
        //App.getSpielfiguren().add(new SpielfigurGrün("Grün", 2, 3, false));
        
        
        
        
        KartenModel km = new KartenModel(true, true, true, false, TSpielKarte20);      KartenModel km4 = new KartenModel(true, true, true, false, T4SpielKarte23);
        KartenModel km1 = new KartenModel(true, true, true, false, T1SpielKarte30);    KartenModel km5 = new KartenModel(true, true, true, false, t5SpielKarte14);
        KartenModel km2 = new KartenModel(true, true, true, false, T2SpielKarte02);      KartenModel km6 = new KartenModel(true, true, true, true, T2SpielKarte);
        KartenModel km3 = new KartenModel(true, true, true, false, T3SpielKarte12);    
        
        KartenModel km7 = new KartenModel(false, false, true, true, LSpielKarte00);   KartenModel km13 = new KartenModel(false, false, true, true, L6SpielKarte13);
        KartenModel km8 = new KartenModel(true, false, false, true, L1SpielKarte40);  KartenModel km14 = new KartenModel(true, true, false, false, L7SpielKarte33);
        KartenModel km9 = new KartenModel(true, true, false, false, L2SpielKarte01);  KartenModel km15 = new KartenModel(false, true, true, false, L8SpielKarte04);
        KartenModel km10 = new KartenModel(true, true, false, false, L3SpielKarte21); KartenModel km16 = new KartenModel(false, false, true, true, L9SpielKarte24);
        KartenModel km11 = new KartenModel(true, false, false, true, L4SpielKarte41); KartenModel km17 = new KartenModel(true, true, false, false, L10SpielKarte44);
        KartenModel km12 = new KartenModel(true, false, true, false, I7SpielKarte34); 
        
        
        KartenModel km18 = new KartenModel(true, false, true, false, ISpielKarte10);   KartenModel km21 = new KartenModel(true, false, true, false, I2SpielKarte31);
        KartenModel km19 = new KartenModel(true, false, true, false, I1SpielKarte11);  KartenModel km22 = new KartenModel(true, false, true, false, I3SpielKarte22);
        KartenModel km20 = new KartenModel(true, false, true, false, I4SpielKarte42);  KartenModel km23 = new KartenModel(true, false, true, false, I5SpielKarte03);
        KartenModel km24 = new KartenModel(true, false, false, true, L5SpielKarte32);  KartenModel km25 = new KartenModel(true, false, true, false, I6SpielKarte43);
       
        App.getKartenKlasse().add(km); App.getKartenKlasse().add(km1); App.getKartenKlasse().add(km2); App.getKartenKlasse().add(km3); 
        App.getKartenKlasse().add(km4); App.getKartenKlasse().add(km5); App.getKartenKlasse().add(km6); App.getKartenKlasse().add(km7);
        App.getKartenKlasse().add(km8); App.getKartenKlasse().add(km9); App.getKartenKlasse().add(km10); App.getKartenKlasse().add(km11);
        App.getKartenKlasse().add(km12); App.getKartenKlasse().add(km13); App.getKartenKlasse().add(km14); App.getKartenKlasse().add(km15); 
        App.getKartenKlasse().add(km16); App.getKartenKlasse().add(km17); App.getKartenKlasse().add(km18); App.getKartenKlasse().add(km19);
        App.getKartenKlasse().add(km20); App.getKartenKlasse().add(km21); App.getKartenKlasse().add(km22); App.getKartenKlasse().add(km23);
        App.getKartenKlasse().add(km24); App.getKartenKlasse().add(km25);
        

        WarningBackText.setVisible(false);
         
        
    }    

   private void Boarderstellen(){
        int x;
        int y;
       
        for(x=0; x<5; x++){
            for(y=0; y<5; y++){
            //App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(270); board [x][y].getKarten().setLayoutY(130);
            
            if(y==0){
               switch(x)
               {case 0: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(586); board [x][y].getKarten().setLayoutY(233);
                case 1: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(697); board [x][y].getKarten().setLayoutY(233);
                case 2: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(252); board [x][y].getKarten().setLayoutY(455);
                case 3: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(364); board [x][y].getKarten().setLayoutY(455);
                case 4: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(475); board [x][y].getKarten().setLayoutY(455); 
                    }
                }
                   else if(y==1){
                   switch(x)
                   {case 0: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(808); board [x][y].getKarten().setLayoutY(455);
                    case 1: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(475); board [x][y].getKarten().setLayoutY(677);
                    case 2: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(364); board [x][y].getKarten().setLayoutY(233);
                    case 3: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(808); board [x][y].getKarten().setLayoutY(233);
                    case 4: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(364); board [x][y].getKarten().setLayoutY(344);}
                   }
                    
                        else if(y==2){
                        switch(x)
                        {case 0: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(475); board [x][y].getKarten().setLayoutY(344);
                        case 1: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(586); board [x][y].getKarten().setLayoutY(344);
                        case 2: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(808); board [x][y].getKarten().setLayoutY(344);
                        case 3: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(697); board [x][y].getKarten().setLayoutY(455);
                        case 4: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(475); board [x][y].getKarten().setLayoutY(564);}
                         }
              
                            else if(y==3){
                            switch(x)
                            {case 0: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(586); board [x][y].getKarten().setLayoutY(564);
                            case 1: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(697); board [x][y].getKarten().setLayoutY(564);
                            case 2: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(364); board [x][y].getKarten().setLayoutY(677);
                            case 3: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(586); board [x][y].getKarten().setLayoutY(677);
                            case 4: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(475); board [x][y].getKarten().setLayoutY(233);}
                            } 
              
                                  else if(y==4){
                                  switch(x)
                                 {case 0: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(697); board [x][y].getKarten().setLayoutY(677);
                                  case 1: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(697); board [x][y].getKarten().setLayoutY(344);
                                  case 2: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(586); board [x][y].getKarten().setLayoutY(455);
                                  case 3: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(364); board [x][y].getKarten().setLayoutY(565);
                                  case 4: App.getRandomCard();board[x][y] = App.getRandomkarte(); board [x][y].getKarten().setLayoutX(808); board [x][y].getKarten().setLayoutY(564);
                                        }
                                  
                                  
                            } 
                     }
        

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
        
        

            /**if(App.getSfgelb().isClicked() == true){    
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
                 **/
    
       
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


