/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labyrinth;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class StartViewController implements Initializable {

    @FXML
   
    private Button SpielStart;
    @FXML
    //Bei Stackpane werden Elemente an derselben Position aufeinander gelegt.
    private StackPane ParentContainer;
    @FXML
    //AnchorPane hat 5 Regionen: Top, Left, Bottom, Right, center
    private AnchorPane Container;

    //dsffffffffffff
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void SpielStartenBtn(ActionEvent event) throws IOException {
        /**
         * hier lesen wir als erstes unsere fxml File ein. Die Datei laden wir
         * über die Methode getResource der Klasse, welche den ClassLoader(Ein class loader dient dazu, zur Laufzeit Klassen und Ressourcen zu laden) nutzt
         * um die Resource innerhalb des ClassPath zu finden.
         * Alle Nodes der SpielView werden geladen
         */
        Parent root = FXMLLoader.load(getClass().getResource("SpielView.fxml"));

        // Wenn der Button gedrückt wird dann wird die zweite Scene geladen, die sich erstmal unten befindet
        Scene spielview = SpielStart.getScene();

        //Der Y Wert der zweiten Scene(Spielview)entsprechend der ersten Szene(root) gleichgesetzt
        root.translateYProperty().set(spielview.getHeight());

        //Hier wird die zweite Scene in die StackPane geaddet, so sind beide Views nun in der Scene
        StackPane parentContainer = (StackPane) spielview.getRoot();
        
        //Mein View wird in den Parentcontainer geaddet und befindet sich nun in der obersten Ebene
        parentContainer.getChildren().add(root);

        // Die Animation wird erstellt. Zunächst wird ein neues Objekt der Timeline erstellt
        Timeline time = new Timeline();
        //Mit dem KeyValue wird der Y Wert der zweiten Scene, die nach oben geht, animiert. Dabei steht Ease_In für einen etwas langsamen start und dann eine schnellere Bewegung.
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        //Die Zeitdauer der Animation von kv wird festgelegt
        KeyFrame kf = new KeyFrame(javafx.util.Duration.seconds(0.3), kv);
        time.getKeyFrames().add(kf);
        //Die erste Szene wird entfernt, nachdem die Animation ferig ist
        time.setOnFinished(event1 -> {
            ParentContainer.getChildren().remove(Container);
        });
        //Animation startet
        time.play();
    }
}
