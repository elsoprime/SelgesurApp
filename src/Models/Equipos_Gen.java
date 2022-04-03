/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ELSO
 */
public class Equipos_Gen extends Centrales {

    private int Id_Equipo;
    private String Numero;
    private String Fabricante;
    private String Modelo;
    private String RPM;
    private String Serie_Motor;
    private String Serie_Gen;
    private String Fecha_Fabricacion;
    
    public Equipos_Gen(){
        
    }
    
    public Equipos_Gen (int Id_Equipo){
        this.Id_Equipo = Id_Equipo;
    }
        
    public int getId_Equipo() {
        return Id_Equipo;
    }

    public String getNumero() {
        return Numero;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getRPM() {
        return RPM;
    }

    public String getSerie_Motor() {
        return Serie_Motor;
    }

    public String getSerie_Gen() {
        return Serie_Gen;
    }

    public String getFecha_Fabricacion() {
        return Fecha_Fabricacion;
    }

    public void setId_Equipo(int Id_Equipo) {
        this.Id_Equipo = Id_Equipo;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setRPM(String RPM) {
        this.RPM = RPM;
    }

    public void setSerie_Motor(String Serie_Motor) {
        this.Serie_Motor = Serie_Motor;
    }

    public void setSerie_Gen(String Serie_Gen) {
        this.Serie_Gen = Serie_Gen;
    }

    public void setFecha_Fabricacion(String Fecha_Fabricacion) {
        this.Fecha_Fabricacion = Fecha_Fabricacion;
    }
    
    @Override
    public String toString(){
        return this.Numero;
    }

}
