/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
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
import javafx.stage.Stage;

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
    private static KartenModel[][] boardFuereinruecken = new KartenModel[5][5];

    private static Random randomzahl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        randomzahl = new Random();
        //App.getSpielfiguren().add(new SpielfigurGrün("Grün", 2, 3, false));

        KartenModel km = new KartenModel(true, true, true, false, TSpielKarte20, "t-foermig");
        KartenModel km4 = new KartenModel(true, true, true, false, T4SpielKarte23, "t-foermig");
        KartenModel km1 = new KartenModel(true, true, true, false, T1SpielKarte30, "t-foermig");
        KartenModel km5 = new KartenModel(true, true, true, false, t5SpielKarte14, "t-foermig");
        KartenModel km2 = new KartenModel(true, true, true, false, T2SpielKarte02, "t-foermig");
        KartenModel km6 = new KartenModel(true, true, true, false, T2SpielKarte, "t-foermig");
        KartenModel km3 = new KartenModel(true, true, true, false, T3SpielKarte12, "t-foermig");

        KartenModel km7 = new KartenModel(true, true, false, false, LSpielKarte00, "kurve");
        KartenModel km13 = new KartenModel(true, true, false, false, L6SpielKarte13, "kurve");
        KartenModel km8 = new KartenModel(true, true, false, false, L1SpielKarte40, "kurve");
        KartenModel km14 = new KartenModel(true, true, false, false, L7SpielKarte33, "kurve");
        KartenModel km9 = new KartenModel(true, true, false, false, L2SpielKarte01, "kurve");
        KartenModel km15 = new KartenModel(true, true, false, false, L8SpielKarte04, "kurve");
        KartenModel km10 = new KartenModel(true, true, false, false, L3SpielKarte21, "kurve");
        KartenModel km16 = new KartenModel(true, true, false, false, L9SpielKarte24, "kurve");
        KartenModel km11 = new KartenModel(true, true, false, false, L4SpielKarte41, "kurve");
        KartenModel km17 = new KartenModel(true, true, false, false, L10SpielKarte44, "kurve");
        KartenModel km12 = new KartenModel(true, true, false, false, I7SpielKarte34, "gerade");

        KartenModel km18 = new KartenModel(true, false, true, false, ISpielKarte10, "gerade");
        KartenModel km21 = new KartenModel(true, false, true, false, I2SpielKarte31, "gerade");
        KartenModel km19 = new KartenModel(true, false, true, false, I1SpielKarte11, "gerade");
        KartenModel km22 = new KartenModel(true, false, true, false, I3SpielKarte22, "gerade");
        KartenModel km20 = new KartenModel(true, false, true, false, I4SpielKarte42, "gerade");
        KartenModel km23 = new KartenModel(true, false, true, false, I5SpielKarte03, "gerade");
        KartenModel km24 = new KartenModel(true, false, true, false, L5SpielKarte32, "gerade");
        KartenModel km25 = new KartenModel(true, false, true, false, I6SpielKarte43, "gerade");

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
        getRandomTile();
        App.getSpielkarten().getKarten().setLayoutX(243);
        App.getSpielkarten().getKarten().setLayoutY(141);

        board[4][4].getKarten().setLayoutX(790);

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
        int t = new Random().nextInt(App.getKartenKlasse().size());

        /**
         * Mit der Random Methode wird eine Zufällige Zahl zwischen 0 und 1
         * ausgesucht, ist die zahl 0, dann wird die Karte um 90 Grad gedreht,
         * ist die 2, dann...*
         */
        int nummer = new Random().nextInt(3);
        int b = 0;

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

            //Diese eine karte wird dann als Spielkarte nach aussen gesetzt und unten in der rotation Methode zum rotieren verwendet.
            App.setSpielkarten(App.getKartenKlasse().get(t));
        } else {
            //Mein KartenModel(Randomkarte) wird auf die zufällige karte gesetzt, die mit get t, also eine zufällige zahl aus der ArrayList geholt
            App.setRandomkarte(App.getKartenKlasse().get(t));

            //Dann bekommt die Karten eine zufällige gradnummer
            App.getRandomkarte().getKarten().setRotate(grad);

            // und sie wird dann gelöscht
            App.getKartenKlasse().remove(t);

        }
        System.out.println(App.getKartenKlasse().size());
    }

    private void feld() {

        int x;
        int y;

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {

                if (y == 0) {
                    switch (x) {
                        /**
                         * mit Randomtile wird meine zufällige Karte aus der
                         * ArrayList zwischengespeichert. Dann wird diese Random
                         * Karte, das Objekt, was ich oben festgelegt habe, ins
                         * Board gespeichert und die Position wird festgelegt.
                         */

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
                            break;
                    }

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
                            break;
                    }

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
                            board[x][y].getKarten().setLayoutY(545);
                            break;
                    }

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
            FigurGrün.setY(0);
            FigurGrün.setX(0);
        } else if (FigurGrün.getY() > 0 && FigurGrün.getX() == -106) {
            FigurGrün.setY(0);
            FigurGrün.setX(-106);
        } else if (FigurGrün.getY() > 0 && FigurGrün.getX() == -212) {
            FigurGrün.setY(0);
            FigurGrün.setX(-212);
        } else if (FigurGrün.getY() > 0 && FigurGrün.getX() == -318) {
            FigurGrün.setY(0);
            FigurGrün.setX(-318);
        } else if (FigurGrün.getY() > 0 && FigurGrün.getX() == -424) {
            FigurGrün.setY(0);
            FigurGrün.setX(-424);
        }

        // Nach rechts                      
        if (FigurGrün.getX() > 0 && FigurGrün.getY() == 0) {
            FigurGrün.setX(0);
            FigurGrün.setY(0);
        } else if (FigurGrün.getX() > 0 && FigurGrün.getY() == -106) {
            FigurGrün.setX(0);
            FigurGrün.setY(-106);
        } else if (FigurGrün.getX() > 0 && FigurGrün.getY() == -212) {
            FigurGrün.setX(0);
            FigurGrün.setY(-212);
        } else if (FigurGrün.getX() > 0 && FigurGrün.getY() == -318) {
            FigurGrün.setX(0);
            FigurGrün.setY(-318);
        } else if (FigurGrün.getX() > 0 && FigurGrün.getY() == -424) {
            FigurGrün.setX(0);
            FigurGrün.setY(-424);
        }

        // Nach links: wenn x kleiner als 0 wird, das heißt, ich bewege mich nach links raus, dann werde ich zurückgesetzt auf meine vorherige position.                      
        if (FigurGrün.getX() < -424 && FigurGrün.getY() == 0) {
            FigurGrün.setX(-424);
            FigurGrün.setY(0);
        } else if (FigurGrün.getX() < -424 && FigurGrün.getY() == -106) {
            FigurGrün.setX(-424);
            FigurGrün.setY(-106);
        } else if (FigurGrün.getX() < -424 && FigurGrün.getY() == -212) {
            FigurGrün.setX(-424);
            FigurGrün.setY(-212);
        } else if (FigurGrün.getX() < -424 && FigurGrün.getY() == -318) {
            FigurGrün.setX(-424);
            FigurGrün.setY(-318);
        } else if (FigurGrün.getX() < -424 && FigurGrün.getY() == -424) {
            FigurGrün.setX(-424);
            FigurGrün.setY(-424);
        }

        // Nach oben                      
        if (FigurGrün.getY() < -424 && FigurGrün.getX() == 0) {
            FigurGrün.setY(-424);
            FigurGrün.setX(0);
        } else if (FigurGrün.getY() < -424 && FigurGrün.getX() == -106) {
            FigurGrün.setY(-424);
            FigurGrün.setX(-106);
        } else if (FigurGrün.getY() < -424 && FigurGrün.getX() == -212) {
            FigurGrün.setY(-424);
            FigurGrün.setX(-212);
        } else if (FigurGrün.getY() < -424 && FigurGrün.getX() == -318) {
            FigurGrün.setY(-424);
            FigurGrün.setX(-318);
        } else if (FigurGrün.getY() < -424 && FigurGrün.getX() == -424) {
            FigurGrün.setY(-424);
            FigurGrün.setX(-424);
        } else {
        }

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

        App.getRandomkarte().changeRandomkarteAusgang();
        App.getRandomkarte().changeSpielkartenAusgang();
        
        // & FigurGeld.getLayoutX() <= 829 & FigurGeld.getLayoutX() >= 380 & FigurGeld.getLayoutY() <= 613 & FigurGeld.getLayoutY() <= 175
        if (statusgelb == true ) {
            if(statusgelb == true && App.getRandomkarte().isLinkerEingang() == true && App.getRandomkarte().isObererEingang() == true && App.getRandomkarte().isRechterEingang() == true && App.getRandomkarte().isUntererEingang() == true){
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
            }    
                
                else if (statusgelb == true &&App.getRandomkarte().isLinkerEingang() == true && App.getRandomkarte().isObererEingang() == false && App.getRandomkarte().isRechterEingang() == false && App.getRandomkarte().isUntererEingang() == false){
                switch (event.getCode()) {
                   case A:
                    FigurGeld.setX(FigurGeld.getX() - 106);
                    break;     }
                
                    }
            
                else if (statusgelb == true &&App.getRandomkarte().isLinkerEingang() == false && App.getRandomkarte().isObererEingang() == true && App.getRandomkarte().isRechterEingang() == false && App.getRandomkarte().isUntererEingang() == false){
                switch (event.getCode()) {
                   case W:
                    FigurGeld.setY(FigurGeld.getY() - 106);
                    break;     }
                
                    }
                 else if (statusgelb == true &&App.getRandomkarte().isLinkerEingang() == false && App.getRandomkarte().isObererEingang() == false && App.getRandomkarte().isRechterEingang() == true && App.getRandomkarte().isUntererEingang() == false){
                switch (event.getCode()) {
                   case D:
                    FigurGeld.setX(FigurGeld.getX() + 106);
                    break;    }
                
                    }
                    
                    else if (statusgelb == true &&App.getRandomkarte().isLinkerEingang() == false && App.getRandomkarte().isObererEingang() == false && App.getRandomkarte().isRechterEingang() == false && App.getRandomkarte().isUntererEingang() == true){
                switch (event.getCode()) {
                   case S:
                    FigurGeld.setY(FigurGeld.getY() + 106);
                    break;    }
                
                    }
            
                     else if (statusgelb == true &&App.getRandomkarte().isLinkerEingang() == true && App.getRandomkarte().isObererEingang() == true && App.getRandomkarte().isRechterEingang() == false && App.getRandomkarte().isUntererEingang() == true){
                switch (event.getCode()) {
                  case W:
                    FigurGeld.setY(FigurGeld.getY() - 106);
                    break;   
                case A:
                    FigurGeld.setX(FigurGeld.getX() - 106);
                    break;}
                
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
        KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[4][1]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[4][1] = board[3][1];
        board[4][1].getKarten().setLayoutX(790);
        board[4][1].getKarten().setLayoutY(335);

        board[3][1] = board[2][1];
        board[3][1].getKarten().setLayoutX(685);
        board[3][1].getKarten().setLayoutY(335);

        board[2][1] = board[1][1];
        board[2][1].getKarten().setLayoutX(580);
        board[2][1].getKarten().setLayoutY(335);

        board[1][1] = board[0][1];
        board[1][1].getKarten().setLayoutX(475);
        board[1][1].getKarten().setLayoutY(335);

        board[0][1] = spielkarteKopie;
        board[0][1].getKarten().setLayoutX(370);
        board[0][1].getKarten().setLayoutY(335);

    }

    @FXML
    private void btnPOstOben(MouseEvent event) {
        
        KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[0][1]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[0][1] = board[1][1];
        board[0][1].getKarten().setLayoutX(370);
        board[0][1].getKarten().setLayoutY(335);

        board[1][1] = board[2][1];
        board[1][1].getKarten().setLayoutX(475);
        board[1][1].getKarten().setLayoutY(335);

        board[2][1] = board[3][1];
        board[2][1].getKarten().setLayoutX(580);
        board[2][1].getKarten().setLayoutY(335);

        board[3][1] = board[4][1];
        board[3][1].getKarten().setLayoutX(685);
        board[3][1].getKarten().setLayoutY(335);

        board[4][1] = spielkarteKopie;
        board[4][1].getKarten().setLayoutX(790);
        board[4][1].getKarten().setLayoutY(335);
    }

    @FXML
    private void btnPOstUnten(MouseEvent event) {
        
        KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[0][3]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[0][3] = board[1][3];
        board[0][3].getKarten().setLayoutX(370);
        board[0][3].getKarten().setLayoutY(545);

        board[1][3] = board[2][3];
        board[1][3].getKarten().setLayoutX(475);
        board[1][3].getKarten().setLayoutY(545);

        board[2][3] = board[3][3];
        board[2][3].getKarten().setLayoutX(580);
        board[2][3].getKarten().setLayoutY(545);

        board[3][3] = board[4][3];
        board[3][3].getKarten().setLayoutX(685);
        board[3][3].getKarten().setLayoutY(545);

        board[4][3] = spielkarteKopie;
        board[4][3].getKarten().setLayoutX(790);
        board[4][3].getKarten().setLayoutY(545);
    }

    @FXML
    private void btnPWestUnten(MouseEvent event) {
        
         KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[4][3]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[4][3] = board[3][3];
        board[4][3].getKarten().setLayoutX(790);
        board[4][3].getKarten().setLayoutY(545);

        board[3][3] = board[2][3];
        board[3][3].getKarten().setLayoutX(685);
        board[3][3].getKarten().setLayoutY(545);

        board[2][3] = board[1][3];
        board[2][3].getKarten().setLayoutX(580);
        board[2][3].getKarten().setLayoutY(545);

        board[1][3] = board[0][3];
        board[1][3].getKarten().setLayoutX(475);
        board[1][3].getKarten().setLayoutY(545);

        board[0][3] = spielkarteKopie;
        board[0][3].getKarten().setLayoutX(370);
        board[0][3].getKarten().setLayoutY(545);
    }

    @FXML
    private void btnPNordLinks(MouseEvent event) {
        String path = "C:\\Users\\user\\Desktop\\A\\Laser Sound Effect";

        // Eine koopie der Karte, die draußen ist, wird gemacht, um diese  als letztes nach dem die vierte
        //Karte draußen ist, wieder einzusetzen.
            KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[1][4]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[1][4] = board[1][3];
        board[1][4].getKarten().setLayoutX(475);
        board[1][4].getKarten().setLayoutY(650);

        board[1][3] = board[1][2];
        board[1][3].getKarten().setLayoutX(475);
        board[1][3].getKarten().setLayoutY(545);

        board[1][2] = board[1][1];
        board[1][2].getKarten().setLayoutX(475);
        board[1][2].getKarten().setLayoutY(440);

        board[1][1] = board[1][0];
        board[1][1].getKarten().setLayoutX(475);
        board[1][1].getKarten().setLayoutY(335);

        board[1][0] = spielkarteKopie;
        board[1][0].getKarten().setLayoutX(475);
        board[1][0].getKarten().setLayoutY(230);

    }

    @FXML
    private void btnPNordRechts(MouseEvent event) {
        KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[3][4]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[3][4] = board[3][3];
        board[3][4].getKarten().setLayoutX(685);
        board[3][4].getKarten().setLayoutY(650);

        board[3][3] = board[3][2];
        board[3][3].getKarten().setLayoutX(685);
        board[3][3].getKarten().setLayoutY(545);

        board[3][2] = board[3][1];
        board[3][2].getKarten().setLayoutX(685);
        board[3][2].getKarten().setLayoutY(440);

        board[3][1] = board[3][0];
        board[3][1].getKarten().setLayoutX(685);
        board[3][1].getKarten().setLayoutY(335);

        board[3][0] = spielkarteKopie;
        board[3][0].getKarten().setLayoutX(685);
        board[3][0].getKarten().setLayoutY(230);


    }

    @FXML
    private void btnPSüdRechts(MouseEvent event) {
          KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[3][0]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[3][0] = board[3][1];
        board[3][0].getKarten().setLayoutX(685);
        board[3][0].getKarten().setLayoutY(230);

        board[3][1] = board[3][2];
        board[3][1].getKarten().setLayoutX(685);
        board[3][1].getKarten().setLayoutY(335);

        board[3][2] = board[3][3];
        board[3][2].getKarten().setLayoutX(685);
        board[3][2].getKarten().setLayoutY(440);

        board[3][3] = board[3][4];
        board[3][3].getKarten().setLayoutX(685);
        board[3][3].getKarten().setLayoutY(545);

        board[3][4] = spielkarteKopie;
        board[3][4].getKarten().setLayoutX(685);
        board[3][4].getKarten().setLayoutY(650);
        
    }

    @FXML
    private void btnPSüdLinks(MouseEvent event) {
        
             KartenModel spielkarteKopie = App.getSpielkarten();

        App.setSpielkarten(board[1][0]);
        App.getSpielkarten().getKarten().setX(243);
        App.getSpielkarten().getKarten().setY(141);
        

        board[1][0] = board[1][1];
        board[1][0].getKarten().setLayoutX(475);
        board[1][0].getKarten().setLayoutY(230);

        board[1][1] = board[1][2];
        board[1][1].getKarten().setLayoutX(475);
        board[1][1].getKarten().setLayoutY(335);

        board[1][2] = board[1][3];
        board[1][2].getKarten().setLayoutX(475);
        board[1][2].getKarten().setLayoutY(440);

        board[1][3] = board[1][4];
        board[1][3].getKarten().setLayoutX(475);
        board[1][3].getKarten().setLayoutY(545);

        board[1][4] = spielkarteKopie;
        board[1][4].getKarten().setLayoutX(475);
        board[1][4].getKarten().setLayoutY(650);
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

    @FXML
    private void btnRotateKarte(MouseEvent event) {

        if (App.getSpielkarten().getKarten().getRotate() <= 360) {
            App.getSpielkarten().getKarten().setRotate(App.getSpielkarten().getKarten().getRotate() + 90);
        } else {
            App.getSpielkarten().getKarten().setRotate(0);
        }
    }

}
