/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
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

    boolean statusgrün;
    boolean statusgelb;

    private static KartenModel[][] board = new KartenModel[5][5];

    private static Random randomzahl;
    @FXML
    private ImageView Rotate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        randomzahl = new Random();
        //App.getSpielfiguren().add(new SpielfigurGrün("Grün", 2, 3, false));

        KartenModel km = new KartenModel(true, true, true, true, TSpielKarte20);
        KartenModel km4 = new KartenModel(true, true, true, true, T4SpielKarte23);
        KartenModel km1 = new KartenModel(true, true, true, true, T1SpielKarte30);
        KartenModel km5 = new KartenModel(true, true, true, true, t5SpielKarte14);
        KartenModel km2 = new KartenModel(true, true, true, true, T2SpielKarte02);
        KartenModel km6 = new KartenModel(true, true, true, true, T2SpielKarte);
        KartenModel km3 = new KartenModel(true, true, true, true, T3SpielKarte12);

        KartenModel km7 = new KartenModel(true, true, true, true, LSpielKarte00);
        KartenModel km13 = new KartenModel(true, true, true, true, L6SpielKarte13);
        KartenModel km8 = new KartenModel(true, true, true, true, L1SpielKarte40);
        KartenModel km14 = new KartenModel(true, true, true, true, L7SpielKarte33);
        KartenModel km9 = new KartenModel(true, true, true, true, L2SpielKarte01);
        KartenModel km15 = new KartenModel(true, true, true, true, L8SpielKarte04);
        KartenModel km10 = new KartenModel(true, true, true, true, L3SpielKarte21);
        KartenModel km16 = new KartenModel(true, true, true, true, L9SpielKarte24);
        KartenModel km11 = new KartenModel(true, true, true, true, L4SpielKarte41);
        KartenModel km17 = new KartenModel(true, true, true, true, L10SpielKarte44);
        KartenModel km12 = new KartenModel(true, true, true, true, I7SpielKarte34);

        KartenModel km18 = new KartenModel(true, true, true, true, ISpielKarte10);
        KartenModel km21 = new KartenModel(true, true, true, true, I2SpielKarte31);
        KartenModel km19 = new KartenModel(true, true, true, true, I1SpielKarte11);
        KartenModel km22 = new KartenModel(true, true, true, true, I3SpielKarte22);
        KartenModel km20 = new KartenModel(true, true, true, true, I4SpielKarte42);
        KartenModel km23 = new KartenModel(true, true, true, true, I5SpielKarte03);
        KartenModel km24 = new KartenModel(true, true, true, true, L5SpielKarte32);
        KartenModel km25 = new KartenModel(true, true, true, true, I6SpielKarte43);

        App.getKartenKlasse().add(km);
        App.getKartenKlasse().add(km1);
        App.getKartenKlasse().add(km2);
        App.getKartenKlasse().add(km3);
        App.getKartenKlasse().add(km4);
        App.getKartenKlasse().add(km5);
        App.getKartenKlasse().add(km6);
        App.getKartenKlasse().add(km7);
        App.getKartenKlasse().add(km8);
        App.getKartenKlasse().add(km9);
        App.getKartenKlasse().add(km10);
        App.getKartenKlasse().add(km11);
        App.getKartenKlasse().add(km12);
        App.getKartenKlasse().add(km13);
        App.getKartenKlasse().add(km14);
        App.getKartenKlasse().add(km15);
        App.getKartenKlasse().add(km16);
        App.getKartenKlasse().add(km17);
        App.getKartenKlasse().add(km18);
        App.getKartenKlasse().add(km19);
        App.getKartenKlasse().add(km20);
        App.getKartenKlasse().add(km21);
        App.getKartenKlasse().add(km22);
        App.getKartenKlasse().add(km23);
        App.getKartenKlasse().add(km24);
        App.getKartenKlasse().add(km25);

        System.out.println(App.getKartenKlasse().size());

        feld();

        WarningBackText.setVisible(false);

    }

    public static void getRandomTile() {
        int grad = 0;

        /**
         * Ich erstelle eine Random methode vom Typ int und mein nextInt Gibt
         * den nächsten zufälligen, gleich verteilten Integer zurück. Alle
         * möglichen int-Werte aus meiner Arraylist getKartenKlasse.size, sowohl
         * positive als auch negative, sind in dem Bereich der Werte, die
         * zurückgegeben werden.*
         */
        int t = randomzahl.nextInt(App.getKartenKlasse().size() - 1);

        /**
         * Mit der Random Methode wird eine Zufällige Zahl zwischen 0 und 1
         * ausgesucht, ist die zahl 0, dann wird die Karte um 90 Grad gedreht,
         * ist die 2, dann...*
         */
        int nummer = new Random().nextInt(3);

        switch (nummer) {
            case 0:
                grad = 90;
                break;
            case 1:
                grad = 180;
                break;
            case 2:
                grad = 270;
                break;
            case 3:
                grad = 360;
                break;
        }

        // solange in der ArrayList nicht eine Karte übrig geblieben ist, wird...
        if (App.getKartenKlasse().size() == 1) {
        } else //Mein KartenModel(Randomkarte) wird auf die zufällige karte gesetzt, die mit get t, also eine zufällige zahl aus der ArrayList geholt
        {
            App.setRandomkarte(App.getKartenKlasse().get(t));
        }

        //Dann bekommt die Karten eine zufällige gradnummer
        App.getRandomkarte().getKarten().setRotate(grad);

        // und sie wird dann gelöscht
        App.getKartenKlasse().remove(t);

    }

    private void feld() {
        int x;
        int y;

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {

                if (y == 0) {
                    switch (x) /**
                     * mit Randomtile wird meine zufällige Karte aus der
                     * ArrayList zwischengespeichert. Dann wird diese Random
                     * Karte, das Objekt, was ich oben festgelegt habe, ins
                     * Board gespeicher und die Position wird festgelegt.
                    *
                     */
                    {
                        case 0:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(370);
                            board[x][y].getKarten().setLayoutY(230);
                            break;
                        case 1:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(475);
                            board[x][y].getKarten().setLayoutY(230);
                            break;
                        case 2:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(580);
                            board[x][y].getKarten().setLayoutY(230);
                            break;
                        case 3:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(685);
                            board[x][y].getKarten().setLayoutY(230);
                            break;
                        case 4:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(790);
                            board[x][y].getKarten().setLayoutY(230);
                            break;
                    }
                } else if (y == 1) {
                    switch (x) {
                        case 0:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(370);
                            board[x][y].getKarten().setLayoutY(335);
                            break;
                        case 1:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(475);
                            board[x][y].getKarten().setLayoutY(335);
                            break;
                        case 2:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(580);
                            board[x][y].getKarten().setLayoutY(335);
                            break;
                        case 3:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(685);
                            board[x][y].getKarten().setLayoutY(335);
                            break;
                        case 4:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(790);
                            board[x][y].getKarten().setLayoutY(335);
                    }
                    break;
                } else if (y == 2) {
                    switch (x) {
                        case 0:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(370);
                            board[x][y].getKarten().setLayoutY(440);
                            break;
                        case 1:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(475);
                            board[x][y].getKarten().setLayoutY(440);
                            break;
                        case 2:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(580);
                            board[x][y].getKarten().setLayoutY(440);
                            break;
                        case 3:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(685);
                            board[x][y].getKarten().setLayoutY(440);
                            break;
                        case 4:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(790);
                            board[x][y].getKarten().setLayoutY(440);
                    }
                    break;
                } else if (y == 3) {
                    switch (x) {
                        case 0:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(370);
                            board[x][y].getKarten().setLayoutY(545);
                            break;
                        case 1:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(475);
                            board[x][y].getKarten().setLayoutY(545);
                            break;
                        case 2:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(580);
                            board[x][y].getKarten().setLayoutY(545);
                            break;
                        case 3:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(685);
                            board[x][y].getKarten().setLayoutY(545);
                            break;
                        case 4:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(790);
                            board[x][y].getKarten().setLayoutY(545);
                    }
                    break;
                } else if (y == 4) {
                    switch (x) {
                        case 0:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(370);
                            board[x][y].getKarten().setLayoutY(650);
                            break;
                        case 1:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(475);
                            board[x][y].getKarten().setLayoutY(650);
                            break;
                        case 2:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(580);
                            board[x][y].getKarten().setLayoutY(650);
                            break;
                        case 3:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(685);
                            board[x][y].getKarten().setLayoutY(650);
                            break;
                        case 4:
                            getRandomTile();
                            board[x][y] = App.getRandomkarte();
                            board[x][y].getKarten().setLayoutX(790);
                            board[x][y].getKarten().setLayoutY(650);
                            break;
                    }

                }
            }

        }
        App.getRandomkarte().getKarten().setLayoutX(277);
        App.getRandomkarte().getKarten().setLayoutX(133);
    }

    private void grenze() {

        /**
         * Letzte Reihe unten: wird die Spielerposition y tiefer als 424 bewegt
         * und befindet er sich im x Achsenabschnitt auf 0, dann wird nicht
         * zugelassen, dass er weiter geht, indem der Spiele auf die
         * dementsprechende Position gesetzt wird.
           *
         */
        if (FigurGeld.getY() > 424 && FigurGeld.getX() == 0) {
            FigurGeld.setY(424);
            FigurGeld.setX(0);
        } else if (FigurGeld.getY() > 424 && FigurGeld.getX() == 106) {
            FigurGeld.setY(424);
            FigurGeld.setX(106);
        } else if (FigurGeld.getY() > 424 && FigurGeld.getX() == 212) {
            FigurGeld.setY(424);
            FigurGeld.setX(212);
        } else if (FigurGeld.getY() > 424 && FigurGeld.getX() == 318) {
            FigurGeld.setY(424);
            FigurGeld.setX(318);
        } else if (FigurGeld.getY() > 424 && FigurGeld.getX() == 424) {
            FigurGeld.setY(424);
            FigurGeld.setX(424);
        }

        // Nach rechts                      
        if (FigurGeld.getX() > 424 && FigurGeld.getY() == 0) {
            FigurGeld.setX(424);
            FigurGeld.setY(0);
        } else if (FigurGeld.getX() > 424 && FigurGeld.getY() == 106) {
            FigurGeld.setX(424);
            FigurGeld.setY(106);
        } else if (FigurGeld.getX() > 424 && FigurGeld.getY() == 212) {
            FigurGeld.setX(424);
            FigurGeld.setY(212);
        } else if (FigurGeld.getX() > 424 && FigurGeld.getY() == 318) {
            FigurGeld.setX(424);
            FigurGeld.setY(318);
        } else if (FigurGeld.getX() > 424 && FigurGeld.getY() == 424) {
            FigurGeld.setX(424);
            FigurGeld.setY(424);
        }

        // Nach links: wenn x kleiner als 0 wird, das heißt, ich bewege mich nach links raus, dann werde ich zurückgesetzt auf meine vorherige position.                      
        if (FigurGeld.getX() < 0 && FigurGeld.getY() == 0) {
            FigurGeld.setX(0);
            FigurGeld.setY(0);
        } else if (FigurGeld.getX() < 0 && FigurGeld.getY() == 106) {
            FigurGeld.setX(0);
            FigurGeld.setY(106);
        } else if (FigurGeld.getX() < 0 && FigurGeld.getY() == 212) {
            FigurGeld.setX(0);
            FigurGeld.setY(212);
        } else if (FigurGeld.getX() < 0 && FigurGeld.getY() == 318) {
            FigurGeld.setX(0);
            FigurGeld.setY(318);
        } else if (FigurGeld.getX() < 0 && FigurGeld.getY() == 424) {
            FigurGeld.setX(0);
            FigurGeld.setY(424);
        }

        // Nach oben                      
        if (FigurGeld.getY() < 0 && FigurGeld.getX() == 0) {
            FigurGeld.setY(0);
            FigurGeld.setX(0);
        } else if (FigurGeld.getY() < 0 && FigurGeld.getX() == 106) {
            FigurGeld.setY(0);
            FigurGeld.setX(106);
        } else if (FigurGeld.getY() < 0 && FigurGeld.getX() == 212) {
            FigurGeld.setY(0);
            FigurGeld.setX(212);
        } else if (FigurGeld.getY() < 0 && FigurGeld.getX() == 318) {
            FigurGeld.setY(0);
            FigurGeld.setX(318);
        } else if (FigurGeld.getY() < 0 && FigurGeld.getX() == 424) {
            FigurGeld.setY(0);
            FigurGeld.setX(424);
        }

        //Alles für den grünen Spiele
        
        //nach unten
        if (FigurGrün.getY() > 0 && FigurGrün.getX() == 0) {
            FigurGrün.setY(424);
            FigurGrün.setX(0);
        } else if (FigurGrün.getY() > 0 && FigurGrün.getX() == 106) {
            FigurGrün.setY(424);
            FigurGrün.setX(106);
        } else if (FigurGrün.getY() > 0 && FigurGeld.getX() == 212) {
            FigurGrün.setY(424);
            FigurGrün.setX(212);
        } else if (FigurGrün.getY() > 0 && FigurGrün.getX() == 318) {
            FigurGrün.setY(424);
            FigurGrün.setX(318);
        } else if (FigurGrün.getY() > 0 && FigurGeld.getX() == 424) {
            FigurGrün.setY(424);
            FigurGrün.setX(424);
        }

        // Nach rechts                      
        if (FigurGrün.getX() > 424 && FigurGrün.getY() == 0) {
            FigurGrün.setX(424);
            FigurGrün.setY(0);
        } else if (FigurGrün.getX() > 424 && FigurGrün.getY() == 106) {
            FigurGrün.setX(424);
            FigurGrün.setY(106);
        } else if (FigurGrün.getX() > 424 && FigurGrün.getY() == 212) {
            FigurGrün.setX(424);
            FigurGrün.setY(212);
        } else if (FigurGrün.getX() > 424 && FigurGrün.getY() == 318) {
            FigurGrün.setX(424);
            FigurGrün.setY(318);
        } else if (FigurGrün.getX() > 424 && FigurGrün.getY() == 424) {
            FigurGrün.setX(424);
            FigurGrün.setY(424);
        }

        // Nach links: wenn x kleiner als 0 wird, das heißt, ich bewege mich nach links raus, dann werde ich zurückgesetzt auf meine vorherige position.                      
        if (FigurGrün.getX() < 0 && FigurGrün.getY() == 0) {
            FigurGrün.setX(0);
            FigurGrün.setY(0);
        } else if (FigurGrün.getX() < 0 && FigurGrün.getY() == 106) {
            FigurGrün.setX(0);
            FigurGrün.setY(106);
        } else if (FigurGrün.getX() < 0 && FigurGrün.getY() == 212) {
            FigurGrün.setX(0);
            FigurGrün.setY(212);
        } else if (FigurGrün.getX() < 0 && FigurGrün.getY() == 318) {
            FigurGrün.setX(0);
            FigurGrün.setY(318);
        } else if (FigurGrün.getX() < 0 && FigurGrün.getY() == 424) {
            FigurGrün.setX(0);
            FigurGrün.setY(424);
        }

        // Nach oben                      
        if (FigurGrün.getY() < 0 && FigurGrün.getX() == 0) {
            FigurGrün.setY(0);
            FigurGrün.setX(0);
        } else if (FigurGrün.getY() < 0 && FigurGrün.getX() == 106) {
            FigurGrün.setY(0);
            FigurGrün.setX(106);
        } else if (FigurGrün.getY() < 0 && FigurGeld.getX() == 212) {
            FigurGrün.setY(0);
            FigurGrün.setX(212);
        } else if (FigurGrün.getY() < 0 && FigurGrün.getX() == 318) {
            FigurGrün.setY(0);
            FigurGrün.setX(318);
        } else if (FigurGrün.getY() < 0 && FigurGrün.getX() == 424) {
            FigurGrün.setY(0);
            FigurGrün.setX(424);
        } else {
        }
        /**
         * int x = (int) FigurGeld.getX(); int y = (int) FigurGeld.getY(); if(y
         * > 424){ switch(x){ case 0: FigurGeld.setY(424); FigurGeld.setX(0);
         * case 106: FigurGeld.setY(424); FigurGeld.setX(106); case 212:
         * FigurGeld.setY(424); FigurGeld.setX(212); case 318:
         * FigurGeld.setY(424); FigurGeld.setX(318); case 424:
         * FigurGeld.setY(424); FigurGeld.setX(424);
        }*
         */

    }

    @FXML
    private void FigurGelbClicked(MouseEvent event) {

        statusgelb = true;
        statusgrün = false;

        FigurGrün.setX(FeldGrün.getX());
        FigurGrün.setY(FeldGrün.getY());
        FigurGeld.setX(FeldGelb.getX());
        FigurGeld.setY(FeldGelb.getY());

    }

    @FXML
    private void FigurGrünClicked(MouseEvent event) {

        statusgrün = true;
        statusgelb = false;

        FigurGeld.setX(FeldGelb.getX());
        FigurGeld.setY(FeldGelb.getY());
        FigurGrün.setX(FeldGrün.getX());
        FigurGeld.setY(FeldGrün.getY());

    }

    @FXML
    private void AnchoKeyPressed(KeyEvent event) {

        // & FigurGeld.getLayoutX() <= 829 & FigurGeld.getLayoutX() >= 380 & FigurGeld.getLayoutY() <= 613 & FigurGeld.getLayoutY() <= 175
        if (statusgelb == true) {
            switch (event.getCode()) {
                case W:
                    FigurGeld.setY(FigurGeld.getY() - 106);
                    break;
                case S:
                    FigurGeld.setY(FigurGeld.getY() + 106);
                    break;
                case A:
                    FigurGeld.setX(FigurGeld.getX() - 106);
                    break;
                case D:
                    FigurGeld.setX(FigurGeld.getX() + 106);
                    break;
                default:
                    break;
            }
            grenze();
        } //  || FigurGrün.getX() < 829 || FigurGrün.getX() > 380 || FigurGrün.getY() < 613 || FigurGrün.getY() < 180
        else if (statusgrün == true) {
            switch (event.getCode()) {
                case W:
                    FigurGrün.setY(FigurGrün.getY() - 106);
                    break;
                case S:
                    FigurGrün.setY(FigurGrün.getY() + 106);
                    break;
                case A:
                    FigurGrün.setX(FigurGrün.getX() - 106);
                    break;
                case D:
                    FigurGrün.setX(FigurGrün.getX() + 106);
                    break;
                default:
                    break;
            }
            grenze();
        }
        System.out.println(FigurGeld.getX() + "X and Y " + FigurGeld.getY());
        System.out.println(FigurGrün.getX() + "X and Y " + FigurGrün.getY());

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
        WarningBackText.setVisible(true);
    }

    @FXML
    private void MouseExitedBacktoStartView(MouseEvent event) {
        WarningBackText.setVisible(false);
    }

    @FXML
    private void BtnBackToStartView(MouseEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("StartView.fxml"));

        Scene startview = BackStartView.getScene();

        root.translateYProperty().set(-1 * startview.getHeight());

        StackPane parentContainer = (StackPane) startview.getRoot();
        parentContainer.getChildren().add(root);

        root.translateYProperty().set(-1 * startview.getHeight());

        Timeline time = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(javafx.util.Duration.seconds(0.3), kv);
        time.getKeyFrames().add(kf);
        time.setOnFinished(event1 -> {
            parentContainer.getChildren().remove(Container);
        });
        time.play();

    }

}
