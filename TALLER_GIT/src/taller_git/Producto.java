/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_git;
/**
 *
 * @author jhonfcp
 */
public class Producto {

    private String nombre;
    private String descripcion;
    public void setCosto(int costo) {
               this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //HOLA OTRA VEZ
    public String getNombre() {
        return nombre;
    }
    private int costo;

    public Producto() {
    }
    
    
}
