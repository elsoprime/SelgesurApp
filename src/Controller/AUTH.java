/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ELSO
 */
public class AUTH extends dbconnection {

    dbconnection Cerrar = new dbconnection();

    public boolean Auth_User(Users Usuario) {
        PreparedStatement PST = null;
        ResultSet RS = null;

        try {

            String Consulta = "SELECT U.Id_User, U.USERNAME, U.PASS, U.Id_Rol, R.Id_Rol, R.NAMEROL "
                    + "FROM Usuarios AS U "
                    + "INNER JOIN Roles AS R ON U.Id_Rol = R.Id_Rol "
                    + "WHERE USERNAME = ?";

            PST = getConexion().prepareStatement(Consulta);
            PST.setString(1, Usuario.getUsuario());
            RS = PST.executeQuery();

            if (RS.next()) {
                if (Usuario.getClave().equals(RS.getString(3))) {

                    String Update = "UPDATE Usuarios SET SESSION = ? WHERE Id_User=?";

                    PST = getConexion().prepareStatement(Update);
                    PST.setString(1, Usuario.getSesion());
                    PST.setInt(2, RS.getInt(1));
                    PST.execute();

                    /* VALIDACIÓN DE DATOS DE USUARIOS */
                    Usuario.setId(RS.getInt(1));
                    Usuario.setUsuario(RS.getString(2));
                    Usuario.setTipoUsuario(RS.getInt(5));
                    Usuario.setRol(RS.getString(6));
                    return true;

                } else {
                    return false;
                }
            }
            return false;

        } catch (SQLException e) {
            System.out.println("Error" + e);

        } finally {

            try {

                if (PST != null) {
                    PST.close();

                }
                if (RS != null) {
                    RS.close();
                }

                Cerrar.cerrarConexion(Conexion);

            } catch (SQLException e) {
                System.out.println("Error" + e);

            }
        }

        return false;
    }      
}
