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
public class BelohnungModel {
    
    private int punkte;
    private int x;
    private int y;
    private String name;

    public BelohnungModel(int punkte, int x, int y, String name) {
        this.punkte = punkte;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
