module com.example.aplicacionanimales {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.aplicacionanimales to javafx.fxml;
    exports com.example.aplicacionanimales;
}