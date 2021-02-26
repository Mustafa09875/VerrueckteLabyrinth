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
public abstract class SpielfigurModel {

    //Variablen
    private String name;
    private int x;
    private int y;
    private boolean isclicked;

    public SpielfigurModel(String name, int x, int y, boolean isclicked) {
        
        
        this.name = name;
        this.x = x;
        this.y = y;
        isclicked = false;

    }

    //Setter und Getter
    public boolean isClicked() {
        return isclicked;
    }

    public void setClicked(boolean clicked) {
        this.isclicked = clicked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
