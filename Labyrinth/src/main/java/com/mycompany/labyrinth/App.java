package com.mycompany.labyrinth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.image.ImageView;

/**
 * JavaFX App
 */
public class App extends Application {

    //ArrayListen und Objekte
    private static Scene scene;
    //Bolohnung nicht nicht im Einsatz
    private static ArrayList<BelohnungModel> belohnungen;
    //Hier werden die Bilder gespeicher
    private static ArrayList<ImageView> karten;
    //ArrayList für die zwei Spieler
    private static ArrayList<SpielfigurModel> spielfiguren;
    private static SpielFigurGelb sfgelb;
    private static SpielfigurGrün sfgrün;
    // Arraylist für das KartenModel
    private static ArrayList<KartenModel> kartenKlasse;

    //Die Karten des Feldes werden der randomkarte zugewiesen
    private static KartenModel randomkarte;
    //Die Karte die sich ausserhalb des Feles befindet und eingesetzt werden kann, wird der spielkarte zugewiesen
    private static KartenModel spielkarten;

//Getter und Setter
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

    //Scene wird gestartet
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
        // Initialisierung der ArrayListen
        belohnungen = new ArrayList<BelohnungModel>();
        karten = new ArrayList<ImageView>();
        spielfiguren = new ArrayList<SpielfigurModel>();
        kartenKlasse = new ArrayList<KartenModel>();

        spielfiguren.add(new SpielfigurGrün("Grün", 2, 3, false));
        spielfiguren.add(new SpielFigurGelb("Gelb", 1, 2, false));

        launch();
    }

}
