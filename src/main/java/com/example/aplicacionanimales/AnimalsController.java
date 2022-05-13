package com.example.aplicacionanimales;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class AnimalsController implements Initializable
{
    @FXML
    ComboBox<String> comboBoxAnimales;

    @FXML
    private ImageView imageViewDeAnimales;

    @FXML
    private ImageView imageViewBoton;

    @FXML
    private Button botonAnimal;


    @FXML
    void realizarClick(ActionEvent event)
    {
        String stringAnimals = comboBoxAnimales.getSelectionModel().getSelectedItem().toString();
        if( stringAnimals == "Canario")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Canario.jpg");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        if( stringAnimals == "Gato")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Gato.png");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        if( stringAnimals == "Hamster")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Hamster.jpg");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        if( stringAnimals == "Peces")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Peces.jpg");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        if( stringAnimals == "Perro")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Perro.jpg");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        if( stringAnimals == "Shrek")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Shrek.png");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        if( stringAnimals == "Tortuga")
        {
            try
            {
                FileInputStream file = new FileInputStream("/Users/case/IdeaProjects/aplicacionAnimales/src/imagenes/Tortuga.jpg");
                Image i=new Image(file);
                imageViewDeAnimales.setImage(i);
                imageViewDeAnimales.getImage();
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        // Lista de Animales para el ComboBox
        ObservableList<String> listaDeAnimales = FXCollections.observableArrayList("Perro", "Gato", "Tortuga", "Hamster", "Peces", "Canario", "Shrek");

        // Meter datos al ComboBox
        comboBoxAnimales.setItems(listaDeAnimales);



        // ----------------- CON BOTON -------------
        botonAnimal.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Buscar Imagen");

            // Obtener la imagen seleccionada
            File imgFile = fileChooser.showOpenDialog(null);

            // Mostar la imagen
            if (imgFile != null)
            {
                Image image = new Image("file:" + imgFile.getAbsolutePath());
                imageViewBoton.setImage(image);
            }
        });
    }
}
