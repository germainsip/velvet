package org.germain.gui;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.germain.App;

import java.net.URL;
import java.util.ResourceBundle;

public class CatalogueController implements Initializable {
    public ImageView displayAlb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image(String.valueOf(getClass().getResource("pictures/Drama.jpeg")));
        displayAlb.setImage(image);
        System.out.println(getClass().getResource("Dirt.jpeg"));
    }
}
