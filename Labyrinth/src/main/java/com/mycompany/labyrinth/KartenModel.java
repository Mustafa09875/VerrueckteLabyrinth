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
    

    public KartenModel(boolean linkerEingang, boolean obererEingang, boolean rechterEingang, boolean untererEingang, ImageView karten) {
    
        this.linkerEingang = linkerEingang;
        this.obererEingang = obererEingang;
        this.rechterEingang = rechterEingang;
        this.untererEingang = untererEingang;
        this.karten = karten;
      
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
