package org.germain.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.germain.DAL.Disc;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class CatalogueController implements Initializable {

    @FXML
    public ImageView displayAlb;
    @FXML
    public Label disc_title,disc_artist;
    @FXML
    public AnchorPane rootPane;
    @FXML
    public FontIcon off;
    @FXML
    public ComboBox choixDisc;

    ObservableList<Disc> model = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Image image = new Image(String.valueOf(getClass().getResource("pictures/Dirt.jpeg")));
        Image image = new Image("http://localhost/velvet/assets/pictures/Highway%20To%20Hell.jpeg");
        displayAlb.setImage(image);
        disc_title.setText("Highway To Hell");
        disc_artist.setText("AC/DC");
        System.out.println(getClass().getResource("pictures/Dirt.jpeg"));
        Disc disc1 = new Disc("Fugazi","Fugazi.jpeg","Marillion");
        Disc disc2 = new Disc("Highway To Hell","Highway%20To%20Hell.jpeg","AC/DC");
        model.addAll(disc1,disc2);
        choixDisc.setItems(model);
    }

    public void offHandle(ActionEvent mouseEvent) {
        System.exit(0);
    }

    public void changeDisc(ActionEvent actionEvent) {
        Disc discC = (Disc) choixDisc.getSelectionModel().getSelectedItem();
        Image image = new Image("http://localhost/velvet/assets/pictures/"+discC.getDiscPicture());
        displayAlb.setImage(image);
        disc_artist.setText(discC.getArtistName());
        disc_title.setText(discC.getDiscTitle());
    }
}
