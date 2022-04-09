/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author ELSO
 */
public class Documentos extends Equipos_Gen {

    private int Id_Doc;    
    private String Numero_Doc;    
    private String Descripcion;
    private Date Vigencia;
    private Date Termino;
    private Date Ejecucion;
    private String HH_Inicio_PT;
    private String HH_Inicio_M;
    private String HH_Final_M;
    private String HH_Prueba_Vacio;
    private String HH_Carga;
    private String HH_Final_PT;
    private String Buscar;   

    public Documentos() {

    }
    
    public int getId_Doc() {
        return Id_Doc;
    }

    public void setId_Doc(int Id_Doc) {
        this.Id_Doc = Id_Doc;
    }

    
    public String getNumero_Doc() {
        return Numero_Doc;
    }

    public void setNumero_Doc(String Numero_Doc) {
        this.Numero_Doc = Numero_Doc;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getVigencia() {
        return Vigencia;
    }

    public void setVigencia(Date Vigencia) {
        this.Vigencia = Vigencia;
    }

    public Date getTermino() {
        return Termino;
    }

    public void setTermino(Date Termino) {
        this.Termino = Termino;
    }

    public Date getEjecucion() {
        return Ejecucion;
    }

    public void setEjecucion(Date Ejecucion) {
        this.Ejecucion = Ejecucion;
    }

    public String getHH_Inicio_PT() {
        return HH_Inicio_PT;
    }

    public void setHH_Inicio_PT(String HH_Inicio_PT) {
        this.HH_Inicio_PT = HH_Inicio_PT;
    }

    public String getHH_Inicio_M() {
        return HH_Inicio_M;
    }

    public void setHH_Inicio_M(String HH_Inicio_M) {
        this.HH_Inicio_M = HH_Inicio_M;
    }

    public String getHH_Final_M() {
        return HH_Final_M;
    }

    public void setHH_Final_M(String HH_Final_M) {
        this.HH_Final_M = HH_Final_M;
    }

    public String getHH_Prueba_Vacio() {
        return HH_Prueba_Vacio;
    }

    public void setHH_Prueba_Vacio(String HH_Prueba_Vacio) {
        this.HH_Prueba_Vacio = HH_Prueba_Vacio;
    }

    public String getHH_Carga() {
        return HH_Carga;
    }

    public void setHH_Carga(String HH_Carga) {
        this.HH_Carga = HH_Carga;
    }

    public String getHH_Final_PT() {
        return HH_Final_PT;
    }

    public void setHH_Final_PT(String HH_Final_PT) {
        this.HH_Final_PT = HH_Final_PT;
    }  

    public String getBuscar() {
        return Buscar;
    }

    public void setBuscar(String Buscar) {
        this.Buscar = Buscar;
    }   
}
