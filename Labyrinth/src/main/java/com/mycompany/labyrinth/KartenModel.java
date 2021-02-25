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
    
   //Eigenschaften des KartenModels
    //Die Seiten der Karten, in die der blaue Weg führtm, werden anhand von boolean werten festgelegt
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


// Diese methode ist lediglich für die Karte drassen und im Scenebuidler ist sie in eine Richtung gedreht, damit man bei rotate ganz genau festlegen kann, wie sich die Eingänge verändern müssen
    public void changeSpielkartenAusgang(){
        // Eine int Variable wird declariert
        int rotate;
        //Der getRotate Wert der Spielkarte wird dem rotate Wert zugewiesen
        rotate = (int) App.getSpielkarten().getKarten().getRotate();
        // Wenn es sich um eine T-förmige Karte handelt und die Karte um null Grad gedreht ist, dann werden die Eingänge dementsprechend festgelegt
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
        // Wenn die Karte eine Kurve ist, das heißt, sie hat 2 Eingänge, dann werden diese je nach drehung festgelegt
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
        // Wenn es sich um eine Gerade handet, gibt es  ebenfalls nur 2 Eingänge
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
        //Diese Methode ist dieselbe wie die obere Methode, doch nicht für die Karte die eingesetzt wird, sonder für alle Karten im Feld
        public void changeRandomkarteAusgang(){
        int rotate;
        rotate = (int) App.getRandomkarte().getKarten().getRotate();
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

        //Getter und Setter
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
