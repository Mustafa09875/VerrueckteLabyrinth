/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

/**
 *
 * @author ivan
 */
public class KartenModel {
    
    private int x;
    private int y;
    private boolean linkerEingang;
    private boolean obererEingang;
    private boolean rechterEingang;
    private boolean untererEingang;

    public KartenModel(int x, int y, boolean linkerEingang, boolean obererEingang, boolean rechterEingang, boolean untererEingang) {
        this.x = x;
        this.y = y;
        this.linkerEingang = linkerEingang;
        this.obererEingang = obererEingang;
        this.rechterEingang = rechterEingang;
        this.untererEingang = untererEingang;
    }
    
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
