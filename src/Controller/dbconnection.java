/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ELSO
 */
public class dbconnection {
    
     // Atributos de la Conexion
    private String USERNAME = "root";
    private String PASSWORD = "";
    private String HOST = "localhost";
    private String DATABASE = "dbselgesur";
    private String PORT = "3306";
    private String DRIVER = "com.mysql.cj.jdbc.Driver";
    private String TIMEZONE = "?userTimezone=true&serverTimezone=UTC";
    private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + TIMEZONE;
    Connection Conexion;
    
       // Método Constructor Conexión
    public dbconnection() {
        try {
            Class.forName(DRIVER);
            Conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException e) {

            System.out.println(" ERROR  CON LA CONEXION DEL DRIVER " + e);

        } catch (SQLException e) {

            System.out.println(" ERROR CON LA CONEXION SQL " + e);
        }
    }
    
    // Método para Cerrar la Conexión
    public void cerrarConexion(Connection Conexion) throws SQLException {
        if (Conexion != null) {
            Conexion.close();
        }
    }

    // Métodos de la Clase Conexión
    public Connection getConexion() {
        return Conexion;
    
}
    
}
