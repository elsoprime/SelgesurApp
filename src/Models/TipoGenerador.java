/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ELSO
 */
public class TipoGenerador extends Centrales {

    private int Id_TGen;
    private String Nombre_Gen;
    private String Descripcion_Gen;

    public int getId_TGen() {
        return Id_TGen;
    }

    public void setId_TGen(int Id_TGen) {
        this.Id_TGen = Id_TGen;
    }

    public String getNombre_Gen() {
        return Nombre_Gen;
    }

    public void setNombre_Gen(String Nombre_Gen) {
        this.Nombre_Gen = Nombre_Gen;
    }

    public String getDescripcion_Gen() {
        return Descripcion_Gen;
    }

    public void setDescripcion_Gen(String Descripcion_Gen) {
        this.Descripcion_Gen = Descripcion_Gen;
    }
    
    

}
