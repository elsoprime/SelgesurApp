/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ELSO
 */
public class Estado_Documentos extends Documentos {

    private int Id_Estado;
    private String Estados;

    public int getId_Estado() {
        return Id_Estado;
    }

    public void setId_Estado(int Id_Estado) {
        this.Id_Estado = Id_Estado;
    }

    public String getEstados() {
        return Estados;
    }

    public void setEstados(String Estados) {
        this.Estados = Estados;
    }

    @Override
    public String toString() {
        return this.Estados;
    }

}
