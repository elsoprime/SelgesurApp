/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ELSO
 */
public class Categoria_Documentos extends Documentos {

    private int Id_CategoriaD;
    private String Categorias;

    public int getId_CategoriaD() {
        return Id_CategoriaD;
    }

    public void setId_CategoriaD(int Id_CategoriaD) {
        this.Id_CategoriaD = Id_CategoriaD;
    }

    public String getCategorias() {
        return Categorias;
    }

    public void setCategorias(String Categorias) {
        this.Categorias = Categorias;
    }    
        
    @Override
    public String toString(){
        return this.Categorias;
    }

}
