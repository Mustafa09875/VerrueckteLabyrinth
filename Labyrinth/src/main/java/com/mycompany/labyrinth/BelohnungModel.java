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

    // Die Variablen
    private int punkte;
    private String name;

    public BelohnungModel(int punkte, String name) {
        this.punkte = punkte;
        this.name = name;
    }

    // Setter und Getter
    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
