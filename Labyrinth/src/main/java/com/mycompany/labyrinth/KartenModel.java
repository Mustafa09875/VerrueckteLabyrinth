/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

import javafx.scene.image.ImageView;

/**
 *
 * @author ivan
 */
public class KartenModel {
    
   
    private boolean linkerEingang;
    private boolean obererEingang;
    private boolean rechterEingang;
    private boolean untererEingang;
    private ImageView karten;
    private String typ;
    

    public KartenModel(boolean linkerEingang, boolean obererEingang, boolean rechterEingang, boolean untererEingang, ImageView karten, String typ) {
    
        this.linkerEingang = linkerEingang;
        this.obererEingang = obererEingang;
        this.rechterEingang = rechterEingang;
        this.untererEingang = untererEingang;
        this.karten = karten;
        this.typ = typ;
        
      
    }



    public void changeSpielkartenAusgang(){
        int rotate;
        rotate = (int) App.getSpielkarten().getKarten().getRotate();
        System.out.println(rotate);
        if(this.typ == "t-foermig"){
            switch(rotate){
                case 0:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 90:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 180:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 270:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                    
            }
        }
        
        else if(this.typ == "kurve"){
            switch(rotate){
                case 0:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 90:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 180:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 270:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                    
            }
        }
        
        else if(this.typ == "gerade"){
            switch(rotate){
                case 0:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 90:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 180:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 270:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                    
            }
        }
        System.out.println(App.getSpielkarten().isLinkerEingang());
        System.out.println(App.getSpielkarten().isObererEingang());
        System.out.println(App.getSpielkarten().isRechterEingang());
        System.out.println(App.getSpielkarten().isUntererEingang());
    }
    
        public void changeRandomkarteAusgang(){
        int rotate;
        rotate = board[x][y];
        System.out.println(rotate);
        if(this.typ == "t-foermig"){
            switch(rotate){
                case 0:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 90:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 180:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 270:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                    
            }
        }
        
        else if(this.typ == "kurve"){
            switch(rotate){
                case 0:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 90:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 180:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 270:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                    
            }
        }
        
        else if(this.typ == "gerade"){
            switch(rotate){
                case 0:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 90:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                case 180:
                    App.getSpielkarten().setLinkerEingang(true);
                    App.getSpielkarten().setObererEingang(false);
                    App.getSpielkarten().setRechterEingang(true);
                    App.getSpielkarten().setUntererEingang(false);
                    break;
                case 270:
                    App.getSpielkarten().setLinkerEingang(false);
                    App.getSpielkarten().setObererEingang(true);
                    App.getSpielkarten().setRechterEingang(false);
                    App.getSpielkarten().setUntererEingang(true);
                    break;
                    
            }
        }
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
    
    public ImageView getKarten() {
        return karten;
    }

    public void setKarten(ImageView karten) {
        this.karten = karten;
    }
    
    
    public boolean isLinkerEingang() {
        return linkerEingang;
    }

    public void setLinkerEingang(boolean linkerEingang) {
        this.linkerEingang = linkerEingang;
    }

    public boolean isObererEingang() {
        return obererEingang;
    }

    public void setObererEingang(boolean obererEingang) {
        this.obererEingang = obererEingang;
    }

    public boolean isRechterEingang() {
        return rechterEingang;
    }

    public void setRechterEingang(boolean rechterEingang) {
        this.rechterEingang = rechterEingang;
    }

    public boolean isUntererEingang() {
        return untererEingang;
    }

    public void setUntererEingang(boolean untererEingang) {
        this.untererEingang = untererEingang;
    }
    
   
 
}
