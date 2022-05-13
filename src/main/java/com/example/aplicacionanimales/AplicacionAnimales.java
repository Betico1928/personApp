package com.example.aplicacionanimales;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class AplicacionAnimales extends Application
{
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(AplicacionAnimales.class.getResource("interface_animals.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Super Animales!");
        stage.setScene(scene);
        stage.show();

        // Hola, mi nombre es Alberto.
    }

    public static void main(String[] args)
    {
        launch();
    }
}