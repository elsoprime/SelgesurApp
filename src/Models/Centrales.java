/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ELSO
 */
public class Centrales extends Zonales {
    
    private int Id_Central;
    private String Central;
    private String PInstalada;
    private String PDisponible;
    private String Modo_Partida;
    private String Modo_Operacion;
    private String Puesta_Marcha;
    
    public Centrales (){
        
    }
    public Centrales (int Id, String Nombre){
        this.Id_Central = Id;
        this.Central = Nombre;
    }
    

    public int getId_Central() {
        return Id_Central;
    }

    public void setId_Central(int Id_Central) {
        this.Id_Central = Id_Central;
    }

    public String getCentral() {
        return Central;
    }

    public void setCentral(String Central) {
        this.Central = Central;
    }

    public String getPInstalada() {
        return PInstalada;
    }

    public void setPInstalada(String PInstalada) {
        this.PInstalada = PInstalada;
    }

    public String getPDisponible() {
        return PDisponible;
    }

    public void setPDisponible(String PDisponible) {
        this.PDisponible = PDisponible;
    }

    public String getModo_Partida() {
        return Modo_Partida;
    }

    public void setModo_Partida(String Modo_Partida) {
        this.Modo_Partida = Modo_Partida;
    }

    public String getModo_Operacion() {
        return Modo_Operacion;
    }

    public void setModo_Operacion(String Modo_Operacion) {
        this.Modo_Operacion = Modo_Operacion;
    }

    public String getPuesta_Marcha() {
        return Puesta_Marcha;
    }

    public void setPuesta_Marcha(String Puesta_Marcha) {
        this.Puesta_Marcha = Puesta_Marcha;
    }
    
    @Override
    public String toString(){
        return this.Central;
    }
    
}
