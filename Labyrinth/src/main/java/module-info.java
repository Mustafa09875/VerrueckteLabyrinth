module com.mycompany.labyrinth {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.labyrinth to javafx.fxml;
    exports com.mycompany.labyrinth;
}
