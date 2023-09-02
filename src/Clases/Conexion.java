package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

public class Conexion {

    private Connection cn;
    private Statement st;
    private ResultSet rs;

    public Conexion() {

    }

    public void conectaBD() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicas", "root", "1916");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public boolean isConnected() throws SQLException {
        return cn != null && !cn.isClosed();
    }

    public Connection getConnection() {
        return cn;
    }
    /*
    public void box(String tabla, String valor, String valor2, JComboBox c) throws Exception {
        String sql = "Select * from " + tabla;

        try {
            conectaBD();
            cn = getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] compra = new Object[2];

            while (rs.next()) {
                String nombre = rs.getString(valor);
                String id = rs.getString(valor2);
                c.addItem(nombre);
                c.putClientProperty(nombre, id);
            }

        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
    }
     */

}
