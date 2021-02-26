/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

/**
 *
 * @author user
 */
public class SpielFigurGelb extends SpielfigurModel {

    public SpielFigurGelb(String name, int x, int y, boolean isclicked) {
        super(name, x, y, isclicked);
    }

    public boolean statusausgeben() {
        return this.isClicked();
    }

}
