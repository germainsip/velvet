package org.germain.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CatalogueController implements Initializable {
    @FXML
    public ImageView displayAlb;
    @FXML
    public Label disc_title,disc_artist;
    public AnchorPane rootPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Image image = new Image(String.valueOf(getClass().getResource("pictures/Dirt.jpeg")));
        Image image = new Image("http://localhost/velvet/assets/pictures/Highway%20To%20Hell.jpeg");
        displayAlb.setImage(image);
        disc_title.setText("Dirt");
        disc_artist.setText("Alice In Chains");
        System.out.println(getClass().getResource("pictures/Dirt.jpeg"));
    }
}
