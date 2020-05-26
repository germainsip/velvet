package org.germain.DAL;

import org.germain.config.ConnectionBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiscDAO extends ConnectionBase {


    public DiscDAO() throws SQLException {
    }

    public List<Disc> List() {
        List<Disc> listeDisque = new ArrayList<>();
this.createConnection();

        try {
            ResultSet res = stm.executeQuery("SELECT disc_title, artist_name, disc_picture FROM disc d JOIN artist a ON d.artist_id = a.artist_id;");
            while (res.next()){
                String disc_title = res.getNString("disc_title");
                String artist_name = res.getString("artist_name");
                String disc_picture = res.getString("disc_picture");

                Disc disc = new Disc(disc_title,disc_picture,artist_name);
                listeDisque.add(disc);
            }
            stm.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        this.closeConnection();
        return listeDisque;
    }
}
