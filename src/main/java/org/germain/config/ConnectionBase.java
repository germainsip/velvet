package org.germain.config;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class ConnectionBase {
    private static final String URL = "jdbc:mysql://localhost:3306/record?serverTimezone=UTC";
    private static final String USR = "root";
    private static final String PASS = "Grm1";
    public static Connection con = null;
    public static Statement stm = null;


    public ConnectionBase() throws SQLException {
        createConnection();
        stm = con.createStatement(); }

    public void createConnection() {
        try {
            con = DriverManager.getConnection(URL, USR, PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean closeConnection(){
        boolean flag;
        try {

            con.close();
            flag=true;
        }catch (SQLException e){
            flag = false;
            System.out.println(e.getMessage());
        }
        return flag;
    }
}

