package com.mycompany.labyrinth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static ArrayList<BelohnungModel> belohnungen;
    private static ArrayList<KartenModel> karten;
    private static ArrayList<SpielfigurModel> spielfiguren;
    
    //Setter und Getter

    public static ArrayList<BelohnungModel> getBelohnungen() {
        return belohnungen;
    }

    public static void setBelohnungen(ArrayList<BelohnungModel> belohnungen) {
        App.belohnungen = belohnungen;
    }

    public static ArrayList<KartenModel> getKarten() {
        return karten;
    }

    public static void setKarten(ArrayList<KartenModel> karten) {
        App.karten = karten;
    }

    public static ArrayList<SpielfigurModel> getSpielfiguren() {
        return spielfiguren;
    }

    public static void setSpielfiguren(ArrayList<SpielfigurModel> spielfiguren) {
        App.spielfiguren = spielfiguren;
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
        karten = new ArrayList<KartenModel>();
        spielfiguren = new ArrayList<SpielfigurModel>();
        launch();
    }

}