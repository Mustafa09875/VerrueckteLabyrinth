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
    private static ArrayList <KartenModel> neueKartenklasse;
    
    private static KartenModel randomkarte;
    private static KartenModel spielkarten;
  
    
     private static Random random = new Random();
     
     
     

    public static ArrayList<KartenModel> getNeueKartenklasse() {
        return neueKartenklasse;
    }

    //Setter und Getter
    public static void setNeueKartenklasse(ArrayList<KartenModel> neueKartenklasse) {
        App.neueKartenklasse = neueKartenklasse;
    }

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
        return App.spielkarten;
    }

    public static void setSpielkarten(KartenModel spielkarten) {
        App.spielkarten = spielkarten;
    }
    
    
    public static void getRandomCard(){
       int grad = 0;
       int t = new Random().nextInt(App.getKartenKlasse().size());
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
        neueKartenklasse = new ArrayList <KartenModel>();
        
        
    ImageView eins = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/1-");
     ImageView zwei = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/2-");
     ImageView drei = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/3-");
     ImageView vier = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/4-");
     ImageView fünf = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/5-");
     ImageView sechs = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/6-");
     ImageView sieben = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/7-");
     ImageView acht = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/8-");
     ImageView neun = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/9-");
     ImageView zehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/10-");
     ImageView elf = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/11");
     ImageView zwölf = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/12-");
     ImageView dreizehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/13-");
     ImageView vierzehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/14-");
     ImageView fünfzehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/15-");
     ImageView sechszehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/16-");
     ImageView siebzehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/17-");
     ImageView achtzehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/18-");
     ImageView neunzehn = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/19-");
     ImageView zwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/20-");
     ImageView einundzwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/21-");
     ImageView zweiundzwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/22-");
     ImageView dreiundzwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/23-");
     ImageView vierundzwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/24-");
     ImageView fünfundzwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/25-");
     ImageView sechsundzwanzig = new ImageView("file:///C:/Users/USER/Desktop/VerrueckteLabyrinth/Labyrinth/src/main/resources/com/mycompany/labyrinth/Karten/26-");
      
        kartenKlasse = new ArrayList <KartenModel>();
        
       neueKartenklasse.add(new KartenModel(true, true, true, true, eins));
        neueKartenklasse.add(new KartenModel(true, true, true, true, zwei));
        neueKartenklasse.add(new KartenModel(true, true, true, true, drei));
        neueKartenklasse.add(new KartenModel(true, true, true, true, vier));
        neueKartenklasse.add(new KartenModel(true, true, true, true, fünf));
        neueKartenklasse.add(new KartenModel(true, true, true, true, sechs));
        neueKartenklasse.add(new KartenModel(true, true, true, true, sieben));
        neueKartenklasse.add(new KartenModel(true, true, true, true, acht));
        neueKartenklasse.add(new KartenModel(true, true, true, true, neun));
        neueKartenklasse.add(new KartenModel(true, true, true, true, zehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, elf));
        neueKartenklasse.add(new KartenModel(true, true, true, true, zwölf));
        neueKartenklasse.add(new KartenModel(true, true, true, true, dreizehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, vierzehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, fünfzehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, sechszehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, siebzehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, achtzehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, neunzehn));
        neueKartenklasse.add(new KartenModel(true, true, true, true, zwanzig));
        neueKartenklasse.add(new KartenModel(true, true, true, true, einundzwanzig));
        neueKartenklasse.add(new KartenModel(true, true, true, true, zweiundzwanzig));
        neueKartenklasse.add(new KartenModel(true, true, true, true, dreiundzwanzig));
        neueKartenklasse.add(new KartenModel(true, true, true, true, vierundzwanzig));
        neueKartenklasse.add(new KartenModel(true, true, true, true, fünfundzwanzig));
        kartenKlasse.add(new KartenModel(true, true, true, true, sechsundzwanzig));
        
       
            
        

        spielfiguren.add(new SpielfigurGrün("Grün", 2, 3, false));
        spielfiguren.add(new SpielFigurGelb("Gelb", 1, 2, false));
        
        
        launch();
    }

}