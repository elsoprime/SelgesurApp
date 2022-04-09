/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ELSO
 */
import Components.Functions;
import Components.TimestampCellRenderer;
import Models.Categoria_Documentos;
import Models.Centrales;
import Models.Equipos_Gen;
import Models.Estado_Documentos;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CRUD extends dbconnection {

    /* === CONSULTAS PARA CARGAR COMBOBOX == */
    public Vector<Centrales> cargarCentrales() {
        PreparedStatement PST = null;
        ResultSet RS = null;
        Vector<Centrales> Datos = new Vector<Centrales>();
        Centrales Dat = null;

        try {
            PST = getConexion().prepareStatement("SELECT * FROM Centrales ORDER BY CENTRAL ASC");
            RS = PST.executeQuery();

            Dat = new Centrales();
            Dat.setId_Central(0);
            Dat.setCentral("SELECCIONA UNA CENTRAL");
            Datos.add(Dat);

            while (RS.next()) {
                Dat = new Centrales();
                Dat.setId_Central(RS.getInt("Id_Central"));
                Dat.setCentral(RS.getString("Central"));
                Datos.add(Dat);
            }
            RS.close();

        } catch (SQLException e) {
            System.out.println("ERROR, no se pudo Cargar Combo" + e);
        }

        return Datos;

    }

    public Vector<Equipos_Gen> cargarEquipos(Integer Id_Central) {
        PreparedStatement PST = null;
        ResultSet RS = null;
        Vector<Equipos_Gen> Datos = new Vector<Equipos_Gen>();
        Equipos_Gen Dat = null;

        try {
            PST = getConexion().prepareStatement("SELECT * FROM Equipos_Gen WHERE Id_Central= " + Id_Central);
            RS = PST.executeQuery();

            Dat = new Equipos_Gen();
            Dat.setId_Central(0);
            Dat.setNumero("SELECCIONA UN EQUIPO");
            Datos.add(Dat);

            while (RS.next()) {
                Dat = new Equipos_Gen();
                Dat.setId_Equipo(RS.getInt("Id_Equipo"));
                Dat.setNumero(RS.getString("NUMEROASIGNADO"));
                Datos.add(Dat);
            }
            RS.close();

        } catch (SQLException e) {
            System.out.println("ERROR, no se pudo Cargar Combo" + e);
        }

        return Datos;

    }

    public Vector<Estado_Documentos> cargarEstadosDocumentos(Integer Id_Estado) {
        PreparedStatement PST = null;
        ResultSet RS = null;
        Vector<Estado_Documentos> Datos = new Vector<Estado_Documentos>();
        Estado_Documentos Dat = null;

        try {
            PST = getConexion().prepareStatement("SELECT * FROM estados_documentos");
            RS = PST.executeQuery();

            Dat = new Estado_Documentos();
            Dat.setId_Estado(0);
            Dat.setEstados("SELECCIONA UN ESTADO");
            Datos.add(Dat);

            while (RS.next()) {
                Dat = new Estado_Documentos();
                Dat.setId_Estado(RS.getInt("Id_EstadoD"));
                Dat.setEstados(RS.getString("Estado"));
                Datos.add(Dat);
            }
            RS.close();

        } catch (SQLException e) {
            System.out.println("ERROR, no se pudo Cargar Combo" + e);
        }

        return Datos;

    }

    public Vector<Categoria_Documentos> cargarCatergoriaDocumentos(Integer Id_CategoriaDoc) {
        PreparedStatement PST = null;
        ResultSet RS = null;
        Vector<Categoria_Documentos> Datos = new Vector<Categoria_Documentos>();
        Categoria_Documentos Dat = null;

        try {
            PST = getConexion().prepareStatement("SELECT * FROM categoria_documento");
            RS = PST.executeQuery();

            Dat = new Categoria_Documentos();
            Dat.setId_CategoriaD(0);
            Dat.setCategorias("SELECCIONA UN TIPO DE DOCUMENTO");
            Datos.add(Dat);

            while (RS.next()) {
                Dat = new Categoria_Documentos();
                Dat.setId_CategoriaD(RS.getInt("Id_Categoria"));
                Dat.setCategorias(RS.getString("CATEGORIA"));
                Datos.add(Dat);
            }
            RS.close();

        } catch (SQLException e) {
            System.out.println("ERROR, no se pudo Cargar Combo" + e);
        }
        return Datos;
    }


    /*==== GUARDAR DATOS HACIA BD MYSQL ====*/
    public boolean guardarDocumentosT(Categoria_Documentos Documento, Estado_Documentos Estado, JPanel Panel, JTextField Texto) {
        Functions Evento = new Functions();
        PreparedStatement PST = null;
        ResultSet RS = null;
        String Mensaje = "";
        try {
            PST = getConexion().prepareCall("{CALL REGISTRAR_DOCUMENTOS (?, ?, ?, ?, ?, ?, ?, ?)}");
            PST.setString(1, Documento.getNumero());
            PST.setString(2, Documento.getDescripcion());
            PST.setDate(3, (Date) Documento.getVigencia());
            PST.setDate(4, (Date) Documento.getTermino());
            PST.setInt(5, Documento.getId_Central());
            PST.setInt(6, Documento.getId_Equipo());
            PST.setInt(7, Documento.getId_CategoriaD());
            PST.setInt(8, Estado.getId_Estado());

            RS = PST.executeQuery();
            if (RS.next()) {
                Mensaje = RS.getString(1);
                /*-- Validamos cada Sentencia If  de Nuestro PROCEDIMIENTO ALMACENADO -- */
                if (Mensaje.equals("EL DOCUMENTO INGRESADO YA SE ENCUENTRA REGISTRADO, POR FAVOR, COMPRUEBE NUEVAMENTE")) {
                    JOptionPane.showMessageDialog(null, Mensaje, "ADVERTENCIA DEL SISTEMA", JOptionPane.WARNING_MESSAGE);
                    Texto.requestFocus();
                } else {
                    /*-- En esta Sección se Ejecuta la Insercción del Registro Ejecutada en nuestro PROCEDIMIENTO ALMACENADO --*/
                    JOptionPane.showMessageDialog(null, Mensaje, "OPERACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                    Evento.DesactivarJText(Panel);
                    System.out.println(Mensaje);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERROR DEL CONTROLADOR, SI EL PROBLEMA PERSISTE CONTACTE AL ADMINISTRADOR", "CONTACTE AL ADMINISTRADOR", JOptionPane.ERROR_MESSAGE);
            }
            return true;
        } catch (SQLException e) {
            System.out.println("HA OCURRIDO UNA EXCEPCIÓN " + e);
        }

        return false;
    }

    /*===== VISTAS PARA TABLAS DE DATOS =====*/
    public boolean cargarDocumentos(JTable Tabla) {
        String[] Encabezado = {"Central", " N° Equipo", "N° Documento", "Vigencia", "Termino", "Categoria Documento", "Descripcion", "Estado"};
        String[] Fila = new String[20];

        PreparedStatement PST = null;
        ResultSet RS = null;
        try {
            DefaultTableModel Modelo = new DefaultTableModel(null, Encabezado){
                @Override
                public boolean isCellEditable(int Fila, int Columna) {
                    if (Columna==8){
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            Tabla.setModel(Modelo);
            String ConsultaTabla = "SELECT * FROM vista_documentos";
            PST = getConexion().prepareStatement(ConsultaTabla);
            RS = PST.executeQuery();
            while (RS.next()) {
                Fila[0] = RS.getString("CENTRAL");
                Fila[1] = RS.getString("NUMEROASIGNADO");
                Fila[2] = RS.getString("NUMERODOC");
                Fila[3] = RS.getString("FECHAVIGENCIA");
                Fila[4] = RS.getString("FECHATERMINO");
                Fila[5] = RS.getString("CATEGORIA");
                Fila[6] = RS.getString("DESCRIPCION");
                Fila[7] = RS.getString("ESTADO");
                Modelo.addRow(Fila);
            }
            Modelo.addRow(Fila);
            Tabla.setModel(Modelo);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(150);
            Tabla.getColumnModel().getColumn(7).setPreferredWidth(90);
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR con la Consulta " + e);
        }
        return false;
    }

    public boolean busquedaDocTabla(Categoria_Documentos Documento, JTable Tabla) {
        String[] Encabezado = {"Central", " N° Equipo", "N° Documento", "Vigencia", "Termino", "Categoria Documento", "Descripcion", "Estado"};
        String[] Fila = new String[20];

        DefaultTableModel Modelo = new DefaultTableModel(null, Encabezado){
                @Override
                public boolean isCellEditable(int Fila, int Columna) {
                    if (Columna==8){
                        return true;
                    } else {
                        return false;
                    }
                }
            };
        
        PreparedStatement PST = null;
        ResultSet RS = null;
        try {
            PST = getConexion().prepareCall("{CALL BUSQUEDA_DOCUMENTOS(?, ?)}");
            PST.setString(1, Documento.getBuscar());
            PST.setString(2, "BUSCAR_DOCUMENTO");
            RS = PST.executeQuery();
            while (RS.next()) {
                Fila[0] = RS.getString("CENTRAL");
                Fila[1] = RS.getString("NUMEROASIGNADO");
                Fila[2] = RS.getString("NUMERODOC");
                Fila[3] = RS.getString("FECHAVIGENCIA");
                Fila[4] = RS.getString("FECHATERMINO");
                Fila[5] = RS.getString("CATEGORIA");
                Fila[6] = RS.getString("DESCRIPCION");
                Fila[7] = RS.getString("ESTADO");
                Modelo.addRow(Fila);
            }
            Tabla.setModel(Modelo);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(150);
            Tabla.getColumnModel().getColumn(7).setPreferredWidth(90);
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR AL GENERAR CONSULTA, Posiblemente exista un error con el Servidor de la Base de datos " + e);
            JOptionPane.showMessageDialog(null, "ERROR CON LA BD,  Es posible que exista un error de conexión con el servidor", "Advertencia del Sistema, Contacte al Administrador del Sistema", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

}
