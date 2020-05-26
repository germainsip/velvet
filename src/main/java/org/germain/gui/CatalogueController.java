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
import org.germain.DAL.DiscDAO;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.sql.SQLException;
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
    public ComboBox<Disc> choixDisc;

    ObservableList<Disc> model = FXCollections.observableArrayList();
    ObservableList<Disc> model2 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Image image = new Image(String.valueOf(getClass().getResource("pictures/Dirt.jpeg")));
        try {
            DiscDAO listDiscDao = new DiscDAO();
            model2.addAll(listDiscDao.List());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Image image = new Image("http://localhost/velvet/assets/pictures/Highway%20To%20Hell.jpeg");
        displayAlb.setImage(image);
        disc_title.setText("Highway To Hell");
        disc_artist.setText("AC/DC");
        System.out.println(getClass().getResource("pictures/Dirt.jpeg"));
        Disc disc1 = new Disc("Fugazi","Fugazi.jpeg","Marillion");
        Disc disc2 = new Disc("Highway To Hell","Highway%20To%20Hell.jpeg","AC/DC");
        model.addAll(disc1,disc2);
       choixDisc.setItems(model2);
    }

    public void offHandle(ActionEvent mouseEvent) {
        System.exit(0);
    }

    public void changeDisc(ActionEvent actionEvent) {
        Disc discC = choixDisc.getSelectionModel().getSelectedItem();
        Image image = new Image("http://localhost/velvet/assets/pictures/"+discC.getDiscPicture());
        System.out.println(discC.getDiscPicture());
        displayAlb.setImage(image);
        disc_artist.setText(discC.getArtistName());
        disc_title.setText(discC.getDiscTitle());
    }
}
