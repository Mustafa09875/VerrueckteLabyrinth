package com.mycompany.labyrinth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.ImageView;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static ArrayList<BelohnungModel> belohnungen;
    private static ArrayList<ImageView> karten;
    private static ArrayList<SpielfigurModel> spielfiguren;
    private static SpielFigurGelb sfgelb;
    private static SpielfigurGrün sfgrün;
    private static ArrayList <KartenModel> kartenKlasse;
    private static KartenModel randomkarte;
    private static KartenModel spielkarten;
  
    
     
 
    
    
    
    
    
    //Setter und Getter

    public static ArrayList<BelohnungModel> getBelohnungen() {
        return belohnungen;
    }

    public static void setBelohnungen(ArrayList<BelohnungModel> belohnungen) {
        App.belohnungen = belohnungen;
    }

    public static ArrayList<ImageView> getKarten() {
        return karten;
    }

    public static void setKarten(ArrayList<ImageView> karten) {
        App.karten = karten;
    }

    public static ArrayList<SpielfigurModel> getSpielfiguren() {
        return App.spielfiguren;
    }

    public static void setSpielfiguren(ArrayList<SpielfigurModel> spielfiguren) {
        App.spielfiguren = spielfiguren;
    }

    public static SpielFigurGelb getSfgelb() {
        return App.sfgelb;
    }

    public static void setSfgelb(SpielFigurGelb sfg) {
        App.sfgelb = sfg;
    }

    public static SpielfigurGrün getSfgrün() {
        return App.sfgrün;
    }

    public static void setSfgrün(SpielfigurGrün sfgrün) {
        App.sfgrün = sfgrün;
    }

    public static ArrayList<KartenModel> getKartenKlasse() {
        return kartenKlasse;
    }

    public static void setKartenKlasse(ArrayList<KartenModel> kartenKlasse) {
        App.kartenKlasse = kartenKlasse;
    }

    public static KartenModel getRandomkarte() {
        return randomkarte;
    }

    public static void setRandomkarte(KartenModel randomkarte) {
        App.randomkarte = randomkarte;
    }

    public static KartenModel getSpielkarten() {
        return spielkarten;
    }

    public static void setSpielkarten(KartenModel spielkarten) {
        App.spielkarten = spielkarten;
    }
    
    
    
    public static void getRandomCard(){
       int grad = 0;
       /** Ich erstelle eine Random methode vom Typ int und mein nextInt Gibt den nächsten pseudozufälligen, gleich 
        * verteilten Integer zurück. Alle möglichen int-Werte aus meiner Arraylist getKartenKlasse.size, sowohl 
        * positive als auch negative, sind in dem Bereich der Werte, die zurückgegeben werden.**/
        int t = new Random().nextInt(App.getKartenKlasse().size());
        /**
         * Mit der Random Methode wird eine Zufällige Zahl zwischen 0 und 1 ausgesucht, ist die
         * zahl 0, dann wird die Karte um 90 Grad gedreht, ist die 2, dann...
         */
        int nummer = new  Random().nextInt(3);
       switch(nummer){
              case 0: grad = 90; break;
              case 1: grad = 180; break;
              case 2: grad = 270; break;
              case 3: grad = 360; break;
        }
        if(App.getKartenKlasse().size() == 1){
            App.setSpielkarten(App.getKartenKlasse().get(t));
        }else
          App.setRandomkarte(App.getKartenKlasse().get(t));
          App.getRandomkarte().getKarten().setRotate(grad);
          App.getKartenKlasse().remove(t);

        }
    
    
    
    

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("StartView"), 1250, 900);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        belohnungen = new ArrayList<BelohnungModel>();
        karten = new ArrayList<ImageView>();
        spielfiguren = new ArrayList<SpielfigurModel>();
        kartenKlasse = new ArrayList <KartenModel>();
        
        spielfiguren.add(new SpielfigurGrün("Grün", 2, 3, false));
        spielfiguren.add(new SpielFigurGelb("Gelb", 1, 2, false));
        
        
        launch();
    }

}